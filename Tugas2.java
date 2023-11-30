import java.util.Scanner;

public class Tugas2 {

    static int penjumlahanRekursif(int n, int bil, int jml) {
        if (bil == n + 1) {
            System.out.print(" = " + jml);
            return (1);
        } else {
            System.out.print(bil);
            if (n >= bil + 1) {
                System.out.print(" + ");
            }
            return (penjumlahanRekursif(n, bil + 1, jml + bil));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();

        int hasil = penjumlahanRekursif(n, 1, 0);
    }
}
