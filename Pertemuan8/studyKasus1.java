import java.util.Scanner;
public class studyKasus1 {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        int hargaPensil_FadilArdiansyah = 2000,
            hargaBuku_FadilArdiansyah = 3500,
            hargaPulpen_FadilArdiansyah = 4000,
            hargaSpidol_FadilArdiansyah = 5000,
            hargaPenghapus_FadilArdiansyah = 1500,
            total_FadilArdiansyah = 0;
        boolean keluar = false;
        
        String loop_FadilArdiansyah, pilihMenu_FadilArdiansyah = "";
        int satuan_FadilArdiansyah = 0;
        System.out.println("--------------------------------------");
        System.out.println("|           Toko Ku                  |");
        System.out.println("--------------------------------------");
        System.out.println("| 1. Pensil                 : Rp 2000 ");
        System.out.println("| 2. Buku                   : Rp 3500 ");
        System.out.println("| 3. Pulpen                 : Rp 4000 ");
        System.out.println("| 4. Spidol                 : Rp 3500 ");
        System.out.println("| 5. Penghapus              : Rp 3500 ");
        System.out.println("| 6. Exit                   |");
        System.out.println("--------------------------------------");

        for(loop_FadilArdiansyah = "Y"; loop_FadilArdiansyah.equals("Y") || loop_FadilArdiansyah.equals("y");)
        {
            System.out.print("Pilih Menu (1 s/d 6)  : ");
            int pilihan = simpan.nextInt();

            switch(pilihan){
                case 1: System.out.println("Anda memilih Pensil     : Rp 2000");
                        pilihMenu_FadilArdiansyah = "Pensil, "+pilihMenu_FadilArdiansyah;
                        satuan_FadilArdiansyah = 1 + satuan_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + hargaPensil_FadilArdiansyah;
                        break;
                case 2: System.out.println("Anda memilih Buku     : Rp 2000");
                        pilihMenu_FadilArdiansyah = "Buku, "+pilihMenu_FadilArdiansyah;
                        satuan_FadilArdiansyah = 1 + satuan_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + hargaBuku_FadilArdiansyah;
                        break;
                case 3: System.out.println("Anda memilih Pulpen     : Rp 4000");
                        pilihMenu_FadilArdiansyah = "Pulpen, "+pilihMenu_FadilArdiansyah;
                        satuan_FadilArdiansyah = 1 + satuan_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + hargaPulpen_FadilArdiansyah;
                        break;
                case 4: System.out.println("Anda memilih Spidol     : Rp 3500");
                        pilihMenu_FadilArdiansyah = "Spidol, "+pilihMenu_FadilArdiansyah;
                        satuan_FadilArdiansyah = 1 + satuan_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + hargaSpidol_FadilArdiansyah;
                        break;
                case 5: System.out.println("Anda memilih Penghapus     : Rp 2000");
                        pilihMenu_FadilArdiansyah = "Penghapus, "+pilihMenu_FadilArdiansyah;
                        satuan_FadilArdiansyah = 1 + satuan_FadilArdiansyah;
                        total_FadilArdiansyah = total_FadilArdiansyah + hargaPenghapus_FadilArdiansyah;
                        break;
                case 6: System.out.println("Selesai");
                        keluar = true;
                        break;
                default: System.out.println("Maaf, input menu yang anda masukan tidak sesuai");
            }
            if (keluar) {
                break;
            }
            System.out.print("Ada lagi yang akan dipesan? (Y/N) : ");
            loop_FadilArdiansyah = simpan.next();
        }
        System.out.println("--------------------------------------");
        System.out.println("Barang yang anda pesan adalah               : "+pilihMenu_FadilArdiansyah);
        System.out.println("Total Belanjaan Anda                        : "+satuan_FadilArdiansyah);
        System.out.println("Terima Kasih, total yang anda harus bayar   : "+total_FadilArdiansyah);
        System.out.println("--------------------------------------");
    }
}