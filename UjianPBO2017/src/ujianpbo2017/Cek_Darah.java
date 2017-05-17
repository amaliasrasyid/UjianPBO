/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017;

/**
 *
 * @author ahmadluky
 */
public class Cek_Darah extends Fasilitas {

    public int harga = 10;
    int jumPemeriksaan;
        
    //lengkapi
    public Cek_Darah() {
        String satuan = "periksa";
    }
    
    //lengkapi
    @Override
    public double hitungTagihan() {
        return  this.harga * this.jumPemeriksaan;
    }

    //lengkapi
    public void print() {
        System.out.println("Pemeriksaan Cek Darah - Jumlah : "+this.jumPemeriksaan+" kali , harga : "+this.harga+"");
    }
    
    public static void main(String[] args) {
        Cek_Darah cek_darah = new Cek_Darah();
        cek_darah.jumPemeriksaan = 10; //pemeriksaan 3 kali
        System.out.println("Tagihan Cek Darah:"+cek_darah.hitungTagihan()); 
    }
    
}

//output
//Tagihan Cek Darah:100.0