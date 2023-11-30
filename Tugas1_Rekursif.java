
/**
 * Tugas1_Rekursif
 */
import java.util.Scanner;

public class Tugas1_Rekursif {

    static void deretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil;

        System.out.print("Masukkan bilangan: ");
        bil = sc.nextInt();
        System.out.print("Deret Rekursif: ");
        deretRekursif(bil);
    }
}