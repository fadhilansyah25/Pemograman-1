package Pertemuan8;

import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        int hargaPensil_FadilArdiansyah = 2000,
            hargaBuku_FadilArdiansyah = 3500,
            total_FadilArdiansyah = 0;
        String loop_FadilArdiansyah, pilihMenu_FadilArdiansyah = "";
        int satuan_FadilArdiansyah = 0;
        System.out.println("--------------------------------------");
        System.out.println("|           Toko Ku                  |");
        System.out.println("--------------------------------------");
        System.out.println("| 1. Pensil                 : Rp 2000 ");
        System.out.println("| 2. Buku                   : Rp 3500 ");
        System.out.println("| 3. Exit                   |");
        System.out.println("--------------------------------------");
        for(loop_FadilArdiansyah = "Y"; loop_FadilArdiansyah.equals("Y") || loop_FadilArdiansyah.equals("y");)
        {
            System.out.print("Pilih Menu (1 s/d 3)  : ");
            int pilihan = simpan.nextInt();

            switch(pilihan){
                case 1: System.out.println("Anda memilih Pensil     : Rp 2000");
                        pilihMenu_FadilArdiansyah = "Pensil, "+pilihMenu_FadilArdiansyah;
                        satuan_FadilArdiansyah = 1 + satuan_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + hargaPensil_FadilArdiansyah;
                        break;
                case 2: System.out.println("Anda memilih Buku     : Rp 2000");
                        pilihMenu_FadilArdiansyah = "Buku, "+pilihMenu_FadilArdiansyah;
                        satuan_FadilArdiansyah = 1 + satuan_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + hargaBuku_FadilArdiansyah;
                        break;
                case 3: System.out.println("Selesai");
                        break;
                default: System.out.println("Maaf, input menu yang anda masukan tidak sesuai");
            }
            System.out.print("Ada lagi yang akan dipesan? (Y/N) : ");
            loop_FadilArdiansyah = simpan.next();
        }
        System.out.println("--------------------------------------");
        System.out.println("Barang yang anda pesan adalah               : "+pilihMenu_FadilArdiansyah);
        System.out.println("Total Belanjaan Anda                        : "+satuan_FadilArdiansyah);
        System.out.println("Terima Kasih, total yang anda harus bayar   : "+total_FadilArdiansyah);
        System.out.println("--------------------------------------");
    }
}