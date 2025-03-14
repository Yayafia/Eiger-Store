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
    private ArrayList<String> daftarProduk; // Menyimpan daftar produk yang tersedia di toko

    /**
     * Constructor untuk membuat objek EigerStore.
     * @param namaToko Nama toko.
     * @param lokasi Lokasi toko.
     */
    public EigerStore(String namaToko, String lokasi) {
        this.namaToko = namaToko;
        this.lokasi = lokasi;
        this.daftarProduk = new ArrayList<>();
    }

    /**
     * Method untuk menambahkan produk ke dalam daftar toko.
     * @param produk Nama produk yang ingin ditambahkan.
     */
    public void tambahProduk(String produk) {
        daftarProduk.add(produk);
    }

    /**
     * Method untuk menampilkan informasi toko dan daftar produk.
     */
    public void tampilkanInfoToko() {
        System.out.println("========== EIGER STORE ==========");
        System.out.println("Nama Toko : " + namaToko);
        System.out.println("Lokasi    : " + lokasi);
        System.out.println("Daftar Produk:");
        for (String produk : daftarProduk) {
            System.out.println("- " + produk);
        }
        System.out.println("=================================");
    }
}
