/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB1;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class EigerStore {
    private String namaToko; // Menyimpan nama toko.
    private String lokasi; // Menyimpan lokasi toko.
    private ArrayList<String> daftarProduk; // Menyimpan daftar produk yang tersedia di toko.

    /**
     * Constructor untuk membuat objek EigerStore.
     * @param namaToko Nama toko.
     * @param lokasi Lokasi toko.
     */
    public EigerStore(String namaToko, String lokasi) {
        this.namaToko = namaToko; // Menginisialisasi nama toko.
        this.lokasi = lokasi; // Menginisialisasi lokasi toko.
        this.daftarProduk = new ArrayList<>(); // Membuat objek ArrayList untuk menyimpan daftar produk.
    }

    /**
     * Method untuk menambahkan produk ke dalam daftar toko.
     * @param produk Nama produk yang ingin ditambahkan.
     */
    public void tambahProduk(String produk) {
        daftarProduk.add(produk); // Menambahkan produk ke dalam ArrayList daftarProduk.
    }

    /**
     * Method untuk menampilkan informasi toko dan daftar produk yang tersedia.
     */
    public void tampilkanInfoToko() {
        System.out.println("========== EIGER STORE =========="); // Menampilkan header toko.
        System.out.println("Nama Toko : " + namaToko); // Menampilkan nama toko.
        System.out.println("Lokasi    : " + lokasi); // Menampilkan lokasi toko.
        System.out.println("Daftar Produk:"); // Menampilkan label daftar produk.
        for (String produk : daftarProduk) { // Melakukan iterasi pada daftar produk.
            System.out.println("- " + produk); // Menampilkan setiap produk yang tersedia.
        }
        System.out.println("================================="); // Menampilkan footer toko.
    }
}
