package Pertemuan3;

import java.io.*;

public class Pernyataanifelse2 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String gradestring_FadilArdiansyah = "";
        Byte grade_FadilArdiansyah = 0;

        System.out.print("Ketik nilai Anda : ");
        try {
            gradestring_FadilArdiansyah = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");
        };
        
        grade_FadilArdiansyah = new Byte(gradestring_FadilArdiansyah);

        if ( grade_FadilArdiansyah >= 80) {
            System.out.println("Selamat Anda Lulus!");
            System.out.println("Karena nilai Anda "+grade_FadilArdiansyah+" ! ");
        }
        else {
            System.out.println("Maaf Anda belum Lulus!");
            System.out.println("Karena nilai Anda "+grade_FadilArdiansyah+" ! ");
        };
    }
}