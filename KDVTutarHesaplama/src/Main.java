import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double kdv, tutar, kdvTutar, kdvliTutar;

        System.out.println("Tutar giriniz.");
        tutar = scn.nextDouble();

        if (0 < tutar && tutar <= 1000) {
            kdv = 0.18;
        } else
            kdv = 0.08;

        kdvTutar = tutar * kdv;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz fiyat " + tutar);

        System.out.println("KDV'li fiyat " + kdvliTutar);

        System.out.println("KDV tutar " + kdvTutar);
    }
}
