package barang;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.println("Selamat Datang");
        System.out.println("Menu Barang: ");
        System.out.println("1. Roti");
        System.out.println("2. Susu");
        System.out.println("3. Sabun");
        System.out.print("Masukan pilihhan: ");
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();
        if(menu == 1){
            System.out.print("Masukan nama roti yang dipilih: ");
            scanner.nextLine();
            String namaRoti = scanner.nextLine();
            System.out.print("Masukan harga roti yang dipilih: ");
            int hargaRoti = scanner.nextInt();
            System.out.print("Masukan jumlah roti yang dibeli: ");
            int jumlahRoti = scanner.nextInt();
            Roti roti1 = new Roti(namaRoti, hargaRoti, jumlahRoti);
            while(true){
                System.out.println("Menu Metode");
                System.out.println("1. Tampilkan harga");
                System.out.println("2. Tampilkan nama");
                System.out.println("3. Harga yang harus dibayar");
                System.out.println("4. Tanggal Expired");
                System.out.print("Menu yang dipilih: ");
                int pilihanRoti = scanner.nextInt();
                if (pilihanRoti == 1) {
                    roti1.Displayharga();
                    System.out.println("");
                } else if(pilihanRoti == 2){
                    roti1.Displaynama();
                    System.out.println("");
                } else if (pilihanRoti == 3){
                    roti1.Diskon();
                    System.out.println("");
                } else if  (pilihanRoti == 4){
                    roti1.Expired();
                    System.out.println("");
                } else {
                    System.out.println("Maaf pilihan tidak tersedia");
                    System.out.println("");
                    break;
                }
            }
        }else if (menu ==2){
            System.out.print("Masukan nama susu yang dipilih: ");
            scanner.nextLine();
            String namaSusu = scanner.nextLine();
            System.out.print("Masukan harga susu yang dipilih: ");
            int hargaSusu = scanner.nextInt();
            System.out.print("Masukan jumlah susu yang dibeli: ");
            int jumlahSusu = scanner.nextInt();
            Susu susu1 = new Susu(namaSusu, hargaSusu, jumlahSusu);
            while(true){
                System.out.println("Menu Metode");
                System.out.println("1. Tampilkan harga");
                System.out.println("2. Tampilkan nama");
                System.out.println("3. Harga yang harus dibayar");
                System.out.println("4. Tanggal Expired");
                System.out.print("Menu yang dipilih: ");
                int pilihanSusu = scanner.nextInt();
                if (pilihanSusu == 1) {
                    susu1.Displayharga();
                    System.out.println("");
                } else if(pilihanSusu == 2){
                    susu1.Displaynama();
                    System.out.println("");
                } else if (pilihanSusu == 3){
                    susu1.Diskon();
                    System.out.println("");
                } else if (pilihanSusu == 4){
                    susu1.Expired();
                    System.out.println("");
                } else {
                    System.out.println("Maaf pilihan tidak tersedia");
                    System.out.println("");
                    break;
                }
            }
            
        }else if (menu ==3){
            System.out.print("Masukan nama sabun yang dipilih: ");
            scanner.nextLine();
            String namaSabun = scanner.nextLine();
            System.out.print("Masukan harga sabun yang dipilih: ");
            int hargaSabun = scanner.nextInt();
            System.out.print("Masukan jumlah sabun yang dibeli: ");
            int jumlahSabun = scanner.nextInt();
            Sabun sabun1 = new Sabun(namaSabun, hargaSabun, jumlahSabun);
            while(true){
                System.out.println("Menu Metode");
                System.out.println("1. Tampilkan harga");
                System.out.println("2. Tampilkan nama");
                System.out.println("3. Harga yang harus dibayar");
                System.out.println("4. Tanggal Expired");
                System.out.print("Menu yang dipilih: ");
                int pilihanSabun = scanner.nextInt();
                if (pilihanSabun == 1) {
                    sabun1.Displayharga();
                    System.out.println("");
                } else if(pilihanSabun == 2){
                    sabun1.Displaynama();
                    System.out.println("");
                } else if (pilihanSabun == 3){
                    sabun1.Diskon();
                    System.out.println("");
                } else if  (pilihanSabun == 4){
                    sabun1.Expired();
                    System.out.println("");
                } else {
                    System.out.println("Maaf pilihan tidak tersedia");
                    System.out.println("");
                    break;
                }
            }
        }else{
            System.out.println("Maaf barang tersebut tidak tersedia...");
        }
        scanner.close();
    }

}
