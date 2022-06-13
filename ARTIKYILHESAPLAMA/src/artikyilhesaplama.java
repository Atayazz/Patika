import java.util.Scanner;

public class artikyilhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Lutfen yil giriniz.");
        year = input.nextInt();
        if ((year % 4 == 0) || ((year %100 == 0) && (year % 400 ==0))) {
            System.out.println("Girdiginiz yil artik yildir.");
        }  else{
            System.out.println("Girdiginiz yil artik degildir.");
        }
    }
}
