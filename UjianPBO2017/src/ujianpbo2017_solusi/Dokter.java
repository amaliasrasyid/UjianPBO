/*
 * Dokter Terdiri dari: Dokter Umum, dan Dokter Spesialis
 */
package ujianpbo2017_solusi;

import java.util.Map;

/**
 *
 * @author ahmadluky
 */
public abstract class Dokter {
    
    public abstract Map getIdentitas();
    public abstract String getWaktuPraktek();
    public abstract double HitungHarga();
    
}
