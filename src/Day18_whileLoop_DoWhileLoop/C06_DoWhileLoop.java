package Day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        // while önce şart kontrolu yapar sonra calısır.
        // do-while avantajı kontrol yapılmadan body in en az bir kere calısması.
        // kullanicidan toplanmak uzere pozitif sayilar isteyin
        // kullanici islemi bitirmek icin 0'a basmalidir
        // kullanici 0'a bastiginda kac pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin
        /* once while loop ile yapalim
        Scanner scanner;
        int sayac = 0 ;
        int toplam = 0 ;
        int girilensayi = 9; // = 0; yaparsak 0 da durmasını istedigimizden while bize 0 sonucunu döndürür ve birdaha calısmaz.
        while(girilensayi != 0){
            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilensayi = scanner.nextInt();
            if (girilensayi != 0){
                toplam += girilensayi;
                sayac++;
            }
        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);
         */
        // do while ile yapalim
        Scanner scanner;
        int sayac = 0 ;
        int toplam = 0 ;
        int girilensayi; // önce işlem yaptıgı ve sayı girisi kullanıcıdan aldıgı için deger ataması istemeden islemi tamamladı.
        do {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilensayi = scanner.nextInt();
            if (girilensayi != 0){
                toplam += girilensayi;
                sayac++;
            }
        }while (girilensayi != 0);
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);

    }
}
