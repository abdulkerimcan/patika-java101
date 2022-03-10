import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Matematik dersinin notunu giriniz.");
        mat = scn.nextInt();

        System.out.println("Fizik dersinin notunu giriniz.");
        fizik = scn.nextInt();

        System.out.println("Kimya dersinin notunu giriniz.");
        kimya = scn.nextInt();

        System.out.println("Türkçe dersinin notunu giriniz.");
        turkce = scn.nextInt();

        System.out.println("Tarih dersinin notunu giriniz.");
        tarih = scn.nextInt();

        System.out.println("Müzik dersinin notunu giriniz.");
        muzik = scn.nextInt();

        double toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ort = toplam/6;

        String sonuc = ort >= 60 ? "Geçtiniz" : "Kaldınız";
        System.out.printf("Durum : " + sonuc +" Ortalama = %.2f", ort);

    }
}
