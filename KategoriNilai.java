import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Anda:");
        int nilai = input.nextInt();

        if (nilai >= 96 && nilai <= 100) {
            System.out.println("A+");
        }   else if (nilai >= 95 && nilai <= 91) {
            System.out.println("A");
        }   else if (nilai >= 86 && nilai <= 90) {
            System.out.println("B+");
        }   else if (nilai >= 81 && nilai <= 85) {
            System.out.println("B");
        }   else if (nilai >= 75 && nilai <= 80) {
            System.out.println("B-");
        }   else if (nilai >= 70 && nilai <= 74) {
            System.out.println("C+");
        }   else if (nilai >= 65 && nilai <= 69) {
            System.out.println("C");
        }   else if (nilai >= 60 && nilai <= 64) {
            System.out.println("C-");
        }   else if (nilai >= 55 && nilai <= 59) {
            System.out.println("D+");
        }   else if (nilai >= 0 && nilai <= 54 ) {
            System.out.println("D");
        }
    }
}


