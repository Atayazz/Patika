import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar, kdvoran, kdvTutar, kdvliTutar;
        System.out.println("Ucret tutari giriniz. ");
        tutar = input.nextDouble();
        kdvoran = 0.18;
        kdvTutar = tutar * kdvoran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdv'siz tutar: " + tutar);
        System.out.println("Kdv Orani: " + kdvoran);
        System.out.println("Kdv Tutari: " + kdvTutar);
        System.out.println("Kdv'li Tutar: " + kdvliTutar);

    }
}
