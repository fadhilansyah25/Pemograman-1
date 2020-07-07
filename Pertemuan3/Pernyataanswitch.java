import java.io.*;

public class Pernyataanswitch {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String angkaString_FadilArdiansyah = "";
        Byte angka_FadilArdiansyah = 0;

        System.out.print("ketik Angka 0...9 : ");
        try {
            angkaString_FadilArdiansyah = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");    
        }
        // konversi nilai string ke Byte
        angka_FadilArdiansyah = new Byte (angkaString_FadilArdiansyah);

        switch (angka_FadilArdiansyah) {
            case 0: System.out.println("Angka yang anda ketik adalah nol"); 
                break;
            case 1: System.out.println("Angka yang anda ketik adalah satu"); 
                break;
            case 2: System.out.println("Angka yang anda ketik adalah dua"); 
                break;
            case 3: System.out.println("Angka yang anda ketik adalah tiga");
                break;
            case 4: System.out.println("Angka yang anda ketik adalah empat");     
                break;
            case 5: System.out.println("Angka yang anda ketik adalah lima");
                break;
            case 6: System.out.println("Angka yang anda ketik adalah enam"); 
                break;
            case 7: System.out.println("Angka yang anda ketik adalah tujuh"); 
                break;
            case 8: System.out.println("Angka yang anda ketik adalah delapan"); 
                break;
            case 9: System.out.println("Angka yang anda ketik adalah sembilan"); 
                break;
            default:System.out.println("Angka yang anda ketik tidak sesuai"); 
                break;
        }
    }
}