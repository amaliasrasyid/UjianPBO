/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ahmadluky
 */
public class Dokter_Umum  extends Dokter{
    
    public int harga = 1000;
    public int id;
    public String name;
    public String tanggal_waktu;
    public String awal;
    public String akhir;
    
    List<String> Identitas = new ArrayList<>();
    public Map<Integer, List> allIdentitas = new HashMap<>();
    
    //lengkapi
    public Dokter_Umum(int id, String name, String w){
    }
    
    @Override
    public Map getIdentitas() {
        // mendapatkan identias dokter yang terdiri dari id, nama dan waktu pemeriksaan
        return null;
    }

    @Override
    public String getWaktuPraktek() {
        // mendapatkan waktu pemeriksaan
        return null;
    }

    @Override
    public double HitungHarga() {
        // mendapatkan selisih menit dikali harga
        return 0;
    }
    
    public void print() {
        System.out.println("id dokter:"+this.id+", nama:"+this.name+", waktu: "+ this.tanggal_waktu+"");
    }
    
    
    public static void main(String[] args) {
        Dokter_Umum ds = new Dokter_Umum(1,"DR. Irkham", "20-04-2017 20:00");
        ds.print();
    }
}

//output:
//id dokter:1, nama:DR. Irkham, waktu: 20-04-2017 20:00
