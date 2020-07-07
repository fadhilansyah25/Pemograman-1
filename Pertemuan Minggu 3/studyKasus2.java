import java.io.*;

public class studyKasus2 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String angkaString_FadilArdiansyah = "";
        Byte angka_FadilArdiansyah = 0;

        System.out.print("ketik Angka 0...9 : ");
        try {
            angkaString_FadilArdiansyah = dataIn.readLine();
        } catch (Exception e) {
            System.out.println("Ada Kesalahan !");    
        }
        // konversi nilai string ke Byte
        angka_FadilArdiansyah = new Byte (angkaString_FadilArdiansyah);

        if ( angka_FadilArdiansyah == 0) {
            System.out.println("Angka yang anda ketik adalah nol"); 
        }
        else if ( angka_FadilArdiansyah == 1) {
            System.out.println("Angka yang anda ketik adalah satu"); 
        }
        else if ( angka_FadilArdiansyah == 2) {
            System.out.println("Angka yang anda ketik adalah dua"); 
        }
        else if( angka_FadilArdiansyah == 3){
            System.out.println("Angka yang anda ketik adalah tiga"); 
        }
        else if ( angka_FadilArdiansyah == 4) {
            System.out.println("Angka yang anda ketik adalah empat");     
        }
        else if ( angka_FadilArdiansyah == 5) {
            System.out.println("Angka yang anda ketik adalah lima"); 
        }
        else if ( angka_FadilArdiansyah == 6) {
            System.out.println("Angka yang anda ketik adalah enam"); 
        }
        else if ( angka_FadilArdiansyah == 7) {
            System.out.println("Angka yang anda ketik adalah tujuh"); 
        }
        else if ( angka_FadilArdiansyah == 8) {
            System.out.println("Angka yang anda ketik adalah delapan"); 
        }
        else if ( angka_FadilArdiansyah == 9) {
            System.out.println("Angka yang anda ketik adalah sembilan"); 
        }
        else{
            System.out.println("Angka yang anda ketik tidak sesuai"); 
        }
    }
}