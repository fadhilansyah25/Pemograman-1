/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.minggu.pkg10;

/**
 *
 * @author Fadhilansyah25
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone Xiaomi = new Handphone();

        Xiaomi.Hidupkan();
        Xiaomi.lakukanPanggilan();
        Xiaomi.kirimSMS();
        Xiaomi.matikan();
    }
}
