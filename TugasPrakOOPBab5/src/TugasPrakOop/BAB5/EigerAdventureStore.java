/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB5;

/**
 *
 * @author USER
 */
public class EigerAdventureStore extends EigerStore{
    private String infoTambahan;
    private final String menyediakanAlatPendakian;

    /**
     * Konstruktor utama dengan info tambahan.
     *
     * @param namaToko Nama toko
     * @param lokasi Lokasi toko
     * @param infoTambahan Informasi tambahan khusus
     */
    public EigerAdventureStore(String namaToko, String lokasi, String infoTambahan) {
        super(namaToko, lokasi, "Adventure Store", infoTambahan);
        this.infoTambahan = infoTambahan;
        this.menyediakanAlatPendakian = "Iya";
    }

    /**
     * Konstruktor overloading tanpa info tambahan spesifik.
     * Info default akan digunakan.
     *
     * @param namaToko Nama toko
     * @param lokasi Lokasi toko
     */
    public EigerAdventureStore(String namaToko, String lokasi) {
        this(namaToko, lokasi, "Aktivitas: Hiking\nMusim: Panas\nInfo Tambahan: Umum");
    }

    /**
     * Override method tampilkanInfoToko untuk menambahkan info alat pendakian.
     *
     * @return Informasi lengkap toko
     */
    @Override
    public String tampilkanInfoToko() {
        return super.tampilkanInfoToko() +
               "Menyediakan Alat Pendakian : " + menyediakanAlatPendakian + "\n";
    }
}
