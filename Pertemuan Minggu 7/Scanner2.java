import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luas_FadilArdiansyah;
        System.out.print("Masukan Panjang : ");
        Integer panjang_FadilArdiansyah = sc.nextInt();
        System.out.print("Masukan Lebar : ");
        Integer lebar_FadilArdiansyah = sc.nextInt();
        luas_FadilArdiansyah = panjang_FadilArdiansyah * lebar_FadilArdiansyah;
        System.out.println("Luas persegi panjang : "+ luas_FadilArdiansyah);
        sc.close();
    }
}