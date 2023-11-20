public class Main {
    public static void main(String[] args){
        Kucing hewan1 = new Kucing("Cupa", 2, "Persia");
        hewan1.DisplaySemua();
        System.out.println("");

        Kelinci hewan2 = new Kelinci("Oreo", 1, "Anggora");
        hewan2.DisplaySemua();
        System.out.println("");

        Hewan hewan3 = new Hewan("Ucup", 3, "Biasa");
        hewan3.DisplaySemua();
        System.out.println("");

        Hewan hewan4 = new Kucing("Jennet", 4, "Persia");
        hewan4.DisplaySemua();
        System.out.println("");

        Hewan hewan5 = new Kelinci("Cookie", 1, "Anggora");
        hewan5.DisplaySemua();
        System.out.println("");

        Hewan[] semuahewan = new Hewan[2];
        semuahewan[0] = hewan4;
        semuahewan[1] = hewan5;

        semuahewan[0].DisplaySemua();
        semuahewan[1].DisplaySemua();
    }
}

