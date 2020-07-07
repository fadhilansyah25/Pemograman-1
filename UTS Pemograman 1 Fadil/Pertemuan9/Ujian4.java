package Pertemuan9;

import java.util.Scanner;
public class Ujian4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username_FadilArdiansyah,  pilmenu_FadilArdiansyah = " ";
        boolean loop_FadilArdiansyah = true;
        int pilih_FadilArdiansyah, bayar_FadilArdiansyah, password_FadilArdiansyah,
        kembalian_FadilArdiansyah = 0,total_FadilArdiansyah = 0;

        System.out.println("===============================");
        System.out.print("Username : ");username_FadilArdiansyah = input.nextLine();
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.print("Password : ");password_FadilArdiansyah = input.nextInt();
        System.out.println("===============================");

        if(username_FadilArdiansyah.equals("fadil") && password_FadilArdiansyah == 12345)
        {
           
            System.out.println("===============================");
            System.out.println("1. Bakso             = Rp. 8000");
            System.out.println("2. Mie ayam          = Rp. 8000");
            System.out.println("===============================");
            System.out.println("3. Hitung");
            System.out.println("4. Batal Pesan");
            System.out.println("===============================");

            while (loop_FadilArdiansyah) 
            {   
                System.out.print("Masukan pilihan : "); 
                pilih_FadilArdiansyah = input.nextInt();

                switch (pilih_FadilArdiansyah) {
                    case 1: System.out.println("Anda membeli bakso seharga Rp. 8000");
                            System.out.println("===============================");
                            pilmenu_FadilArdiansyah = "Bakso, "+pilmenu_FadilArdiansyah;
                            total_FadilArdiansyah = total_FadilArdiansyah + 8000;
                            break;
                    case 2: System.out.println("Anda membeli Mie Ayam seharga Rp. 8000");
                            System.out.println("===============================");
                            pilmenu_FadilArdiansyah = "Mie Ayam, "+pilmenu_FadilArdiansyah;
                            total_FadilArdiansyah = total_FadilArdiansyah + 8000;
                            break;
                    case 3: System.out.println("Anda membeli : "+pilmenu_FadilArdiansyah);
                            System.out.println("Total yang harus anda bayar adalah : Rp."+total_FadilArdiansyah);
                            System.out.println("===============================");
                            System.out.print("Anda membayar : Rp.");
                            bayar_FadilArdiansyah = input.nextInt();
                            kembalian_FadilArdiansyah = bayar_FadilArdiansyah - total_FadilArdiansyah;
                            System.out.println("===============================");
                            System.out.println("kembalian anda : Rp."+kembalian_FadilArdiansyah);
                            System.out.println("===============================");
                            loop_FadilArdiansyah = false;
                            break;
                    case 4: System.out.println("Anda Batal Memesan");
                            loop_FadilArdiansyah = false;
							break;
                    default: System.out.println("Maaf, pilhan yang anda input tidak ada");
                        break;
                }

            }
            System.out.println("\nTerima Kasih");
        }
        else{
            System.out.println("Username dan Passwaor yang anda masukan salah");
        }
        input.close();
    }
}