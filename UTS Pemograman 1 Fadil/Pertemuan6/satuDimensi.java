package Pertemuan6;

public class satuDimensi {

    public static void main(String[] args) {
        // langkah 1 : deklarasi variabel array
        int monthDays_FadilArdiansyah[];
        // langkah 2: penciptaan array bilangan innt dengan 12 elemen
        monthDays_FadilArdiansyah = new int[12];
        monthDays_FadilArdiansyah[0] = 31;
        monthDays_FadilArdiansyah[1] = 29;
        monthDays_FadilArdiansyah[2] = 31;
        monthDays_FadilArdiansyah[3] = 30;
        monthDays_FadilArdiansyah[4] = 31;
        monthDays_FadilArdiansyah[5] = 30;
        monthDays_FadilArdiansyah[6] = 31;
        monthDays_FadilArdiansyah[7] = 31;
        monthDays_FadilArdiansyah[8] = 30;
        monthDays_FadilArdiansyah[9] = 31;
        monthDays_FadilArdiansyah[10] = 30;
        monthDays_FadilArdiansyah[11] = 31;
        System.out.println("Agustus mempunyai "+monthDays_FadilArdiansyah[7]+" Hari");
    }
}