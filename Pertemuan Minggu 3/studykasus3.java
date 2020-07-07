import java.util.Scanner;

public class studykasus3 {

    public static void main(String[] args) {
        Scanner dataIn = new Scanner(System.in);

        System.out.print("Masukan Inisial (M/F/A) : ");
        char Inisial_FadilArdiansyah = dataIn.next().charAt(0);

        if ( Inisial_FadilArdiansyah == 'M' || Inisial_FadilArdiansyah == 'm') {
            System.out.println("Nama anda adalah Muhammad");
        }
        else if ( Inisial_FadilArdiansyah == 'F' || Inisial_FadilArdiansyah == 'f') {
            System.out.println("Nama anda adalah fadil");
        }
        else if ( Inisial_FadilArdiansyah == 'A' || Inisial_FadilArdiansyah == 'a') {
            System.out.println("Nama anda adalah Ardiansyah");
        }

        dataIn.close();
    }
}