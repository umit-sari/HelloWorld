package Day03_Scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // görev:  kullanicidan bir sayi alip karesini yazdirin.

        //Scanner ile kullanicidan bilgiyi
        // 3 adimda alabiliriz.
        //1 adim- scanner objesi oluşturmak
        Scanner scanner=new Scanner(System.in);

        // 2.adim kullaniciya ne istediğimizi soyleyin.
        System.out.println("Lutfen bir tamsayi giriniz");

        // 3.adim istediginiz datanin türüne uygun bir variable olusturun.
        // ve scanner objesini kullanarak uygun methodla kullanicinin
        // girdigi bilgiyi alin.

        int girilenSayi= scanner.nextInt(); // calistirdigimiz da sistem kullanicidan deger beklediginden
        // run devam eder. deger girilince sistem devam eder.

        // artık kullanicinin girdigi sayi kod ortamimiza kaydedildi.
        // bu variable istedigimiz sekilde kullanabiliriz.

        System.out.println("Girilen sayinin karesi:"+girilenSayi*girilenSayi);
    }
}
