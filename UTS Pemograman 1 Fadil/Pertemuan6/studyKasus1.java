package Pertemuan6;

import java.util.Scanner;

public class studyKasus1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] names_FadilArdiansyah = new String[2][4];

        names_FadilArdiansyah[0][0] = "Ayah: ";
        names_FadilArdiansyah[0][1] = "Ibu: ";
        names_FadilArdiansyah[0][2] = "Kakak: ";
        names_FadilArdiansyah[0][3] = "adik: ";
        
        // input Nama
        System.out.print("input Nama Ayah : ");
        names_FadilArdiansyah[1][0] = input.nextLine();
        System.out.print("input Nama Ibu : ");
        names_FadilArdiansyah[1][1] = input.nextLine();
        System.out.print("input Nama Kakak : ");
        names_FadilArdiansyah[1][2] = input.nextLine();
        System.out.print("input Nama Adik : ");
        names_FadilArdiansyah[1][3] = input.nextLine();
		System.out.println();

        // menampilkan nama
        // Ayah:
        System.out.println(names_FadilArdiansyah[0][0]+names_FadilArdiansyah[1][0]);
        // Ibu: 
        System.out.println(names_FadilArdiansyah[0][1]+names_FadilArdiansyah[1][1]);
        //  Kakak: 
        System.out.println(names_FadilArdiansyah[0][2]+names_FadilArdiansyah[1][2]);
        //  Kakak: 
        System.out.println(names_FadilArdiansyah[0][3]+names_FadilArdiansyah[1][3]);

        input.close();
    }
}