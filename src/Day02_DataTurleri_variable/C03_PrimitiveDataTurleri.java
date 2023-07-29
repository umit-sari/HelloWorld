package Day02_DataTurleri_variable;

public class C03_PrimitiveDataTurleri {
    public static void main(String[] args) {
        boolean bl1=true;
        boolean bl2=false;

        char ch1='a';
        char ch2='2';
        char ch3='*'; // char tek tırnak  içinde yazılır.
        // 1 karakter alır.
        char ch=' ';

        // tam sayı kabul eden variable turleri
        // 3-byte, 4-short,5-int,6-long
        // Turkiye de sehir nufusları
        // data turu aynı olan variablerin degerleri ne olursa olsun hafıza da kapladıkları aynıdır.
        int nufus=834250;
        int nufusBilecik=30000;
        // bir sehirdeki noter sayısını tutacagız
        short noterSayisiIstanbul=456;


        float fl1=20f; // java nın float ı kabul etmesi için sonuna f veya F konulmalı.
        float fl2=6f;
        float fl3=fl1/fl2;
        System.out.println(fl3);// 3.3333333

        double db1=20;
        double db2=6;
        double db3=db1/db2;
        System.out.println(db3); // 3.3333333333333335

        String str= "hello world";
        System.out.println(str);

        //verilen iki sayiyi carpim sonucunu yazdirin.
        int sayi1=10;
        int sayi2=20;
        System.out.println("verilen iki sayının carpimi:"+sayi1*sayi2); // acıklama cift tırnak icinde yazılır.










    }
}
