/**
 * Tugas1_Iteratif
 */
import java.util.Scanner;

public class Tugas1_Iteratif {

    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil;

        System.out.print("Masukkan bilangan: ");
        bil = sc.nextInt();
        System.out.print("Deret Iteratif: ");
        deretIteratif(bil);
    }
}