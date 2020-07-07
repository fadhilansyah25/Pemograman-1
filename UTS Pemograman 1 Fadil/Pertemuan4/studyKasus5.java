package Pertemuan4;

public class studyKasus5 {

    public static void main(String[] args) {
        System.out.print("Bilangan genap menggunakan for : ");
        for (int i = 0; i <= 20; i++) {
            if ( i % 2 == 0) {
                System.out.print(" "+i);
            }
        }

        System.out.print("\nBilangan genap menggunakan while :");
        int ulang_FadilArdiansyah = 0;
        while (ulang_FadilArdiansyah <= 20) {
            if ( ulang_FadilArdiansyah % 2 == 0) {
                System.out.print(" "+ulang_FadilArdiansyah);
            }
            ulang_FadilArdiansyah++;
        }
    }
}