import java.util.Scanner;
public class studyKasus2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama_FadilArdiansyah = new String[3];
        String[] pekerjaan_FadilArdiansyah = new String[3];
        String[] hobby_FadilArdiansyah = new String[3];

        System.out.println("====================");
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukan Nama "+(i+1)+": ");
            nama_FadilArdiansyah[i] = input.nextLine();
        }
        System.out.println("====================");
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukan Pekerjaaan "+(i+1)+": ");
            pekerjaan_FadilArdiansyah[i] = input.nextLine();
        }
        System.out.println("====================");
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukan Hobby "+(i+1)+": ");
            hobby_FadilArdiansyah[i] = input.nextLine();
        }
        System.out.println("=====================================================================");
        System.out.println("HASIL TAMPILAN");
        System.out.println("|Nama:\t|Pekerjaan:\t|Hobby:\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("|"+nama_FadilArdiansyah[i]+"\t");
            System.out.print("|"+pekerjaan_FadilArdiansyah[i]+"\t");
            System.out.print("|"+hobby_FadilArdiansyah[i]+"\n");
            System.out.println();
        }

        input.close();
    }
}