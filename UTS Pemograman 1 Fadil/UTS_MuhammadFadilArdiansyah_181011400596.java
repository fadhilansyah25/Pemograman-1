import java.util.Scanner;

import Pertemuan1.Latihan1;
import Pertemuan2.latihan1P2; 
import Pertemuan2.studyKasus1;
import Pertemuan3.Pernyataanif1; 
import Pertemuan3.Pernyataanif2; 
import Pertemuan3.Pernyataanifelse1;
import Pertemuan3.Pernyataanifelse2; 
import Pertemuan3.Pernyataanswitch; 
import Pertemuan3.studyKasus2;
import Pertemuan3.studykasus3;
import Pertemuan4.latihanDoWhile;
import Pertemuan4.latihanFor;
import Pertemuan4.latihanWhile;
import Pertemuan4.studyKasus3;
import Pertemuan4.studyKasus4;
import Pertemuan4.studyKasus5;
import Pertemuan6.Array2Dimensi;
import Pertemuan6.ArrayMultiDimensi;
import Pertemuan6.ArraySample;
import Pertemuan6.ArraySample2;
import Pertemuan6.satuDimensi;
import Pertemuan7.Scanner1;
import Pertemuan7.Scanner2;
import Pertemuan7.scannerIfElse;
import Pertemuan7.studykasus2;
import Pertemuan9.Ujian1;
import Pertemuan9.Ujian2;
import Pertemuan9.Ujian3;
import Pertemuan9.Ujian4;

