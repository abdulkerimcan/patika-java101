import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        double u,alan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.kenarı giriniz");
        a = scanner.nextInt();

        System.out.println("2.kenarı giriniz");
        b = scanner.nextInt();

        c = Math.sqrt(a*a + b*b);

        System.out.println("Hipotenüs " + c);


        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Alan = " + alan);


    }
}
