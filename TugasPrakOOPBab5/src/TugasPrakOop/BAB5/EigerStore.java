/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB5;

import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class EigerStore {
     // 🟢 Properti dengan access modifier private (enkapsulasi)
    private String namaToko;
    private String lokasi;
    private String kategori;
    private String tambahanInfo;

    // 🟢 Static list untuk menyimpan semua toko EIGER
    private static ArrayList<EigerStore> daftarToko = new ArrayList<>();

    /** Constructor utama */
    public EigerStore(String namaToko, String lokasi, String kategori, String tambahanInfo) {
        this.namaToko = namaToko;
        this.lokasi = lokasi;
        this.kategori = kategori;
        this.tambahanInfo = tambahanInfo;

        // Otomatis ditambahkan ke daftar toko
        daftarToko.add(this);
    }

    // =============================
    // 🔵 Getter dan Setter (Enkapsulasi)
    // =============================
    public String getNamaToko() { return namaToko; }
    public void setNamaToko(String namaToko) { this.namaToko = namaToko; }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public String getTambahanInfo() { return tambahanInfo; }
    public void setTambahanInfo(String tambahanInfo) { this.tambahanInfo = tambahanInfo; }

    // =============================
    // 🟢 Method untuk menampilkan informasi toko
    // =============================
    public String tampilkanInfoToko() {
        return "========== EIGER STORE ==========\n" +
               "Nama Toko      : " + namaToko + "\n" +
               "Lokasi         : " + lokasi + "\n" +
               "Kategori       : " + kategori + "\n" +
               "Info Tambahan  : " + tambahanInfo + "\n" +
               "=================================\n";
    }

    /**
     * 🔁 Overloading method tampilkanInfoToko untuk tampilan singkat (tanpa header).
     * @param includeHeader Jika true, tampilkan format lengkap.
     * @return Informasi toko dalam bentuk string.
     */
    public String tampilkanInfoToko(boolean includeHeader) {
        if (includeHeader) {
            return tampilkanInfoToko(); // panggil versi original
        } else {
            return namaToko + " | " + lokasi + " | " + kategori + " | " + tambahanInfo;
        }
    }

    // =============================
    // 🔁 Method static untuk akses data toko
    // =============================
    public static ArrayList<EigerStore> getDaftarToko() {
        return daftarToko;
    }

    /** Reset data toko */
    public static void resetDaftarToko() {
        daftarToko.clear();
    }
}
