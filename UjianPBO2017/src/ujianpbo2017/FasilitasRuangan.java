/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017;

/**
 *
 * @author arkhamzahrirakhman
 */
public class FasilitasRuangan extends Fasilitas{
    Ruang_Rawat_Inap kamar;
    int jumHari;

    public FasilitasRuangan(Ruang_Rawat_Inap k) {
        this.kamar = k;
        String satuan = "hari";
    }

    @Override
    public double hitungTagihan() {
        return  kamar.harga * jumHari;
    }

    public static void main(String[] args) {
        Ruang_Rawat_Inap k = new Ruang_Rawat_Inap(231,200);
        FasilitasRuangan fr = new FasilitasRuangan(k);
        fr.jumHari = 3; //obname 3 hari
        System.out.println("Tagihan:"+fr.hitungTagihan()); 
    }
}
