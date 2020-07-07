package Pertemuan7;

import java.util.Scanner;
public class studykasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarak_FadilArdiansyah;
        double waktu_FadilArdiasnyah;
        double kecepatan_FadilArdiansyah;

        System.out.println("=======================================");
        System.out.println("Tekan 1 untuk mencari kecepatan (m/s) ");
        System.out.println("Tekan 2 untuk mencari waktu (t) ");
        System.out.println("Tekan 3 untuk mencari jarak (m) ");
        System.out.println("=======================================");
        System.out.print("Masukan pilihan : "); Integer pilih_FadilArdiansyah = input.nextInt();
        
        if (pilih_FadilArdiansyah == 1){
            System.out.println("=======================================");
            System.out.println("Anda ingin mencari kecepatan");
            System.out.println("=======================================");
            System.out.print("Masukan Jarak(meter) : ");
            jarak_FadilArdiansyah = input.nextDouble();
            System.out.print("Masukan Waktu(sekon) : ");
            waktu_FadilArdiasnyah = input.nextDouble();
            kecepatan_FadilArdiansyah = jarak_FadilArdiansyah/waktu_FadilArdiasnyah;
            System.out.println("Hasinya "+kecepatan_FadilArdiansyah+" m/s");
        }
        else if (pilih_FadilArdiansyah == 2){
            System.out.println("=======================================");
            System.out.println("Anda ingin mencari waktu");
            System.out.println("=======================================");
            System.out.print("Masukan Jarak(meter) : ");
            jarak_FadilArdiansyah = input.nextDouble();
            System.out.print("Masukan Kecepatan(m/s) : ");
            kecepatan_FadilArdiansyah = input.nextDouble();
            waktu_FadilArdiasnyah = jarak_FadilArdiansyah/kecepatan_FadilArdiansyah;
            System.out.println("Hasinya "+waktu_FadilArdiasnyah+" sekon");
        }
        else if (pilih_FadilArdiansyah == 3) {
            System.out.println("=======================================");
            System.out.println("Anda ingin mencari Jarak");
            System.out.println("=======================================");
            System.out.print("Masukan Waktu(sekon) : ");
            waktu_FadilArdiasnyah = input.nextDouble();
            System.out.print("Masukan Kecepatan(m/s) : ");
            kecepatan_FadilArdiansyah = input.nextDouble();
            jarak_FadilArdiansyah = waktu_FadilArdiasnyah*kecepatan_FadilArdiansyah;
            System.out.println("Hasinya "+jarak_FadilArdiansyah+" meter");
        }
        else{
            System.out.println("Maaf Pilihan Tidak Ada");
        }
        input.close();
    }
}