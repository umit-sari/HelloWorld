package Day05_Matematikselİslemler;

import java.util.Scanner;

public class C02_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        // kullanıcıdan 3 basamaklı sayı akıp sayının rakamlarnı toplayıp yazdırın
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı pozıtıf bir sayı giriniz");
        int girilenSayi=scanner.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        // ilk sayi için
        birlerBasamagi=girilenSayi%10; // 127%10 : 7 modul işlemi 7 kalanını yani birler basamagını verdi.
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        // birler basamagindaki sayiyi aldık artık ondan kurtulalım.
        girilenSayi=girilenSayi/10; //örnek:127/10 : 12 birler basamagından kurtulduk

        birlerBasamagi=girilenSayi%10; // 12%10: 2  modul işlemi 2 kalanını yani birler basamagını verdi.
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        // sayi iki basamaklı sayıya donustu.
        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;
        System.out.println("rakamlar toplamı:"+rakamlarToplami);

    }
}
