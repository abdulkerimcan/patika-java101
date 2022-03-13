import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.println("1. Sayıyı giriniz");
        a = scanner.nextInt();

        System.out.println("2. Sayıyı giriniz");
        b = scanner.nextInt();

        System.out.println("3. Sayıyı giriniz");
        c = scanner.nextInt();

        if (a < c && a < b) {
            if (b < c)
                System.out.println(a + " < " + b + " < " + c);
            else
                System.out.println(a + " < " + b + " < " + c);
        } else if (b < a && b < c) {
            if (a < c)
                System.out.println(b + " < " + a + " < " + c);
            else
                System.out.println(b + " < " + c + " < " + a);
        }else {
            if (a < b)
                System.out.println(c + " < " + a + " < " + b);
            else
                System.out.println(c + " < " + b + " < " + a);
        }
    }
}
