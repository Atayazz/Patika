import java.util.Scanner;
public class manavProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut ,elma, domates, muz, patlican, borc;
        double armutfiyat = 2.14;
        double elmafiyat = 3.67;
        double domatesfiyat = 1.11;
        double muzfiyat = 0.95;
        double patlicanfiyat = 5.0;

        System.out.println("Kac kilo armut aldiniz? ");
        armut = input.nextDouble();
        System.out.println("Kac kilo elma aldiniz? ");
        elma = input.nextDouble();
        System.out.println("Kac kilo domates aldiniz? ");
        domates = input.nextDouble();
        System.out.println("Kac kilo muz aldiniz? ");
        muz = input.nextDouble();
        System.out.println("Kac kilo patlican aldiniz? ");
        patlican = input.nextDouble();
        borc = armut * armutfiyat + elma * elmafiyat + domates * domatesfiyat + muz * muzfiyat + patlican * patlicanfiyat;
        System.out.println("borcunuz: " + borc);






    }
}
