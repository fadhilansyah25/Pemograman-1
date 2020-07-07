import java.util.Scanner;
public class studyKasus4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program inisial nama");
        System.out.print("Masukan inisial nama Anda A...H : ");

        String inisial_FadilArdiansyah = input.nextLine();
        System.out.print("Nama anda Adalah : ");

        switch (inisial_FadilArdiansyah.toUpperCase()) {
            case "A":
                System.out.println("Ardiansyah");
                break;
            case "B" :
                System.out.println("Bobby");
                break;
            case "C" :
                System.out.println("Calista");
                break;
            case "D" :
                System.out.println("Danny");
                break;
            case "E" :
                System.out.println("Erlangga");
                break;
            case "F" :
                System.out.println("Fadil");
                break;
            case "G" :
                System.out.println("Galang");
                break;
            case "H" :
                System.out.println("Hardian");
                break;
            default:
                System.out.println("Salah input inisial");
                break;
        }
        input.close();
    }
}