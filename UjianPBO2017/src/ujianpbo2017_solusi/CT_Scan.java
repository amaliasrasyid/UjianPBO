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
        return  (harga * jumPemeriksaan) + (this.asuransi * jumPemeriksaan);
    }
    
    //overloading
    //lengkapi
    public static double hitungTagihan(int asuransi) {
        // tagihan pemeriksaan ct_scan
        // asuransi: harga asuransi setiap pemeriksaan
        return (harga * jumPemeriksaan) + (asuransi * jumPemeriksaan);
    }
    
    //lengkapi
    public void print() {
        System.out.println("Pemeriksaan CT Scan - Jumlah : "+ this.jumPemeriksaan+" kali , asuransi : "+ this.asuransi+", harga : "+ this.harga+"");
    }
    
    //lengkapi
    public static void print(int asuransi) {
        System.out.println("Pemeriksaan CT Scan - Jumlah : "+ jumPemeriksaan+" kali , asuransi : "+ asuransi+", harga : "+ harga+"");
    }

    public static void main(String[] args) {
        //lengkapi 
        //main class dengan menggunakan karakteristik class dan fungsi static
        CT_Scan.jumPemeriksaan = 3; //pemeriksaan 3 kali
        CT_Scan.print(3000);
        System.out.println("Tagihan CT Scan:"+CT_Scan.hitungTagihan(3000)); 
    }
    
    
}

//output:
//Tagihan CT Scan:13200.0