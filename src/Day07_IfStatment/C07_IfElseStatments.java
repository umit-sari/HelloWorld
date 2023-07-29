package Day07_IfStatment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07_IfElseStatments {
    public static void main(String[] args) {
        /*
        Kullanıcıdan notunu isteyin. 50 ise Sınıfı Gectiniz  degilse Maalesef Kaldınız yazdırın.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double girilenNot = scanner.nextDouble();
        if (girilenNot >= 50) {
            System.out.println("Sinifi Gectiniz");
        } else {
            System.out.println("Malesef Kaldiniz");

            /*
             Eger bir sart icin sadece 2 durum soz konusu ise
            iki durumu ayri ayri kontrol etmek yerine
            tek bir kontrol ile de yapabiliriz
            Bagimsiz if cumlelerinden farkli olarak
            if else cumlelerinde ya if body'si, ya else body'si calisir.
            IKISININ BIRDEN calismasi mumkun olmadigi gibi,
            IKISININ DE CALISMAMASI mumkun degildir.
             */

        }
    }
}
