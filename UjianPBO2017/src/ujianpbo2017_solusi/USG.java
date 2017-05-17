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
public class USG extends Fasilitas {
    
    public int harga = 15;
    int jumPemeriksaan;
       
    //lengkapi
    public USG() {
        String satuan = "periksa";
    }

    //lengkapi
    @Override
    public double hitungTagihan() {
        return  this.harga*this.jumPemeriksaan;
    }
    
    //lengkapi
    public void print() {
        System.out.println("Pemeriksaan USG - Jumlah : "+this.jumPemeriksaan+" kali , harga : "+this.harga+"");
    }
    
    public static void main(String[] args) {
        USG usg = new USG();
        usg.jumPemeriksaan = 3; //pemeriksaan 3 kali
        usg.print();
        System.out.println("Tagihan USG :"+usg.hitungTagihan()); 
    }
    
}


//output:
//Pemeriksaan USG - Jumlah : 3 kali , harga:15
//Tagihan USG :45.0