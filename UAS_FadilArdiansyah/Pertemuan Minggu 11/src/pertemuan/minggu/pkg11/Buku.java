package pertemuan.minggu.pkg11;

public class Buku {
    // Variabel
    String judul_FadilArdiansyah, pengarang_FadilArdiansyah, penerbit_FadilArdiansyah;
    int tahun_FadilArdiansyah;

    // constructor Detail Buku dengan parameter
    public String DetailBuku(String judul, String pengarang, String penerbit, int tahun){
        judul_FadilArdiansyah = judul;
        pengarang_FadilArdiansyah = pengarang;
        penerbit_FadilArdiansyah = penerbit;
        tahun_FadilArdiansyah = tahun;
        return penerbit;
    }

    // method Cetak Buku
    void cetakBuku(){
        System.out.println(pengarang_FadilArdiansyah+", "+judul_FadilArdiansyah
        +", "+penerbit_FadilArdiansyah+", "+tahun_FadilArdiansyah);
    }
}