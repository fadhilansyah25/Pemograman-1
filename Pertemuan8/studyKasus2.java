import java.util.Scanner;
public class studyKasus2 {
    public static void main(String[] args) {
        Scanner simpan =  new Scanner(System.in);
        int total_FadilArdiansyah = 0, bayar_FadilArdiansyah, kembalian_FadilArdiansyah = 0;
        boolean loop_FadilArdiansyah = true;
        
        String pilihMenu_FadilArdiansyah = " ";
        System.out.println("Menu Restoran:");
        System.out.println("1. Nasi Goreng      2. Nasi Rawon      3. Nasi Gudeg    4. Pecel Ayam");
        System.out.println("5. Hitung Total     6. Keluar Aplikasi");

        while(loop_FadilArdiansyah)
        {
            System.out.print("Pilih Menu ? : ");
            int pilihan = simpan.nextInt();
            switch(pilihan){
                case 1: pilihMenu_FadilArdiansyah = "Nasi Goreng, "+pilihMenu_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + 15000;
                        break;
                case 2: pilihMenu_FadilArdiansyah = "Nasi Rawon, "+pilihMenu_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + 15000;
                        break;
                case 3: pilihMenu_FadilArdiansyah = "Nasi Gudeg, "+pilihMenu_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + 15000;
                        break;
                case 4: pilihMenu_FadilArdiansyah = "Pecel Ayam, "+pilihMenu_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + 15000;
                        break;
                case 5: System.out.println("\nPilihan menu adalah "+pilihMenu_FadilArdiansyah);
                        System.out.println("Total yang harus dibayarkan adalah Rp."+total_FadilArdiansyah+"\n");
                        break;
                case 6: System.out.println("Keluar Aplikasi");
                        loop_FadilArdiansyah = false;
                        break;
                default: System.out.println("Maaf, input menu yang anda masukan tidak sesuai");
            }
        }
        System.out.print("\nUang yang dibayarkan : Rp.");bayar_FadilArdiansyah = simpan.nextInt();
        kembalian_FadilArdiansyah = bayar_FadilArdiansyah - total_FadilArdiansyah;
        System.out.println("Uang kembalian anda : Rp."+kembalian_FadilArdiansyah);
        simpan.close();
    }
}