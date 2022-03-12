import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tutar, kmBasi = 2.2;
        double km;

        System.out.println("Alınan kilometreyi yazınız");
        km = scanner.nextDouble();
        tutar = km * kmBasi + 10;


        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println(km + " km yol gittiniz borcunuz: " + tutar);

    }
}
