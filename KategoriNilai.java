import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Anda:");
        int nilai = input.nextInt();

        if (nilai >= 90 && nilai <= 100) {
            System.out.println("A");
        }   else if (nilai >= 70 && nilai <= 89) {
            System.out.println("B");
        }   else if (nilai >= 50 && nilai <= 69) {
            System.out.println("C");
        }   else if (nilai <= 49) {
            System.out.println("D");
        }
}
}