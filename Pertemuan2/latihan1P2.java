import java.util.Scanner;

public class latihan1P2 {

    public static void main(String[] args) {
        
        Scanner save = new Scanner(System.in);
        String nama = " ";
        System.out.print("Input nama : ");
        nama = save.nextLine();

        System.out.println("Nama saya adalah "+nama);
		save.close();
    }
}