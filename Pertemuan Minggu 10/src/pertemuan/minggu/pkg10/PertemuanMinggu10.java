/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.minggu.pkg10;

import java.util.Scanner;
/**
 *
 * @author Fadhilansyah25
 */
public class PertemuanMinggu10 {

    /**
     * @param args the command line arguments
     */
    public int setNilai(){
        Scanner save = new Scanner(System.in);

        String nama_FadilArdiansyah = "";
        String loop_FadilArdiansyah;
        String back_FadilArdiansyah = "";
        
        float absensi_FadilArdiansyah = 0, tugas_FadilArdiansyah = 0,
                UTS_FadilArdiansyah = 0, UAS_FadilArdiansyah = 0,
                total_FadilArdiansyah = 0;
        
        System.out.println("Penilaian Nilai Mahasiswa");
        System.out.println("1. Memasukan Nama ");
        System.out.println("2. Menghitung nilai ");
        
        for(loop_FadilArdiansyah = "Y"; loop_FadilArdiansyah.equals("Y") ||
            loop_FadilArdiansyah.equals("y") || back_FadilArdiansyah.equals("y");)
        {
            System.out.print("Silahkan Masukan pilihan anda: ");
            int pilihan = save.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.print("Silahkan Masukan Nama anda: ");
                    nama_FadilArdiansyah = save.next();
                    loop_FadilArdiansyah = "Y";
                    break;
                case 2:
                    System.out.print("Silahkan masukan absen anda: ");
                    int DataAbsensi = save.nextInt();
                    System.out.print("Silahkan masukan nilai tugas anda: ");
                    int DataTugas = save.nextInt();
                    System.out.print("Silahkan masukan nilai UTS anda: ");
                    int DataUTS = save.nextInt();
                    System.out.print("Silahkan masukan nilai UAS anda: ");
                    int DataUAS = save.nextInt();

                    absensi_FadilArdiansyah = (DataAbsensi/14)*10;
                    tugas_FadilArdiansyah = DataTugas*20/100;
                    UTS_FadilArdiansyah = DataUTS*30/100;
                    UAS_FadilArdiansyah = DataUAS*40/100;
                    total_FadilArdiansyah = absensi_FadilArdiansyah + tugas_FadilArdiansyah
                    + UTS_FadilArdiansyah +UAS_FadilArdiansyah;
                    loop_FadilArdiansyah = "T";
                    break;
                default : 
                    System.out.println("Maaf");
            }
        }
        
        System.out.println("Nama anda: "+nama_FadilArdiansyah);
        System.out.println("Nilai Akhir anda: "+total_FadilArdiansyah);

        if (total_FadilArdiansyah>=80) {
            System.out.println("Grade: A");
        }
        else if (total_FadilArdiansyah>=70) {
            System.out.println("Grade: B");
        }
        else if (total_FadilArdiansyah>=60) {
            System.out.println("Grade: C");
        }
        else if (total_FadilArdiansyah>=55) {
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: E");
        }

        return 0;
    }   
}
