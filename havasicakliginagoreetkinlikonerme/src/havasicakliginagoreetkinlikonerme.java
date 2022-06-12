import java.util.Scanner;

public class havasicakliginagoreetkinlikonerme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        System.out.print("Lutfen hava sicakligini giriniz: ");
        x = input.nextDouble();
        if (x < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if ((10 <= x) && (x <= 15)) {
            System.out.println("Hem sinema hem de piknik yapabilirsiniz.");
        } else if ((5 <= x) && (x < 15)) {
            System.out.println("Sinema yapabilirsiniz.");
        } else if ((10 < x) && (x < 25)) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (x > 25) {
            System.out.println("Yuzme yapabilirsiniz.");
        }


    }
}