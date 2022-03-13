import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username,password,secim;

        System.out.println("Kullanıcı adını giriniz");
        username = scanner.nextLine();

        System.out.println("Şifreyi giriniz");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız.");
        }else {
            System.out.println("Girdiğiniz bilgiler yanlış\nŞifrenizi sıfırlamak ister misiniz?[y,n]");
            secim = scanner.nextLine();

            switch (secim) {
                case "y":
                    System.out.println("Yeni şifrenizi oluşturun. ");
                    password = scanner.nextLine();
                    if (password.equals("java123"))
                        System.out.println("Şifreniz eskisi ile aynı olamaz");
                    else
                        System.out.println("Şifreniz başarılı bir şekilde dğeiştirilmiştir");
                    break;
                case "n":
                    break;
            }
        }
    }
}
