/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopconcept;

/**
 *
 * @author Fadhilansyah25
 */
public class MobilBeraksi {
    public static void main(String args[]){
        // membuat object 
        Mobil mobilaku = new Mobil();
                
        /* memanggil atribut dan memberikan nilai */
        mobilaku.Warna_FadilArdiansyah = "Hitam";
        mobilaku.tahunProduksi_FadilArdiansyah = 2006;
        System.out.println("Warna : "+mobilaku.Warna_FadilArdiansyah);
        System.out.println("Tahun : "+mobilaku.tahunProduksi_FadilArdiansyah);
    }
}
