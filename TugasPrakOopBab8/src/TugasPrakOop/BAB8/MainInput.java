/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB8;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MainInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("===== INPUT DATA TOKO EIGER =====");

            System.out.print("Masukkan nama toko: ");
            String nama = sc.nextLine();

            System.out.print("Masukkan lokasi toko: ");
            String lokasi = sc.nextLine();

            System.out.print("Masukkan jenis toko (Adventure/Casual): ");
            String jenis = sc.nextLine();

            EigerStore toko;

            if (jenis.equalsIgnoreCase("Adventure")) {
                // Data dummy untuk atribut khusus AdventureStore
                System.out.print("Masukkan jenis aktivitas (misal: Hiking): ");
                String aktivitas = sc.nextLine();

                System.out.print("Masukkan musim (misal: Dingin): ");
                String musim = sc.nextLine();

                System.out.print("Masukkan info tambahan: ");
                String tambahan = sc.nextLine();

                toko = new EigerAdventureStore(nama, lokasi, aktivitas, musim, tambahan);
            } else if (jenis.equalsIgnoreCase("Casual")) {
                // Data dummy untuk atribut khusus CasualStore
                System.out.print("Masukkan jenis kelamin (Pria/Wanita/Unisex): ");
                String kelamin = sc.nextLine();

                System.out.print("Masukkan warna produk: ");
                String warna = sc.nextLine();

                System.out.print("Masukkan info tambahan: ");
                String tambahan = sc.nextLine();

                toko = new EigerCasualStore(nama, lokasi, kelamin, warna, tambahan);
            } else {
                System.out.println("Jenis toko tidak dikenali. Harus 'Adventure' atau 'Casual'.");
                return;
            }

            System.out.println("\n>>> Output Informasi Lengkap:");
            System.out.println(toko.tampilkanInfoToko());

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }

        sc.close();
    }
}