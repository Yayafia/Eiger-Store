/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB5;

/**
 *
 * @author USER
 */
public class EigerCasualStore extends EigerStore {
    private String kelamin;
    private String warna;
    private String infoTambahan;
    private final boolean alatPendakian = false;

    /** 
     * Constructor utama dengan parameter lengkap 
     */
    public EigerCasualStore(String namaToko, String lokasi, String kelamin, String warna, String infoTambahan) {
        super(namaToko, lokasi, "Casual Store", 
              "Jenis Kelamin: " + kelamin + ", Warna: " + warna + ", Info: " + infoTambahan);
        this.kelamin = kelamin;
        this.warna = warna;
        this.infoTambahan = infoTambahan;
    }

    /** 
     * 🟢 Constructor Overloading — hanya menerima nama dan lokasi 
     */
    public EigerCasualStore(String namaToko, String lokasi) {
        this(namaToko, lokasi, "Unisex", "Netral", "Basic Casual Look");
    }

    /** 
     * 🔁 Override method tampilkanInfoToko dari class induk 
     */
    @Override
    public String tampilkanInfoToko() {
        return super.tampilkanInfoToko() + 
               "\nMenyediakan alat pendakian: " + (alatPendakian ? "Iya" : "Tidak");
    }
}
