/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB_10;

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

    /**
     * Konstruktor umum untuk semua toko
     * @param namaToko Nama toko
     * @param lokasi Lokasi toko
     */
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

    /**
     * Method abstract untuk mendapatkan jenis store.
     * Wajib diimplementasikan oleh subclass.
     * @return Jenis store
     */
    public abstract String getJenisStore();

    /**
     * Method abstract untuk menampilkan info toko secara lengkap.
     * Wajib diimplementasikan oleh subclass.
     * @return Informasi lengkap toko
     */
    public abstract String tampilkanInfoToko();

    /**
     * Method overload untuk menampilkan info toko secara ringkas.
     * bentuk polimorfisme statis (overloading).
     * @param singkat jika true, tampilkan versi ringkas
     * @return Informasi toko
     */
    public String tampilkanInfoToko(boolean singkat) {
        if (singkat) {
            return getNamaToko() + " | " + getLokasi() + " | " + getJenisStore();
        } else {
            return tampilkanInfoToko(); // panggil versi lengkap
        }
    }

    /**
     * Mendapatkan daftar semua toko Eiger
     * @return List toko
     */
    public static ArrayList<EigerStore> getDaftarToko() {
        return daftarToko;
    }

    /**
     * Menghapus semua data toko dari list
     */
    public static void resetDaftarToko() {
        daftarToko.clear();
    }
}