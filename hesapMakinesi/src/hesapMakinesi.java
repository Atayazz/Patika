import java.util.Scanner;

public class hesapMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        int islem;
        System.out.print("Birinci sayiyi giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        sayi2 = input.nextInt();
        System.out.println("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme ");
        islem = input.nextInt();

        if (islem == 1) {
            System.out.println("Isleminiz: Toplama");
            System.out.println("Islem Sonucunuz: " + (sayi1 + sayi2));
        } else if (islem == 2) {
            System.out.println("Isleminiz: Cikarma");
            System.out.println("Islem Sonucunuz: " + (sayi1 - sayi2));
        } else if (islem == 3) {
            System.out.println("Isleminiz: Carpma");
            System.out.println("Islem Sonucunuz: " + (sayi1 * sayi2));
        } else if (islem == 4) {
            System.out.println("Isleminiz: Bolme");
            System.out.println("Islem Sonucunuz: " + (sayi1 / sayi2));
        }
    }
}