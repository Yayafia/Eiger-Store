/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrakOop.BAB7;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // Menjalankan GUI Eiger Store
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasPrakOop.BAB6.GUI_Eiger().setVisible(true);
            }
        });
    }
}