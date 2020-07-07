/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.minggu.pkg11;

/**
 *
 * @author Fadhilansyah25
 */
public class Sepeda {
    int kecepatan_FadilArdiansyah, gir_FadilArdiansyah;

    // method dengann parameter
    void ubahGir(int pertambahanGir_FadilArdiansyah){
        gir_FadilArdiansyah = gir_FadilArdiansyah + pertambahanGir_FadilArdiansyah;
        System.out.println("Gir : "+gir_FadilArdiansyah);
    }

    void tambahKecepatan(int pertambahanKecepatan_FadilArdiansyah){
        kecepatan_FadilArdiansyah += pertambahanKecepatan_FadilArdiansyah;
        System.out.println("Kecepatan : "+kecepatan_FadilArdiansyah);
    }
}
