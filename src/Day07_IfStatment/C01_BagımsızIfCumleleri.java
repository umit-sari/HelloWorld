package Day07_IfStatment;

public class C01_BagımsızIfCumleleri {
    public static void main(String[] args) {
        /*
        Bagımsız if cümleleri kodun geri kalani ile ilgilenmez.Sadece boolean şarta odaklanır.
        Sartın sonucu true ise if body'si çalışır.
        Sartın sonucu false ise if body'si devreye girmez.
        Yani birden fazla if cümlesi olan bir kod çalıştıgında kac tane if body'sinin
        calısıcagı verilen degerlere baglıdır.
        Tüm if body leri calışabilir, bazıları calışabilir ya da hiçbir  if body si calışmayabilir.
         */
        int a=-201;
        int b=104;
        if (a>0){
            System.out.println("a sayisi pozitif"); // -201<0 sart false. kosul saglanmadı ve if body'si calısmadı.
        }
        if (((a+b)>100)){
            System.out.println("Sayıların toplamı 100'den büyüktür");// -201+104<100 sart false
        }
        if ((b%3)==0){
            System.out.println("b 3 ile bölünen bir sayıdır"); // 104/3 kalan 0 degil sart false
        }
        if (b<100){
            System.out.println("b sayısı 100'den küçüktür"); // b>100 sart false
        }
        if (a<b){
            System.out.println("b sayısı a'dan büyüktür"); //a<b sart - true. kosul saglandı ve if body'si calıstı.
        }

    }
}
