/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

import java.util.ArrayList;
/**
 *
 * @author USER
 */

public class EigerStore {
    private String namaToko;
    private String lokasi;
    private String kategoriToko;
    private String jamOperasional;
    private double ratingToko;
    private int kapasitasStok;
    private ArrayList<String> daftarProduk;

    /** Constructor Default */
    public EigerStore() {
        this("Eiger Default Store", "Lokasi Default", "Umum", "08:00 - 21:00", 4.5, 10);
    }

    /** Constructor dengan Nama dan Lokasi */
    public EigerStore(String namaToko, String lokasi) {
        this(namaToko, lokasi, "Umum", "08:00 - 21:00", 4.5, 10);
    }

    /** Constructor dengan Nama, Lokasi, dan Kategori */
    public EigerStore(String namaToko, String lokasi, String kategoriToko) {
        this(namaToko, lokasi, kategoriToko, "08:00 - 21:00", 4.5, 10);
    }

    /** Constructor Lengkap */
    public EigerStore(String namaToko, String lokasi, String kategoriToko, String jamOperasional, double ratingToko, int kapasitasStok) {
    this.namaToko = namaToko;
    this.lokasi = lokasi;
    this.kategoriToko = kategoriToko;
    this.jamOperasional = jamOperasional;
    this.ratingToko = ratingToko;
    this.kapasitasStok = kapasitasStok;
    this.daftarProduk = new ArrayList<>();
}

    /** Method untuk menambahkan produk */
    public void tambahProduk(String produk) {
        if (daftarProduk.size() < kapasitasStok) {
            daftarProduk.add(produk);
            System.out.println("Produk " + produk + " berhasil ditambahkan.");
        } else {
            System.out.println("Toko penuh! Tidak bisa menambah produk lagi.");
        }
    }

    /** Method untuk menampilkan informasi toko */
    public void tampilkanInfoToko() {
        System.out.println("========== EIGER STORE ==========");
        System.out.println("Nama Toko     : " + namaToko);
        System.out.println("Lokasi        : " + lokasi);
        System.out.println("Kategori      : " + kategoriToko);
        System.out.println("Jam Operasional: " + jamOperasional);
        System.out.println("Rating        : " + ratingToko + " / 5.0");
        System.out.println("Kapasitas Stok: " + kapasitasStok + " produk");
        System.out.println("Daftar Produk:");
        if (daftarProduk.isEmpty()) {
            System.out.println("(Belum ada produk)");
        } else {
            for (String produk : daftarProduk) {
                System.out.println("- " + produk);
            }
        }
        System.out.println("=================================");
    }
}