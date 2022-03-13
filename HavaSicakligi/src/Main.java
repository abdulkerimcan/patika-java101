import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sicaklik;

        System.out.println("Sıcaklığı giriniz");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5)
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        else if (sicaklik < 15)
            System.out.println("Sinemaya gidebilirsiniz");
        else if (sicaklik < 25)
            System.out.println("Pikniğe gidebilirsiniz");
        else
            System.out.println("Yüzmeye gidebilirsiniz");
    }
}
