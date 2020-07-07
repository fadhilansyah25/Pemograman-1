package Pertemuan6;

public class Array2Dimensi {

    public static void main(String[] args) {
        int data_FadilArdiansyah [][] = new int [3][3];
        int i, j;

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                data_FadilArdiansyah[i][j] = i+j; // untuk menginput data[i][j]
            }
        }
        for(i = 0; i < 3; i++) // for pada ini untuk menampilkan data
        {
            for(j = 0; j < 3; j++)
            {
                // menampilkan data
                System.out.print("  "+data_FadilArdiansyah[i][j]); 
            }
            System.out.println(); // membuat baris ke bawah
        }
    }
}