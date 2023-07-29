package Day04NewDattacas;

public class C03_CharDataCasting {
    public static void main(String[] args) {
        char ch1='c';
        int sayi1=ch1; //
        System.out.println("ch1:"+ch1);
        System.out.println("sayi1:"+sayi1);

        /*char da ASCI tablosundan gelen harflerin-sayısaların-karakterlerin rakamsal karsiligini veriyor.
        Her harfte farklı rakamsal sonuc veriyor. b:98, a:97 c:99 vb
        char data turundeki bir variable ı matematiksel islemde kullanırsaniz ASCI tablosundaki degeri ile
        isleme girer.

         */
        String str1="Java";
        String str2= " ";
        String str3= "Candir";
        System.out.println(str1+str2+str3); // burda boşluk karakterini metin olarak algiladi çift tirnak nedeni ile.

        char ch2='a';
        char ch3='b';
        System.out.println(ch2+ch3);/* sonuc : 195 toplama islemi yapildigindan Java a ve b nin ASCI tablosundaki karsiliklerini
       aldi 97+98 : 195
        */
        char ch4= 'ü';
        char ch5='m';
        char ch6='i';
        char ch7='t';
        System.out.println(ch4+ch5+ch6+ch7); // ismimin rakamsal toplami:582 :)


        int karakter=97;
        char asciDegeri=(char)karakter;
        System.out.println("Verilen sayinin asci tablosundaki degeri:"+asciDegeri); // a



    }
}
