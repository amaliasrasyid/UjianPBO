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
public class CT_Scan extends Fasilitas  {
    
    public static int harga = 1400;
    public static int jumPemeriksaan;
    int asuransi;
        
    public CT_Scan() {
        String satuan = "periksa";
    }

    @Override
    public double hitungTagihan() {
        // tagihan pemeriksaan ct_scan
        return  (harga * jumPemeriksaan) + (this.asuransi * jumPemeriksaan);
    }
    
    //overloading
    public static double hitungTagihan(int asuransi) {
        // tagihan pemeriksaan ct_scan
        // asuransi: harga asuransi setiap pemeriksaan
        return harga * jumPemeriksaan + asuransi * jumPemeriksaan;
    }
    

    public static void main(String[] args) {
        // lengkapi main class dengan menggunakan karakteristik class dan fungsi static
        CT_Scan.jumPemeriksaan = 3; //pemeriksaan 3 kali
        System.out.println("Tagihan CT Scan:"+CT_Scan.hitungTagihan(3000)); 
    }
    
    
}

//output:
//Tagihan CT Scan:13200.0