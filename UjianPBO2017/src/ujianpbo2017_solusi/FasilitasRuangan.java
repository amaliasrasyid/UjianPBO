/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017_solusi;

/** 
 *
 * @author ahmadluky
 */
public class FasilitasRuangan extends Fasilitas{
    Ruang_Rawat_Inap kamar;
    int jumHari;
 
    //lengkapi
    public FasilitasRuangan(Ruang_Rawat_Inap k) {
        this.kamar = k;
        String satuan = "hari";
    }
    
    //lengkapi
    @Override
    public double hitungTagihan() {
        return  kamar.harga * jumHari;
    }
    
    // lengkapi
    public void print() {
        System.out.println("jumlah hari :"+this.jumHari+"");
    }
    
    public static void main(String[] args) {
        Ruang_Rawat_Inap k = new Ruang_Rawat_Inap(231,200);
        FasilitasRuangan fr = new FasilitasRuangan(k);
        fr.jumHari = 3; //obname 3 hari
        System.out.println("Tagihan Ruangan:"+fr.hitungTagihan()); 
    }
}

//output:
//Tagihan Ruangan:600.0