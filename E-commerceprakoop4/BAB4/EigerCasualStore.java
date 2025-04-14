/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB4;

/**
 *
 * @author USER
 */
public class EigerCasualStore extends EigerStore {
    private String gayaPakaian;
    private String menyediakanAlatPendakian;

    /** Constructor */
    public EigerCasualStore(String namaToko, String lokasi, String gayaPakaian) {
        super(namaToko, lokasi, "Casual Store", "Gaya Pakaian: " + gayaPakaian);
        this.gayaPakaian = gayaPakaian;
        this.menyediakanAlatPendakian = "Tidak";
    }

    /** Getter dan Setter */
    public String getGayaPakaian() {
        return gayaPakaian;
    }

    public void setGayaPakaian(String gayaPakaian) {
        this.gayaPakaian = gayaPakaian;
    }

    public String getMenyediakanAlatPendakian() {
        return menyediakanAlatPendakian;
    }

    public void setMenyediakanAlatPendakian(String menyediakanAlatPendakian) {
        this.menyediakanAlatPendakian = menyediakanAlatPendakian;
    }

    /** Override tampilkanInfoToko */
    @Override
    public String tampilkanInfoToko() {
        return super.tampilkanInfoToko() + 
               "Menyediakan Alat Pendakian : " + menyediakanAlatPendakian + "\n";
    }
}
