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
public class SepedaBeraksi {
    public static void main(String[] args) {
        // membuat object
        Sepeda sepedaku = new Sepeda();

        // memanggil atribut dan memberi nilai
        sepedaku.kecepatan_FadilArdiansyah = 10;
        sepedaku.gir_FadilArdiansyah = 2;

        // memanggil method dan menunjukan nilai parameter
        sepedaku.tambahKecepatan(30);
        sepedaku.ubahGir(3);
    }
}
