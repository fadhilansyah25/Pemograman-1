package Pertemuan7;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        String nama_FadilArdiansyah;
        Scanner input_program = new Scanner(System.in);
        System.out.print("Masukan nama Anda: ");
        nama_FadilArdiansyah = input_program.nextLine();
        System.out.println("Nama Anda "+nama_FadilArdiansyah);
        input_program.close();
    }
}