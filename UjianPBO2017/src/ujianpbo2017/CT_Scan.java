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
    
    //hitung tagihan : harga pemeriksaaan * jumlah pemeriksaan + asuransi * jumlah pemeriksaan
    //lengkapi
    @Override
    public double hitungTagihan() {
        // tagihan pemeriksaan ct_scan
        return 0;
    }
    
    //overloading
    //lengkapi
    public static double hitungTagihan(int asuransi) {
        // tagihan pemeriksaan ct_scan
        // asuransi: harga asuransi setiap pemeriksaan
        return 0;
    }
    
    //lengkapi
    public void print() {
    }
    
    //lengkapi
    public static void print(int asuransi) {
    }

    public static void main(String[] args) {
        //lengkapi 
        //main class dengan menggunakan karakteristik class dan fungsi static
        // -jumlah pemeriksaan = 3
        // -asuransi = 3000
    }
    
    
}

//output:
//Tagihan CT Scan:13200.0