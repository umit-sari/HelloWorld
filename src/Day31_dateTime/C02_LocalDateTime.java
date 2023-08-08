package Day31_dateTime;
import java.time.LocalDateTime;
public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2023-08-04  T 20:10:20.335548
        System.out.println(tarihSaat.getDayOfWeek()); // FRIDAY
        // bir for loop olusturup, 1'den 10000'e kadar olan sayilari toplayin
        // islem suresini nano saniye olarak yazdirin
        LocalDateTime baslamaZamani = LocalDateTime.now(); //bunları yazmak isek java sadece 5.inci satırdakini calıstırıp durdurur
        int baslangicZamani = baslamaZamani.getNano();
        int toplam=0;
        for (int i = 1; i <100000 ; i++) {
            toplam += i;
        }
        LocalDateTime bitirmeZamani = LocalDateTime.now();
        int bitisZamani = bitirmeZamani.getNano();
        System.out.println("Islem suresi : " + (bitisZamani - baslangicZamani));
    }
}
