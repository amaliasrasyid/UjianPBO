/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017;

import java.util.ArrayList;

/**
 *
 * @author arkhamzahrirakhman
 */
public class Pembayaran {
    Pasien pasien;

    private ArrayList<Fasilitas> alFasilitas = new ArrayList<Fasilitas>();


    public void addFasilitas(Fasilitas f) {
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
        FasilitasRuangan fr = new FasilitasRuangan(rri);
        fr.kamar = rri;
        fr.jumHari = 3;
        pembayaran.addFasilitas(fr);
        System.out.println("Tagihan:"+pembayaran.hitungSemuaTagihan());
    }
}
