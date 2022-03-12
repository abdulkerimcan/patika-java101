import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.0,toplam = 0;
        int kilo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo");
        kilo = scanner.nextInt();
        toplam += kilo * armut;

        System.out.println("elma Kaç Kilo");
        kilo = scanner.nextInt();
        toplam += kilo * elma;

        System.out.println("domates Kaç Kilo");
        kilo = scanner.nextInt();
        toplam += kilo * domates;

        System.out.println("muz Kaç Kilo");
        kilo = scanner.nextInt();
        toplam += kilo * muz;

        System.out.println("patlican Kaç Kilo");
        kilo = scanner.nextInt();
        toplam += kilo * patlican;

        System.out.println("Toplam Tutar " + toplam);
    }
}
