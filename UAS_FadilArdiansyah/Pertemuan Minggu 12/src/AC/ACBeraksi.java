/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC;

/**
 *
 * @author Fadhilansyah25
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC ACberaksi = new AC();

        System.out.println("AC Dalam keadaan Mati");

        ACberaksi.hidupkanAC();
        ACberaksi.hidupkanAC();
        ACberaksi.panaskanAC();
        ACberaksi.dinginkanAC();
        ACberaksi.matikanAC();
        ACberaksi.dinginkanAC();
    }
}
