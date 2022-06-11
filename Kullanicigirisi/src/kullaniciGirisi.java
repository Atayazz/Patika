import java.util.Scanner;

public class kullaniciGirisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, sifreyenileme, yenisifre;
        System.out.print("Kullanici adinizi giriniz.    ");
        userName = input.nextLine();
        System.out.print("Sifrenizi giriniz.    ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("Java123"))
            System.out.println("Kullanici adi ve sifre dogrudur.");
        else
            System.out.println("Sifre yanlis, yenilemek ister misiniz?(Y & N)");
        sifreyenileme = input.nextLine();
        if (sifreyenileme.equals("Y")) {
            System.out.println("yeni sifre giriniz: ");
            yenisifre = input.nextLine();
        } else if (sifreyenileme.equals("N"))
            System.out.println("Sifrenizi yenilemelisiniz!!");


    }
}