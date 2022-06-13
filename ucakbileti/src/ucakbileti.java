import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, type;
        double distance, tutar, noSalePrice, withSalePrice;
        System.out.println("Lutfen mesafeyi km cinsinden giriniz.");
        distance = input.nextDouble();
        System.out.println("Lutfen yasinizi giriniz.");
        age = input.nextInt();
        System.out.println("Tek yon ucus icin--1 \nGidis donus ucus icin--2 ye basiniz.");
        type = input.nextInt();
        noSalePrice = distance * 0.10;
        withSalePrice = (distance * 0.10) * 0.8;
        if (age > 0 && distance > 0 && (type == 1 || type == 2)) {
            switch (type) {
                case 1:
                    if (age < 12) {
                        tutar = noSalePrice * 0.5;
                        System.out.println("Odenecek tutar: "+ tutar);
                    } else if (age > 12 && age < 24) {
                        tutar = noSalePrice * 0.9;
                        System.out.println("Odenecek tutar: "+ tutar);
                    } else if (age < 65 && age > 24) {
                        tutar = noSalePrice ;
                        System.out.println("Odenecek tutar: "+ tutar);
                    } else if (age > 65) {
                        tutar = noSalePrice * 0.7;
                        System.out.println("Odenecek tutar: "+ tutar);
                    }
                    break;
                case 2:
                    if (age < 12) {
                        tutar = (withSalePrice * 0.5) * 2;
                        System.out.println("Odenecek tutar: "+ tutar);
                    } else if (age > 12 && age < 24) {
                        tutar = (withSalePrice * 0.9) * 2;
                        System.out.println("Odenecek tutar: "+ tutar);
                    } else if (age < 65 && age > 24) {
                        tutar = withSalePrice * 2 ;
                        System.out.println("Odenecek tutar: "+ tutar);
                    } else if (age > 65) {
                        tutar = (withSalePrice * 0.7) * 2;
                        System.out.println("Odenecek tutar: "+ tutar);
                    }   break;
            }
        } else {
            System.out.println("Hatali veri girisi yaptiniz!!");
        }


    }
}
