import java.util.Scanner;

public class Taximetre {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double acilis, kmbasina, minTutar, kackm, toplam;
        System.out.println("Kac km gittiniz?");
    acilis = 10;
    kmbasina = 2.20;
    minTutar = 20;
    kackm = input.nextDouble();
    toplam = acilis + 2.20 * (kackm);
    toplam = (toplam < 20 ) ? 20: toplam;
    System.out.println("toplam tutar: " + toplam);






    }
}
