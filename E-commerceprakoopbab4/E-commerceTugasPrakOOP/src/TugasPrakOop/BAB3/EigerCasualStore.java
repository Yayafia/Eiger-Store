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
    private String gayaPakaian;
    private String menyediakanAlatPendakian;
    
    /** Constructor dengan parameter */
    public EigerCasualStore(String namaToko, String lokasi, String gayaPakaian) {
        super(namaToko, lokasi, "Casual Store", "Gaya Pakaian: " + gayaPakaian);
        this.gayaPakaian = gayaPakaian;
        this.menyediakanAlatPendakian = "Tidak";
    }

    /** Override method tampilkanInfoToko untuk menambahkan informasi gaya pakaian */
    @Override
    public String tampilkanInfoToko() {
    return super.tampilkanInfoToko() + 
               "Menyediakan Alat Pendakian : " + menyediakanAlatPendakian + "\n";
    }
}
