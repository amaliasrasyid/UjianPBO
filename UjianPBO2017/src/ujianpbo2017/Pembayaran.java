/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017;

import java.util.ArrayList;

/**
 *
 * @author ahmadluky
 */
public class Pembayaran {
    Pasien pasien;
    double TagihanDokter;
    double TagihanFasilitas;
    
    private ArrayList<Fasilitas> alFasilitas = new ArrayList<>();
    private ArrayList<Dokter> alDokter = new ArrayList<>();

    //lengkapi
    public void addFasilitas(Fasilitas f) {
        alFasilitas.add(f);
    }
    
    //lengapi
    public void addDokter(Dokter d){
        alDokter.add(d);
    }
    
    //lengkapi
    public double hitungDokterTagihan(){
        for (Dokter alDokte : alDokter) {
            this.TagihanDokter +=  alDokte.HitungHarga();
        }
        return this.TagihanDokter;
    }
    
    //lengkapi
    public double hitungFasilitasTagihan(){
        for (Fasilitas alFasilita : alFasilitas) {
            this.TagihanFasilitas +=  alFasilita.hitungTagihan();
        }
        return this.TagihanFasilitas;
    }
    
    //lengkapi
    public double hitungSemuaTagihan() {
        return this.TagihanDokter+this.TagihanFasilitas;
    }

    public Pembayaran(Pasien p) {
        this.pasien = p;
    }

    public static void main(String[] args) {
        Pasien pasien = new Pasien(1,"Rudi");
        Pembayaran  pembayaran_pasien = new Pembayaran(pasien);
        
        /*
         * Lengkapi fungsu main, dengan ketentuan:
         * - jumlah pemeriksaan usg = 3 kali
         * - jumlah pemeriksaan ct scan = 3 kali
         * - jumlah pemeriksaan cek darah = 3 kali
         * - asuransi:200
         * - ruang rawat inap id=231 harga=200
         */
        
        // Cotoh USG:
        System.err.println("=========================");
        USG usg = new USG();
        usg.jumPemeriksaan = 3;
        usg.print();
        pembayaran_pasien.addFasilitas(usg);
        
        CT_Scan ct_scan = new CT_Scan();
        CT_Scan.jumPemeriksaan = 3;
        CT_Scan.hitungTagihan(200);
        CT_Scan.print(200);
        pembayaran_pasien.addFasilitas(ct_scan);
        
        Cek_Darah cek_darah = new Cek_Darah();
        cek_darah.jumPemeriksaan = 3;
        cek_darah.print();
        pembayaran_pasien.addFasilitas(cek_darah);
       
        Ruang_Rawat_Inap rri = new Ruang_Rawat_Inap(231,200);
        rri.print();
        FasilitasRuangan fr = new FasilitasRuangan(rri);
        fr.kamar = rri;
        fr.jumHari = 3;
        fr.print();
        pembayaran_pasien.addFasilitas(fr);
  
        System.out.println("#Tagihan Faslilitas : "+pembayaran_pasien.hitungFasilitasTagihan());
        System.out.println("");
        
        System.out.println("=========================");
        Dokter_Spesialis ds = new Dokter_Spesialis(1, "DR. Joni", "Jantung", "04-04-2017 20:00");
        ds.awal = "04-04-2017 20:00";
        ds.akhir = "04-04-2017 20:40";
        ds.print();
        pembayaran_pasien.addDokter(ds);
        
        System.out.println("#Tagihan Docter : "+pembayaran_pasien.hitungDokterTagihan());
        System.out.println("");
        
        System.out.println("=========================");
        System.out.println("#Tagihan Semua : "+pembayaran_pasien.hitungSemuaTagihan());
    }
}

//output:
/*
|=========================|
Pemeriksaan USG - Jumlah : 3 kali , harga : 15
Pemeriksaan CT Scan - Jumlah : 3 kali , asuransi : 200, harga : 1400
Pemeriksaan Cek Darah - Jumlah : 3 kali , harga : 10
Ruangan - id ruangan : 231, harga : 200
jumlah hari :3
|=========================|
#Tagihan Faslilitas : 4875.0

|=========================|
id dokter : 1, nama : DR. Joni, waktu : 04-04-2017 20:00, spesialis : Jantung
|=========================|
#Tagihan Docter : 80000.0

#Tagihan Semua : 84875.0
*/