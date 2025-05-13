/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB7;

/**
 *
 * @author USER
 */
public class EigerAdventureStore extends EigerStore{
    private String aktivitas;
    private String musim;
    private String tambahanInfo;

    public EigerAdventureStore(String namaToko, String lokasi, String aktivitas, String musim, String tambahanInfo) {
        super(namaToko, lokasi);
        this.aktivitas = aktivitas;
        this.musim = musim;
        this.tambahanInfo = tambahanInfo;
    }

    @Override
    public String getJenisStore() {
        return "Adventure Store";
    }

    @Override
    public String tampilkanInfoToko() {
        return "=== EIGER ADVENTURE STORE ===\n" +
               "Nama Toko : " + namaToko + "\n" +
               "Lokasi    : " + lokasi + "\n" +
               "Aktivitas : " + aktivitas + "\n" +
               "Musim     : " + musim + "\n" +
               "Tambahan  : " + tambahanInfo + "\n" +
               "Alat Pendakian: Iya\n";
    }
}
