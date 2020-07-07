package Pertemuan5;

public class studyKasus5 {

    public static void main(String[] args) {
        int value1_FadilArdiansyah = 3;
        int value2_FadilArdiansyah = 4;

        for (int i = 0; i < 7; i++) {
            System.out.print(value1_FadilArdiansyah + ", "+value2_FadilArdiansyah+" | ");
            value1_FadilArdiansyah += 3;
            value2_FadilArdiansyah += 4;
        }
    }
}