public class UTS_MuhammadFadilArdiansyah_181011400596 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, pilihJen;

        System.out.println("Program rangkuman Pemograman 1");
        System.out.println("===============================");
        System.out.println("1. Pertemuan 1");
        System.out.println("2. Pertemuan 2");
        System.out.println("3. Pertemuan 3");
        System.out.println("4. Pertemuan 4");
        System.out.println("5. Pertemuan 5");
        System.out.println("6. Pertemuan 6");
        System.out.println("7. Pertemuan 7");
        System.out.println("8. Pertemuan 8");
        System.out.println("9. Pertemuan 9");
        System.out.println("10. Keluar");
        System.out.println("===============================");
        System.out.print("Pilih Pertemuan : "); pilih = input.nextInt();

        switch (pilih) {
            case 1: System.out.println("\n===============================");
                    System.out.println("Pertemuan 1");
                    System.out.println("\tLatihan :");
                    System.out.println("\t\t 1. Latihan 1(Program Mode Teks)");
                    System.out.println("\tStudy Kasus :");
                    System.out.println("\t\t Tidak Ada Study Kasus pada Pertemuan 1");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Latihan1 Program Mode Teks");
                                Latihan1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;
            case 2: System.out.println("\nPertemuan 2");
                    System.out.println("===============================");
                    System.out.println("\tLatihan :");
                    System.out.println("\t\t 1. Latihan 1");
                    System.out.println("\tStudy Kasus :");
                    System.out.println("\t\t 2. Study Kasus 1");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Latihan1");
                                latihan1P2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        case 2: System.out.println("\n===============================");
                                System.out.println("Study Kasus 1");
                                studyKasus1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;
            case 3: System.out.println("===============================");
                    System.out.println("\nPertemuan 3");
                    System.out.println("\tLatihan :");
                    System.out.println("\t\t 1. Latihan 1 (Percabangan dengan if)");
                    System.out.println("\t\t 2. Latihan 2 (Percabangan dengan if 2)");
                    System.out.println("\t\t 3. Latihan 3 (Percabangan dengan if-else)");
                    System.out.println("\t\t 4. Latihan 4 (Percabangan dengan if-else)");
                    System.out.println("\t\t 5. Latihan 5 (Percabangan dengan Switch)");
                    System.out.println("\tStudy Kasus :");
                    System.out.println("\t\t 6. Study Kasus 1");
                    System.out.println("\t\t 7. Study Kasus 2");
                    System.out.println("\t\t 8. Study Kasus 3");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Latihan 1");
                                Pernyataanif1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        case 2: System.out.println("\n===============================");
                                System.out.println("Latihan 2");
                                Pernyataanif2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        case 3: System.out.println("\n===============================");
                                System.out.println("Latihan 3");
                                Pernyataanifelse1.main(args);  
                                break;
                        case 4: System.out.println("\n===============================");
                                System.out.println("Latihan 4");
                                Pernyataanifelse2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        case 5: System.out.println("\n===============================");
                                System.out.println("Latihan 5");
                                Pernyataanswitch.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;                                 
                        case 6: System.out.println("\n===============================");
                                System.out.println("Study Kasus 1");
                                Pertemuan3.studyKasus1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan =="); 
                                break;
                        case 7: System.out.println("\n===============================");
                                System.out.println("Study Kasus 2");
                                studyKasus2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan =="); 
                                break;
                        case 8: System.out.println("\n===============================");
                                System.out.println("Study Kasus 1");
                                studykasus3.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;
            case 4: System.out.println("===============================");
                    System.out.println("\nPertemuan 4");
                    System.out.println("\tLatihan :");
                    System.out.println("\t\t 1. Latihan 1 (Pernyataan Dalam Bentuk While)");
                    System.out.println("\t\t 2. Latihan 2 (Menggunakan do-while)");
                    System.out.println("\t\t 3. Latihan 3 (Menggunakan for)");
                    System.out.println("\tStudy Kasus :");
                    System.out.println("\t\t 4. Study Kasus 1");
                    System.out.println("\t\t 5. Study Kasus 2");
                    System.out.println("\t\t 6. Study Kasus 3");
                    System.out.println("\t\t 7. Study Kasus 4");
                    System.out.println("\t\t 8. Study Kasus 5");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Latihan 1");
                                latihanWhile.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");      
                                break;
                        case 2: System.out.println("\n===============================");
                                System.out.println("Latihan 2");
                                latihanDoWhile.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");       
                                break;
                        case 3: System.out.println("\n===============================");
                                System.out.println("Latihan 3");
                                latihanFor.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");     
                                break;
                        case 4: System.out.println("\n===============================");
                                System.out.println("Study Kasus 1");
                                Pertemuan4.studyKasus1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");      
                                break;
                        case 5: System.out.println("\n===============================");
                                System.out.println("Study Kasus 2");
                                Pertemuan4.studyKasus2.main(args); 
                                System.out.println("\n== Program Berhasil Dijalankan ==");      
                                break;                                 
                        case 6: System.out.println("\n===============================");
                                System.out.println("Study Kasus 3");
                                studyKasus3.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        case 7: System.out.println("\n===============================");
                                System.out.println("Study Kasus 4");
                                studyKasus4.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");
                                break;
                        case 8: System.out.println("\n===============================");
                                System.out.println("Study Kasus 5");
                                studyKasus5.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;
            case 5: System.out.println("===============================");
                    System.out.println("\nPertemuan 5");
                    System.out.println("\tUJIAN Pertemuan 5 :");
                    System.out.println("\t\t 1. Ujian 1 Pertemuan 5");
                    System.out.println("\t\t 2. Ujian 2 Pertemuan 5");
                    System.out.println("\t\t 3. Ujian 3 Pertemuan 5");
                    System.out.println("\t\t 4. Ujian 4 Pertemuan 5");
                    System.out.println("\t\t 5. Ujian 5 Pertemuan 5");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Ujian 1 Pertemuan 5");
                                Pertemuan5.studyKasus1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");     
                                break;
                        case 2: System.out.println("\n===============================");
                                System.out.println("Ujian 2 Pertemuan 5");
                                Pertemuan5.studyKasus2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");     
                                break;
                        case 3: System.out.println("\n===============================");
                                System.out.println("Ujian 3 Pertemuan 5");
                                Pertemuan5.studyKasus3.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");   
                                break;
                        case 4: System.out.println("\n===============================");
                                System.out.println("Ujian 4 Pertemuan 5");
                                Pertemuan5.studyKasus4.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");    
                                break;
                        case 5: System.out.println("\n===============================");
                                System.out.println("Ujian 5 Pertemuan 5");
                                Pertemuan5.studyKasus5.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");     
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;
            case 6: System.out.println("===============================");
                    System.out.println("\nPertemuan 6");
                    System.out.println("\tLatihan :");
                    System.out.println("\t\t 1. Latihan 1 (Array Sample)");
                    System.out.println("\t\t 2. Latihan 2 (Array Sample 2)");
                    System.out.println("\t\t 3. Latihan 3 (Array Satu Dimensi)");
                    System.out.println("\t\t 4. Latihan 3 (Array dua Dimensi)");
                    System.out.println("\t\t 3. Latihan 3 (Array Multi Dimensi)");
                    System.out.println("\tStudy Kasus :");
                    System.out.println("\t\t 6. Study Kasus 1");
                    System.out.println("\t\t 7. Study Kasus 2");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Latihan 1");
                                ArraySample.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");   
                                break;
                        case 2: System.out.println("\n===============================");
                                System.out.println("Latihan 2");
                                ArraySample2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");   
                                break;
                        case 3: System.out.println("\n===============================");
                                System.out.println("Latihan 3");
                                satuDimensi.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan =="); 
                                break;
                        case 4: System.out.println("\n===============================");
                                System.out.println("Latihan 4");
                                Array2Dimensi.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        case 5: System.out.println("\n===============================");
                                System.out.println("Latihan 5");
                                ArrayMultiDimensi.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");   
                                break;                                 
                        case 6: System.out.println("\n===============================");
                                System.out.println("Study Kasus 1");
                                Pertemuan6.studyKasus1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        case 7: System.out.println("\n===============================");
                                System.out.println("Study Kasus 2");
                                Pertemuan6.studyKasus2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan =="); 
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;
            case 7: System.out.println("===============================");
                    System.out.println("\nPertemuan 7");
                    System.out.println("\tLatihan :");
                    System.out.println("\t\t 1. Latihan 1 (Latihan Scanner 1)");
                    System.out.println("\t\t 2. Latihan 2 (Latihan Scanner 2)");
                    System.out.println("\t\t 3. Latihan 3 (Latihan Scanner 3)");
                    System.out.println("\tStudy Kasus :");
                    System.out.println("\t\t 4. Study Kasus 1");
                    System.out.println("\t\t 5. Study Kasus 2");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Latihan 1");
                                Scanner1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");   
                                break;
                        case 2: System.out.println("\n===============================");
                                System.out.println("Latihan 2");
                                Scanner2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");   
                                break;
                        case 3: System.out.println("\n===============================");
                                System.out.println("Latihan 3");
                                scannerIfElse.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan =="); 
                                break;                               
                        case 4: System.out.println("\n===============================");
                                System.out.println("Study Kasus 1");
                                Pertemuan7.studyKasus1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;
                        case 5: System.out.println("\n===============================");
                                System.out.println("Study Kasus 2");
                                studykasus2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan =="); 
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;
            case 8: System.out.println("===============================");
                    System.out.println("\nPertemuan 8");
                    System.out.println("\tLatihan :");
                    System.out.println("\t\t 1. Latihan 1 (Membuat Aplikasi Console Toko KU)");
                    System.out.println("\tStudy Kasus :");
                    System.out.println("\t\t 2. Study Kasus 1");
                    System.out.println("\t\t 3. Study Kasus 2");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Latihan 1 (Membuat Aplikasi Console Toko KU)");
                                Pertemuan8.Latihan1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;                           
                        case 2: System.out.println("\n===============================");
                                System.out.println("Study Kasus 1");
                                Pertemuan8.studyKasus1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan =="); 
                                break;
                        case 3: System.out.println("\n===============================");
                                System.out.println("Study Kasus 2");
                                Pertemuan8.studyKasus2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;
            case 9: System.out.println("===============================");
                    System.out.println("\nPertemuan 9");
                    System.out.println("\tUJIAN Pertemuan 9 :");
                    System.out.println("\t\t 1. Ujian 1 (Penjumlahan dan Pengurangan Matriks 2x2)");
                    System.out.println("\t\t 2. Ujian 2 (Penjumlahan dan Pengurangan Matriks 2x2 2)");
                    System.out.println("\t\t 3. Ujian 3 (Perkalian Matriks 2x2)");
                    System.out.println("\t\t 4. Ujian 4 (Program Jual Beli Bakso)");
                    System.out.println("===============================");
                    System.out.print("Pilih Program : "); pilihJen = input.nextInt();
                    switch (pilihJen) {
                        case 1: System.out.println("\n===============================");
                                System.out.println("Ujian 1 Pertemuan 9");
                                Ujian1.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");  
                                break;                           
                        case 2: System.out.println("\n===============================");
                                System.out.println("Ujian 2 Pertemuan 9");
                                Ujian2.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan =="); 
                                break;
                        case 3: System.out.println("\n===============================");
                                System.out.println("Ujian 3 Pertemuan 9");
                                Ujian3.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");
                                break;
                        case 4: System.out.println("\n===============================");
                                System.out.println("Ujian 4 Pertemuan 9");
                                Ujian4.main(args);
                                System.out.println("\n== Program Berhasil Dijalankan ==");
                                break;
                        default: System.out.println("Pilihan yang anda input tidak ada");
                                break;
                    }
                    break;             
            default:
                break;
        }
        input.close();
    }
}