import java.util.Scanner;
public class studyKasus2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Byte nilai_FadilArdiansyah;
        char grade_FadilArdiansyah = ' ';
        
        System.out.println("Program Perhitungan Nilai Mahasiswa");
        System.out.println("===================================");
        System.out.print("Masukan Nilai mahasiswa : ");
        nilai_FadilArdiansyah = input.nextByte();
        if (nilai_FadilArdiansyah >= 80 && nilai_FadilArdiansyah <= 100)      grade_FadilArdiansyah = 'A';
        else if (nilai_FadilArdiansyah >= 70 && nilai_FadilArdiansyah <= 79)  grade_FadilArdiansyah = 'B';
        else if (nilai_FadilArdiansyah >= 60 && nilai_FadilArdiansyah <= 69)  grade_FadilArdiansyah = 'C';
        else if (nilai_FadilArdiansyah >= 55 && nilai_FadilArdiansyah <= 59)  grade_FadilArdiansyah = 'D';
        else if (nilai_FadilArdiansyah >= 0 && nilai_FadilArdiansyah <= 54)   grade_FadilArdiansyah = 'E';
        else System.out.println("Salah input nilai");

        switch (grade_FadilArdiansyah) {
            case 'A':
                System.out.println("Grade nilai mahasiswanya adalah : "+ grade_FadilArdiansyah);
                break;
            case 'B':
                System.out.println("Grade nilai mahasiswanya adalah : "+ grade_FadilArdiansyah);
                break;
            case 'C':
                System.out.println("Grade nilai mahasiswanya adalah : "+ grade_FadilArdiansyah);
                break;            
            case 'D':
                System.out.println("Grade nilai mahasiswanya adalah : "+ grade_FadilArdiansyah);
                break;            
            case 'E':
                System.out.println("Grade nilai mahasiswanya adalah : "+ grade_FadilArdiansyah);
                break;
            default:
                break;
        }
        input.close();
    }
}