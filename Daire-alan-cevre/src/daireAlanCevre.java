import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi ,yaricap, alan, cevre, kackm, toplam;
        pi = 3.14;
        System.out.println("Yaricapi giriniz.");
        yaricap = input.nextDouble();
        alan =  pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;
        System.out.println("cevre: " + cevre);
        System.out.println("alan: " + alan);





    }
}
