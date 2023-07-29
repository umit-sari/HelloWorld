package Day08_IfElseIfStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E : Erkek , K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        /*char cinsiyet = scanner.next().toUpperCase.charAt(0) yaparsak kullanici
         cinsiyeti kücük harf girse bile büyük harfe cevirir.
         charAt(0) yazdıgımız kelimenin 1.harfini karakterini alır.
         ornek Erik yazınca sadece E harfini aldıgından bunu cinsiyet Erkek olarak algilar.
        */

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scanner.nextDouble();
         /*
            Birden fazla degisken varsa iclerinden birini birincil degisken olarak alip
            sadece ona gore bir if - ele if - else kuralim.
         */
        if (cinsiyet=='E'){
           if(yas<0 || yas>=100){
               System.out.println("hatali yas girdiniz");

           } else if (yas>=65) {
               System.out.println("Erkek emekli olabilir");

           }else{
               System.out.println("Erkek emekli olamaz:"+(65-yas)+"yıl daha calismalisin");
           }

        } else if (cinsiyet=='K') {
            if(yas<0 || yas>=100){
                System.out.println("hatali yas girdiniz");

            } else if (yas>=60) {
                System.out.println("Kadin emekli olabilir");

            }else {
                System.out.println("Kadin emekli olamaz:" + (60 - yas) + "yıl daha calismalisin");
            }
        }else{
            System.out.println("hatali cinsiyet girdiniz");
        }
    }
}
