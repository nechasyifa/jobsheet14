/**
 * Tugas3
 */
import java.util.Scanner;

public class Tugas3 {

    static boolean prima(int n, int bil) {

        if (n <= 2) {
            return (n == 2);
        }
        if (n % bil == 0) {
            return false;
        }
        if (bil * bil > n) {
            return true;
        }
        return prima(n, bil + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();
        if (prima(n, 2)) {
            System.out.print(n + " adalah bilangan prima");
        } else {
            System.out.print(n + " bukan bilangan prima");
        }
    }
}