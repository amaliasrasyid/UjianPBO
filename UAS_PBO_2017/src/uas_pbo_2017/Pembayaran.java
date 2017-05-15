/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo_2017;

import java.util.ArrayList;

/**
 *
 * @author arkhamzahrirakhman
 */
public class Pembayaran {
    Pasien pasien;

    //private ArrayList<Fasilitas> alFasilitas = new ArrayList<Fasilitas>();


    public void addCekLab(Cek_Lab cl) {
    }

    public double hitungSemuaTagihan() {
        return 0;
    }

    public Pembayaran(Pasien p) {
        this.pasien = p;
    }

    public static void main(String[] args) {
        Pasien pasien = new Pasien(1,"Rudi");
        Pembayaran  pembayaran = new Pembayaran(pasien);
        Ruang_Rawat_Inap rri = new Ruang_Rawat_Inap(231,200);
        //FasilitasKamar fk = new FasilitasKamar(k);
        //fk.kamar = k;
        //fk.jumHari = 3; //menginap 3 hari
        //tagihan.addFasilitas(fk);
        //lengkapi fasilitas lainnya
        //System.out.println("Tagihan:"+tagihan.hitungSemuaTagihan());
    }
}
