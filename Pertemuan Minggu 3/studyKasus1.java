import java.io.*;

public class studyKasus1 {

    public static void main(final String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String nama_FadilArdiansyah = "";
        String nim_FadilArdiansyah = "";
        String nilaiString_FadilArdiansyah = "";
        Byte nilai_FadilArdiansyah = 0;

        System.out.print("Masukan Nama : ");
        try {
            nama_FadilArdiansyah = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");
        };
        System.out.print("Masukan NIM : ");
        try {
            nim_FadilArdiansyah = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");
        };
        System.out.print("Masukan Nilai : ");
        try {
            nilaiString_FadilArdiansyah = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada Kesalahan !");
        };

        nilai_FadilArdiansyah = new Byte(nilaiString_FadilArdiansyah);

        System.out.println("==============================================");
        System.out.println("================ Menampilkan Data ============");
        System.out.println("Nama : "+nama_FadilArdiansyah);
        System.out.println("NIM  : "+nim_FadilArdiansyah);

        if (nilai_FadilArdiansyah >= 80) {
            System.out.println("Selamat Anda Lulus!");
            System.out.println("Karena Nilai Anda "+nilai_FadilArdiansyah );
        } else {
            System.out.println("Maaf Anda Belum Lulus!");
            System.out.println("Karena Nilai Anda "+nilai_FadilArdiansyah );
        }
    }
}