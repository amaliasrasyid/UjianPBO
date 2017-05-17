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
public class USG extends Fasilitas {
    
    public int harga = 15;
    int jumPemeriksaan;
        
    public USG() {
        String satuan = "periksa";
    }

    @Override
    public double hitungTagihan() {
        return  this.harga*this.jumPemeriksaan;
    }

    public static void main(String[] args) {
        USG usg = new USG();
        usg.jumPemeriksaan = 3; //pemeriksaan 3 kali
        System.out.println("Tagihan USG:"+usg.hitungTagihan()); 
    }
    
}


//output:
//Tagihan USG:45.0