/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmadluky
 */
public class Dokter_Spesialis extends Dokter{
    
    public int harga = 2000; // harga per menit
    public int id;
    public String name;
    public String spesialis;
    public String tanggal_waktu;
    public String awal;
    public String akhir;
    
    List<String> Identitas = new ArrayList<>();
    public Map<Integer, List> allIdentitas = new HashMap<>();
       
    public Dokter_Spesialis(int id, String name, String sps, String w){
        this.id = id;
        this.name = name;
        this.spesialis = sps; 
        this.tanggal_waktu = w;
    }
    
    @Override
    public Map getIdentitas() {
        // mendapatkan identias dokter yang terdiri dari id, nama dan spesialis
        Identitas.add(this.name);
        Identitas.add(this.spesialis);
        Identitas.add(this.tanggal_waktu);
        return (Map) allIdentitas.put(id, Identitas);
    }

    @Override
    public String getWaktuPraktek() {
        // mendapatkan waktu praktik dokter
        return this.tanggal_waktu;
    }

    @Override
    public double HitungHarga() {
        //menghitung harga pembayaran untuk dokter dengan rumus : Harga per menit * jumlah menit
        return this.harga * HitungMenit();
    }
    
    public long HitungMenit() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy HH:mm");
            Date d1 = format.parse(this.awal);
            Date d2 = format.parse(this.akhir);
            long diff = d2.getTime() - d1.getTime();
            return  diff / (60 * 1000) % 60; // menghitung jumlah menit
        } catch (ParseException ex) {
            System.err.println("Error Menghitung Menit:"+ex.getMessage());
        }
        return 0;
    }
    
    public void print() {
        System.out.println("id dokter : "+this.id+", nama : "+this.name+", waktu : "+ this.tanggal_waktu+", spesialis : "+ this.spesialis+"");
    }
    
    
    public static void main(String[] args) {
        Dokter_Spesialis ds = new Dokter_Spesialis(1,"DR. Irkham", "Mata", "20-04-2017 20:00");
        ds.print();
        ds.awal = "04-04-2017 20:00";
        ds.akhir = "04-04-2017 20:40";
        System.err.println("Harga Pemeriksaan: "+ ds.HitungHarga());
    }
    
}


//output:
//id dokter:1, nama:DR. Irkham, waktu: 20-04-2017 20:00, spesialis: Mata
//Harga Pemeriksaan: 80000.0