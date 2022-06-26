import java.util.Scanner;

public class sayicift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;
        System.out.println("Bir sayi giriniz:");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

