/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB3;

/**
 *
 * @author USER
 */
public class EigerCasualStore extends EigerStore{
    private String kelamin;
    private String warna;
    private String infoTambahan;
    private String menyediakanAlatPendakian;

    // Constructor baru yang menerima 5 parameter
    public EigerCasualStore(String namaToko, String lokasi, String kelamin, String warna, String infoTambahan) {
        super(namaToko, lokasi, "Casual Store", 
              "Jenis Kelamin: " + kelamin + ", Warna: " + warna + ", Info: " + infoTambahan);
        this.kelamin = kelamin;
        this.warna = warna;
        this.infoTambahan = infoTambahan;
        this.menyediakanAlatPendakian = "Tidak";
    }

    @Override
    public String tampilkanInfoToko() {
        return super.tampilkanInfoToko() + 
               "Menyediakan Alat Pendakian : " + menyediakanAlatPendakian + "\n";
    }
}
