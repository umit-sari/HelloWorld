package Day05_Matematikselİslemler;

public class C01_Matematikselİslemler {
    public static void main(String[] args) {
        int a=27;
        int b=4;
        System.out.println(a/b);//6 iki degiskende int oldugundan islem sonucu tam sayıdır
        System.out.println(a%b); // a/b den kalan 3, modulus (modul islemi)
        double c=27;
        System.out.println(c/b);// 6.75  bir int bir double ise islem sonucu double göre ondalıklı olarak verir.
        System.out.println(2567/10);//256
        System.out.println(2.5 % 10); // modul işlemi  2,5 sayisi 10 dan küçük oldugundan 10 dan küçük her sayının kalanı sayının kendisidir.
        System.out.println(2567%10); // bolumden  7 kalan
        System.out.println(2%10);// 2 kalan sonucu

        double sonuc1=a/b;
        System.out.println("Sonuc1:"+sonuc1); // 6.0  önce sag taraf yani bölme işlemi yapilir degiskenler int oldugundan
        // sonuc 6 cıktı. 6 cıkan deger double bunu 6.0 ondalıklı yaptı.

        double sonuc2=(double)(a/b);
        System.out.println("sonuc2:"+sonuc2); // 6,0 a/b parantezli oludugundan önce int olarak sonuc tam sayi cıkıyor.

        double sonuc3=(double)a/b; // a/b yi parantez kaldirilirsa işlem sonucu double olarak sonuc kusuratlı algilanır.
        System.out.println("sonuc3:"+sonuc3); //6.75

    }
}
