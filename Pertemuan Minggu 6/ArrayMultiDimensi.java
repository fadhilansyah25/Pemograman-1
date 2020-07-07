public class ArrayMultiDimensi {

    public static void main(String[] args) {
        String[][] names_FadilArdiansyah = {{"Ayah: ", "Ibu: ", "Kakak: "},
        {"Smith", "sinta", "Nina"}};
        // Ayah: Smith
        System.out.println(names_FadilArdiansyah[0][0]+names_FadilArdiansyah[1][0]);
        // Ibu: Sinta
        System.out.println(names_FadilArdiansyah[0][1]+names_FadilArdiansyah[1][1]);
        //  Kakak: Nina
        System.out.println(names_FadilArdiansyah[0][2]+names_FadilArdiansyah[1][2]);
    }
}