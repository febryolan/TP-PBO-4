package Pertemuan4;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (y/n) : ");
        char member = in.next().charAt(0);
        boolean punyaMember = (member == 'y' || member == 'Y');

        System.out.print("Masukkan total belanja : Rp. ");
        double total = in.nextDouble();
        double diskon = 0;

        if (punyaMember) {
            if (total > 500000) diskon = 50000;
            else if (total > 100000) diskon = 15000;
        } else {
            if (total > 100000) diskon = 10000;
        }

        double bayar = total - diskon;
        System.out.println("Total setelah diskon : Rp. " + bayar);

        System.out.print("Masukkan uang dibayar : Rp. ");
        double uang = in.nextDouble();

        double kembalian = uang - bayar;
        System.out.println("Kembalian : Rp. " + kembalian);
    }
}