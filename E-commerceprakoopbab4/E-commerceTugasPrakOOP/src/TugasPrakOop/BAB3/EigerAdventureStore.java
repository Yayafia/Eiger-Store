/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB3;

/**
 *
 * @author USER
 */
public class EigerAdventureStore extends EigerStore {
    private String infoTambahan;
    private String menyediakanAlatPendakian;

    /** Constructor dengan parameter */
    public EigerAdventureStore(String namaToko, String lokasi, String infoTambahan) {
        super(namaToko, lokasi, "Adventure Store", infoTambahan);
        this.infoTambahan = infoTambahan;
        this.menyediakanAlatPendakian = "Iya";
    }

    /** Override method tampilkanInfoToko untuk menambahkan informasi peralatan hiking */
    @Override
    public String tampilkanInfoToko() {
    return super.tampilkanInfoToko() + 
               "Menyediakan Alat Pendakian : " + menyediakanAlatPendakian + "\n";
    }
}
