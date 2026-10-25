package Pertemuan4;
import java.util.Scanner;

public class BilanganGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bil = input.nextInt();

        if (bil % 2 == 0)
            System.out.println(bil + " adalah bilangan genap.");
        else
            System.out.println(bil + " adalah bilangan ganjil.");
    }
}