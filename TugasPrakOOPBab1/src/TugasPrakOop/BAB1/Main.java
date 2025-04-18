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
public class Main {
    public static void main(String[] args) {
        // Membuat objek toko Eiger dengan nama "Eiger Adventure Store" dan lokasi "Bandung".
        EigerStore toko1 = new EigerStore("Eiger Adventure Store", "Bandung");

        // Menambahkan beberapa produk ke dalam daftar produk toko.
        toko1.tambahProduk("Jaket Gunung");
        toko1.tambahProduk("Tenda Dome");
        toko1.tambahProduk("Botol Minum");

        // Menampilkan informasi toko beserta daftar produk yang tersedia.
        toko1.tampilkanInfoToko();
    }
}
