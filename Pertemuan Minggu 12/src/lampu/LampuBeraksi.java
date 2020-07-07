/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampu;

/**
 *
 * @author Fadhilansyah25
 */
public class LampuBeraksi {
    public static void main(String[] args) {
        Lampu lampuKamar = new Lampu();

        System.out.println("Status Lampu saat ini: Mati");
        
        lampuKamar.hidupkan();
        lampuKamar.matikan();
        lampuKamar.matikan();
        lampuKamar.hidupkan();
        lampuKamar.hidupkan();
    }
}
