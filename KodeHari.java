package Pertemuan4;
import java.util.Scanner;

public class KodeHari {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        System.out.print("Masukkan kode : ");
        int kode = input.nextInt();
            switch (kode) {
                case 1:
                    System.out.println("Senin");
                    break;
                case 2:
                    System.out.println("Selasa");
                    break;
                case 3:
                    System.out.println("Rabu");
                    break;
                case 4:
                    System.out.println("Kamis");
                    break;
                case 5:
                    System.out.println("Jumat");
                    break;
                case 6:
                    System.out.println("Sabtu");
                    break;
                case 7:
                    System.out.println("Minggu");
                    break;
                default:
                    System.out.println("Kode tidak valid");
            }
        }
    }
}