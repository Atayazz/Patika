import java.util.Scanner;
import java.util.Random;

public class sayitahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int tahmin, sayi;
        System.out.println("Lutfen 1 ile 100 arasi bir sayi giriniz:    ");
        tahmin = random.nextInt(101);
        sayi = input.nextInt();
        while (sayi != tahmin) {
            if (sayi < 0 || sayi > 100) {
                System.out.println("Lutfen 1 ile 100 arasinda bir sayi giriniz.");
                sayi = input.nextInt();
            } else if (sayi < tahmin) {
                System.out.println("daha buyuk bir sayi giriniz.");
                sayi = input.nextInt();
            } else if (sayi > tahmin) {
                System.out.println("daha kucuk bir sayi giriniz. ");
                sayi = input.nextInt();
            }

        }
        System.out.println("cong!");
    }
}





