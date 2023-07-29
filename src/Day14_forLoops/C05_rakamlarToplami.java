package Day14_forLoops;

import java.util.Scanner;

public class C05_rakamlarToplami {
    public static void main(String[] args) {
        // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarini toplamak uzere pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();
        int sayi = girilenSayi ;  // 1453
        int birlerBasamagi = 0;
        int rakamlarToplami = 0 ;
        int basamakSayisi = (sayi+"").length(); // - burda sayıyı Stringlestırıp length ile basamak sayısını metin
        // uzunluguna esitleyerek ve for loop ile basamak uzunluguna göre döngü olusturuyoruz.
        // ornek 1453 sayısının uzunlugu 4' e esit yani girilen sayi 4 basamaklı.
        for (int i = 1; i <=basamakSayisi ; i++) { // bu döngüyü basamak sayısı kadar tekrarlıyor.
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }
        System.out.println("Girilen " + girilenSayi +" sayisinin rakamlar toplami : " + rakamlarToplami);

    }
}
