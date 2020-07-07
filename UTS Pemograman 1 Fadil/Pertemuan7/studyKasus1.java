package Pertemuan7;

import java.util.Scanner;
public class studyKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiAkhir_FadilArdiansyah;

        System.out.print("Masukan NIM Anda : ");String nim_FadilArdiansyah = input.nextLine();
        System.out.print("Masukan Nama Anda : ");String nama_FadilArdiansyah = input.nextLine();
        System.out.print("Masukan Kehadiran (Max 14) : ");Integer hadir_FadilArdiansyah = input.nextInt();
        System.out.print("Masukan Tugas : ");Integer tugas_FadilArdiansyah = input.nextInt();
        System.out.print("Masukan UTS : ");Integer uts_FadilArdiansyah = input.nextInt();
        System.out.print("Masukan UAS : ");Integer uas_FadilArdiansyah = input.nextInt();

        // menghitung nilai akhir
        nilaiAkhir_FadilArdiansyah = (((hadir_FadilArdiansyah/14)*0.1)*100) 
        + (tugas_FadilArdiansyah*0.2) + (uts_FadilArdiansyah*0.3) + (uas_FadilArdiansyah*0.4);
        
        System.out.println("\n\nNIM Anda : "+nim_FadilArdiansyah);
        System.out.println("Nama Anda : "+nama_FadilArdiansyah);
        System.out.println("Kehadiran Anda : "+hadir_FadilArdiansyah);
        System.out.println("NIlai Tugas : "+tugas_FadilArdiansyah);
        System.out.println("NIlai UTS : "+uts_FadilArdiansyah);
        System.out.println("NIlai UAS : "+uas_FadilArdiansyah);
        System.out.println("Nilai Akhir : "+nilaiAkhir_FadilArdiansyah);

        input.close();
    }
}