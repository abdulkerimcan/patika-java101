import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;
        double toplam = 0;

        System.out.println("Matematik dersinin notunu giriniz.");
        mat = scn.nextInt();
        if (mat >= 0 && mat <= 100)
            toplam += mat;

        System.out.println("Fizik dersinin notunu giriniz.");
        fizik = scn.nextInt();
        if (fizik >= 0 && fizik <= 100)
            toplam += fizik;

        System.out.println("Kimya dersinin notunu giriniz.");
        kimya = scn.nextInt();
        if (kimya >= 0 && kimya <= 100)
            toplam += kimya;

        System.out.println("Türkçe dersinin notunu giriniz.");
        turkce = scn.nextInt();
        if (turkce >= 0 && turkce <= 100)
            toplam += turkce;

        System.out.println("Tarih dersinin notunu giriniz.");
        tarih = scn.nextInt();
        if (tarih >= 0 && tarih <= 100)
            toplam += tarih;

        System.out.println("Müzik dersinin notunu giriniz.");
        muzik = scn.nextInt();
        if (muzik >= 0 && muzik <= 100)
            toplam += muzik;

        double ort = toplam/6;

        if (ort <= 55)
            System.out.println("Sınıfta kaldınız seneye görüşmek üzere");
        else
            System.out.println("Tebrikler sınıfı geçtiniz");
        System.out.println("Ortalamanız : "+ ort);
    }
}
