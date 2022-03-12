import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14,alan,cevre;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz");
        r = scanner.nextInt();
        System.out.println("Merkez Ölçüyü giriniz");
        a = scanner.nextInt();

        alan = pi * r * r;
        System.out.println("Alan = " + alan);
        cevre = pi * r * 2;
        System.out.println("Cevre = " + cevre);

        alan = pi * r * r * a / 360;
        System.out.println("Merkez ölçüsü " +  a + " olan dairenin Alanı = " + alan);
    }
}
