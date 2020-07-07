package Pertemuan7;

import java.util.Scanner;

public class scannerIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tambah_FadilArdiansyah;
        double kalih_FadilArdiansyah;

        System.out.println("=======================================");
        System.out.println("Tekan 1 untuk Penjumlahan ");
        System.out.println("Tekan 2 untuk Perkalian ");
        System.out.print("Masukan pilihan : "); Integer pilih_FadilArdiansyah = sc.nextInt();
        System.out.println("=======================================");

        if (pilih_FadilArdiansyah == 1) {
            System.out.println("=======================================");
            System.out.print("Masukan angka pertama : ");Integer satu_FadilArdiansyah = sc.nextInt();
            System.out.print("Masukan angka kedua : ");Integer dua_FadilArdiansyah = sc.nextInt();
            tambah_FadilArdiansyah = satu_FadilArdiansyah + dua_FadilArdiansyah;
            System.out.print("Hasilnya "+tambah_FadilArdiansyah+"!");
        }

        else if (pilih_FadilArdiansyah == 2) {
            System.out.println("=======================================");
            System.out.print("Masukan angka pertama : ");Integer satu_FadilArdiansyah = sc.nextInt();
            System.out.print("Masukan angka kedua : ");Integer dua_FadilArdiansyah = sc.nextInt();
            kalih_FadilArdiansyah = satu_FadilArdiansyah * dua_FadilArdiansyah;
            System.out.print("Hasilnya "+kalih_FadilArdiansyah+"!");    
        }
        else{
            System.out.println("Maaf Pilihan Tidak Ada");
        }

        sc.close();
    }
}