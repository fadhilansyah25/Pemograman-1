package pertemuan.minggu.pkg11;

public class BukuBeraksi {
    public static void main(String[] args) {
        Buku isiBuku = new Buku();

        isiBuku.DetailBuku("Teach Yourself Java 6 in 21 Days", 
        "Rogers Cadenhead & Laura Lemay", "Sams Publishing", 2007);
        isiBuku.cetakBuku();
        isiBuku.DetailBuku("Java How to Program 7th Edition", 
        "Deitel & Deitel", "Pretince Hall", 2007);
        isiBuku.cetakBuku();
    }
}