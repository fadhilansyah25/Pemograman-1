package Pertemuan4;

public class studyKasus1 {

    public static void main(String[] args) {
        byte ulang_FadilArdiansyah = 12;

        while (ulang_FadilArdiansyah >= 0) {
            if (ulang_FadilArdiansyah == 0) {
                System.out.print(ulang_FadilArdiansyah);
            } else {       
                System.out.print(ulang_FadilArdiansyah+", previous ");
            }
            ulang_FadilArdiansyah--;
        }
    }
}