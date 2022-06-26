import java.util.Scanner;

public class teksayilarintoplaminibulanprog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        int total = 0;
        System.out.print("Sayi giriniz:");
        k = input.nextInt();

        do {
            System.out.print("Sayi giriniz:");
            k = input.nextInt();
            if (k % 2 == 0 && k % 4 == 0) ;
            {
                total += k;
            }
        } while (k % 2 == 0);
        {
            System.out.println("toplam: " + total);

        }

    }
}






