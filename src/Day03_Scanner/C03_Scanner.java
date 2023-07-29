package Day03_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // kullanicidan bir double bir int sayi alip; toplamı ve carpim sonuclarini bulun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir double sayi giriniz");
        double girilenDouble= scanner.nextDouble();
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenInt= scanner.nextInt();
        System.out.println("Iki sayinin toplami:"+ (girilenInt+girilenDouble));
        System.out.println("Iki sayinin carpimi:"+(girilenInt*girilenDouble));

    }
}
