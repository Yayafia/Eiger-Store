/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB_10;

/**
 *
 * @author USER
 */
public class EigerCasualStore extends EigerStore implements Promo {
    private String jenisKelamin;
    private String warna;
    private String tambahanInfo;

    public EigerCasualStore(String namaToko, String lokasi, String jenisKelamin, String warna, String tambahanInfo) {
        super(namaToko, lokasi);
        this.jenisKelamin = jenisKelamin;
        this.warna = warna;
        this.tambahanInfo = tambahanInfo;
    }

    @Override
    public String getJenisStore() {
        return "Casual Store";
    }

    @Override
    public String tampilkanInfoToko() {
        return "=== EIGER CASUAL STORE ===\n" +
               "Nama Toko : " + namaToko + "\n" +
               "Lokasi    : " + lokasi + "\n" +
               "JK        : " + jenisKelamin + "\n" +
               "Warna     : " + warna + "\n" +
               "Tambahan  : " + tambahanInfo + "\n" +
               "Promo     : " + infoPromo() + "\n" +
               "Alat Pendakian: Tidak\n";
    }

    public String infoPromo() {
        return "Beli 2 kaos gratis 1 topi!";
    }
}