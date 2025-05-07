/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB6;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public abstract class EigerStore {
    protected String namaToko;
    protected String lokasi;

    // Static list untuk menyimpan semua objek toko
    private static ArrayList<EigerStore> daftarToko = new ArrayList<>();

    /** Constructor umum */
    public EigerStore(String namaToko, String lokasi) {
        this.namaToko = namaToko;
        this.lokasi = lokasi;
        daftarToko.add(this);
    }

    // Getter dan Setter
    public String getNamaToko() { return namaToko; }
    public String getLokasi() { return lokasi; }
    public void setNamaToko(String namaToko) { this.namaToko = namaToko; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    // Abstract method wajib diimplementasi semua subclass
    public abstract String getJenisStore();
    public abstract String tampilkanInfoToko();

    // Method static untuk ambil daftar toko
    public static ArrayList<EigerStore> getDaftarToko() {
        return daftarToko;
    }

    public static void resetDaftarToko() {
        daftarToko.clear();
    }
}
