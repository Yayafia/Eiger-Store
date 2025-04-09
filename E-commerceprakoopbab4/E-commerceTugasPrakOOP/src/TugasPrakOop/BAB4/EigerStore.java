/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB4;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class EigerStore {
    // Atribut dibuat private untuk enkapsulasi
    private String namaToko;
    private String lokasi;
    private String kategori;
    private String tambahanInfo;

    /** Constructor */
    public EigerStore(String namaToko, String lokasi, String kategori, String tambahanInfo) {
        this.namaToko = namaToko;
        this.lokasi = lokasi;
        this.kategori = kategori;
        this.tambahanInfo = tambahanInfo;
    }

    /** Getter dan Setter */
    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getTambahanInfo() {
        return tambahanInfo;
    }

    public void setTambahanInfo(String tambahanInfo) {
        this.tambahanInfo = tambahanInfo;
    }

    /** Method untuk menampilkan informasi toko */
    public String tampilkanInfoToko() {
        return "========== EIGER STORE ==========\n" +
               "Nama Toko  : " + namaToko + "\n" +
               "Lokasi     : " + lokasi + "\n" +
               "Kategori   : " + kategori + "\n" +
               "Info Tambahan : " + tambahanInfo + "\n" +
               "=================================\n";
    }
}
