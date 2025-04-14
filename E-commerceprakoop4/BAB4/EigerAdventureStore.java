/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB4;

/**
 *
 * @author USER
 */
public class EigerAdventureStore extends EigerStore{
    private String menyediakanAlatPendakian;

    /** Constructor */
    public EigerAdventureStore(String namaToko, String lokasi, String infoTambahan) {
        super(namaToko, lokasi, "Adventure Store", infoTambahan);
        this.menyediakanAlatPendakian = "Iya";
    }

    /** Getter dan Setter */
    public String getMenyediakanAlatPendakian() {
        return menyediakanAlatPendakian;
    }

    public void setMenyediakanAlatPendakian(String menyediakanAlatPendakian) {
        this.menyediakanAlatPendakian = menyediakanAlatPendakian;
    }

    /** Override method tampilkanInfoToko */
    @Override
    public String tampilkanInfoToko() {
        return super.tampilkanInfoToko() + 
               "Menyediakan Alat Pendakian : " + menyediakanAlatPendakian + "\n";
    }
}
