/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB3;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class EigerStore {
    protected String namaToko;
    protected String lokasi;
    protected String kategori;
    protected String tambahanInfo;

    // Static list untuk menyimpan semua toko
    private static ArrayList<EigerStore> daftarToko = new ArrayList<>();

    /** Constructor utama */
    public EigerStore(String namaToko, String lokasi, String kategori, String tambahanInfo) {
        this.namaToko = namaToko;
        this.lokasi = lokasi;
        this.kategori = kategori;
        this.tambahanInfo = tambahanInfo;

        // Tambahkan otomatis ke daftar toko
        daftarToko.add(this);
    }

    /** Method untuk menampilkan informasi toko */
    public String tampilkanInfoToko() {
        return "========== EIGER STORE ==========\n" +
               "Nama Toko      : " + namaToko + "\n" +
               "Lokasi         : " + lokasi + "\n" +
               "Kategori       : " + kategori + "\n" +
               "Info Tambahan  : " + tambahanInfo + "\n";
    }

    /** Method static untuk ambil semua data toko */
    public static ArrayList<EigerStore> getDaftarToko() {
        return daftarToko;
    }

    /** Method optional untuk reset daftar toko */
    public static void resetDaftarToko() {
        daftarToko.clear();
    }
}
