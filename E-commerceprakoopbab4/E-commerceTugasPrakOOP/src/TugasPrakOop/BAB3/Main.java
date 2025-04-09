/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB3;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Membuat objek Adventure Store
        EigerAdventureStore tokoHiking = new EigerAdventureStore("Eiger Adventure", "Bandung", true);
        tokoHiking.tampilkanInfoToko();

        // Membuat objek Casual Store
        EigerCasualStore tokoCasual = new EigerCasualStore("Eiger Casual", "Jakarta", "Streetwear");
        tokoCasual.tampilkanInfoToko();
    }
}
