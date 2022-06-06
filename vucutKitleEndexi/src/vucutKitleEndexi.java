    import java.util.Scanner;
    public class vucutKitleEndexi {

        public static void main(String[] args)
    {
    //vke= vucut kitle endexi
        Scanner input = new Scanner(System.in);
        double kilo, boy, vke;
        System.out.println("Lutfen kilonuzu giriniz");
        kilo = input.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");
        boy = input.nextDouble();
        vke = (kilo / (boy * boy)) ;
        System.out.println("vke'niz: " + vke);











    }
}
