import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kenar1, kenar2, kenar3, u, cevre, alan;
        System.out.println("1.Kenari giriniz. ");
        kenar1 = input.nextDouble();
        System.out.println("2.Kenari giriniz. ");
        kenar2 = input.nextDouble();
        System.out.println("3.Kenari giriniz. ");
        kenar3 = input.nextDouble();
        u = ((kenar1+kenar2+kenar3)/2);
        //cevre = (2 * u);
        //System.out.println("Ucgenin cevresi: "+ cevre);
        alan = (u * (u - kenar1) * (u - kenar2) * (u - kenar3) );
        System.out.println("Ucgenin alani: " + Math.sqrt(alan) );
    }
}

