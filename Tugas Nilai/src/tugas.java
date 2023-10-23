import java.util.Scanner;

public class tugas {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama anda : ");
        String nama = scanner.nextLine();
        System.out.print("Masukan NIM: ");
        int nim = scanner.nextInt();
        System.out.print("Masukan nilai Tugas Besar: ");
        double tubes = scanner.nextInt();
        System.out.print("Masukan nilai Quiz: ");
        double quiz = scanner.nextInt();
        System.out.print("Masukan nilai Tugas: ");
        double tugas = scanner.nextInt();
        System.out.print("Masukan nilai UTS: ");
        double uts = scanner.nextInt();
        System.out.print("Masukan nilai UAS: ");
        double uas = scanner.nextInt();
        double nilai = (0.3 *  tubes) + (0.1 * quiz) + (0.1 * tugas) + (0.25 * uts) + (0.25 * uas);
        System.out.println("Nama :" + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Total nilai: " + nilai);
        scanner.close();
        
    }
}
