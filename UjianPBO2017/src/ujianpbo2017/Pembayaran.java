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

    private ArrayList<Fasilitas> alFasilitas = new ArrayList<>();

    public void addFasilitas(Fasilitas f) {
        alFasilitas.add(f);
    }

    public double hitungSemuaTagihan() {
        double total=0;
        for (Fasilitas alFasilita : alFasilitas) {
            total +=  alFasilita.hitungTagihan();
        }
        return total;
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
        USG usg = new USG();
        usg.jumPemeriksaan = 3;
        pembayaran_pasien.addFasilitas(usg);
        
        Ruang_Rawat_Inap rri = new Ruang_Rawat_Inap(231,200);
        FasilitasRuangan fr = new FasilitasRuangan(rri);
        fr.kamar = rri;
        fr.jumHari = 3;
        pembayaran_pasien.addFasilitas(fr);
        
        CT_Scan ct_scan = new CT_Scan();
        CT_Scan.jumPemeriksaan = 3;
        CT_Scan.hitungTagihan(200);
        pembayaran_pasien.addFasilitas(ct_scan);
        
        Cek_Darah cek_darah = new Cek_Darah();
        cek_darah.jumPemeriksaan = 3;
        pembayaran_pasien.addFasilitas(cek_darah);
        
        System.out.println("Tagihan Semua:"+pembayaran_pasien.hitungSemuaTagihan());
    }
}

//output:
//Tagihan Semua:4875.0