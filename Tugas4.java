/**
 * Tugas4
 */
import java.util.Scanner;

public class Tugas4 {

    static int fibonacci(int n) {
        if (n <= 1) {
            return (n);
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minggu ke: ");
        int minggu = sc.nextInt();
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + minggu + " : " + fibonacci(minggu));
    }
}