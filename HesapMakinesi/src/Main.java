import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ilkSayi, ikinciSayi, secim;
        boolean cikis = false;
        System.out.println("İlk sayıyı giriniz.");
        ilkSayi = scanner.nextInt();

        System.out.println("İkinci Sayıyı giriniz.");
        ikinciSayi = scanner.nextInt();

        while (!cikis) {
            System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme\n0-çıkış");
            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.println(ilkSayi + " + " + ikinciSayi + " = " + (ilkSayi + ikinciSayi));
                    break;
                case 2:
                    System.out.println(ilkSayi + " - " + ikinciSayi + " = " + (ilkSayi - ikinciSayi));
                    break;
                case 3:
                    System.out.println(ilkSayi + " * " + ikinciSayi + " = " + (ilkSayi * ikinciSayi));
                    break;
                case 4:
                    if (ikinciSayi == 0)
                        System.out.println("bir sayı 0 ile bölünemez");
                    else
                        System.out.println(ilkSayi + " / " + ikinciSayi + " = " + ((double) ilkSayi / ikinciSayi));
                    break;
                case 0:
                    cikis = true;
                    System.out.println("Çıkış yapıldı...");
                    break;
            }
        }
    }
}
