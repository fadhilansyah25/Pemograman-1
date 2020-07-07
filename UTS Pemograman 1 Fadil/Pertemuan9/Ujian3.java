package Pertemuan9;

import java.util.Scanner;
public class Ujian3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Matriks_FadilArdiansyah = new int[3][4];
        
        System.out.println("Masukan matriks 2x2 Pertama: ");
        System.out.print("Masukan angka 1A : "); Matriks_FadilArdiansyah[0][0] = input.nextInt();
        System.out.print("Masukan angka 1B : "); Matriks_FadilArdiansyah[0][1] = input.nextInt();
        System.out.print("Masukan angka 2A : "); Matriks_FadilArdiansyah[0][2] = input.nextInt();
        System.out.print("Masukan angka 2B : "); Matriks_FadilArdiansyah[0][3] = input.nextInt();

        System.out.println("\nMasukan matriks 2x2 Kedua: ");
        System.out.print("Masukan angka 1A : "); Matriks_FadilArdiansyah[1][0] = input.nextInt();
        System.out.print("Masukan angka 1B : "); Matriks_FadilArdiansyah[1][1] = input.nextInt();
        System.out.print("Masukan angka 2A : "); Matriks_FadilArdiansyah[1][2] = input.nextInt();
        System.out.print("Masukan angka 2B : "); Matriks_FadilArdiansyah[1][3] = input.nextInt();
        
        Matriks_FadilArdiansyah[2][0] = Matriks_FadilArdiansyah[0][0] * Matriks_FadilArdiansyah[1][0]
        + Matriks_FadilArdiansyah[0][1]*Matriks_FadilArdiansyah[1][2];
        Matriks_FadilArdiansyah[2][1] = Matriks_FadilArdiansyah[0][0] * Matriks_FadilArdiansyah[1][1]
        + Matriks_FadilArdiansyah[0][1]*Matriks_FadilArdiansyah[1][3];
        Matriks_FadilArdiansyah[2][2] = Matriks_FadilArdiansyah[0][2] * Matriks_FadilArdiansyah[1][0]
        + Matriks_FadilArdiansyah[0][3]*Matriks_FadilArdiansyah[1][2];
        Matriks_FadilArdiansyah[2][3] = Matriks_FadilArdiansyah[0][2] * Matriks_FadilArdiansyah[1][1]
        + Matriks_FadilArdiansyah[0][3]*Matriks_FadilArdiansyah[1][3];

        System.out.println("=================================");
        System.out.println("Ouput Program");
        System.out.println("\nMatriks Pertama");
        System.out.println(Matriks_FadilArdiansyah[0][0]+" "+Matriks_FadilArdiansyah[0][1]);
        System.out.println(Matriks_FadilArdiansyah[0][2]+" "+Matriks_FadilArdiansyah[0][3]);
        System.out.println("\nX");
        System.out.println("\nMatriks Kedua");
        System.out.println(Matriks_FadilArdiansyah[1][0]+" "+Matriks_FadilArdiansyah[1][1]);
        System.out.println(Matriks_FadilArdiansyah[1][2]+" "+Matriks_FadilArdiansyah[1][3]);
    
        System.out.println("\nHasil");
        System.out.println(Matriks_FadilArdiansyah[2][0]+" "+Matriks_FadilArdiansyah[2][1]);
        System.out.println(Matriks_FadilArdiansyah[2][2]+" "+Matriks_FadilArdiansyah[2][3]);
        System.out.println("=================================");
        

        input.close();
    }
}