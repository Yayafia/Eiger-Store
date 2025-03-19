/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 *
 * @author USER
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Menggunakan constructor lengkap
        EigerStore toko1 = new EigerStore(
            "Eiger Adventure Store",
            "Bandung",
            "Peralatan Hiking",
            "09:00 - 22:00",
            4.8,
            5
        );

        toko1.tambahProduk("Jaket Gunung");
        toko1.tambahProduk("Tenda Dome");
        toko1.tambahProduk("Botol Minum");
        toko1.tampilkanInfoToko();

        // 2. Menggunakan constructor dengan kategori saja
        EigerStore toko2 = new EigerStore("Eiger Outdoor", "Jakarta", "Pakaian Outdoor");
        toko2.tambahProduk("Tas Gunung");
        toko2.tambahProduk("Sepatu Hiking");
        toko2.tampilkanInfoToko();

        // 3. Menggunakan constructor default
        EigerStore toko3 = new EigerStore();
        toko3.tampilkanInfoToko();
    }
}