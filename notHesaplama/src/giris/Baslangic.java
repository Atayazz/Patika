package giris;
import java.util.Scanner;
public class Baslangic {

    public static void main(String[] args) {

        int mat, fizik, tarih, kimya, turkce, muzik ;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz.");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz.");
        fizik = input.nextInt();

        System.out.println("Tarih notunuzu giriniz.");
        tarih = input.nextInt();

        System.out.println("Kimya notunuzu giriniz.");
        kimya = input.nextInt();

        System.out.println("Turkce notunuzu giriniz.");
        turkce = input.nextInt();

        System.out.println("Muzik notunuzu giriniz.");
        muzik = input.nextInt();

        int toplam = (mat + fizik + tarih + kimya + turkce + muzik);
        double sonuc = toplam/6;
        boolean gecti = (sonuc>=60) ;
        boolean kaldi = (sonuc<=60);

        System.out.println("Dersten gectiniz."+ gecti );
        System.out.println("Dersten kaldiniz." + kaldi);


        System.out.println("Ortalamaniz: " + sonuc);




    }
}