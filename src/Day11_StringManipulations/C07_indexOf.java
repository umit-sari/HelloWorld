package Day11_StringManipulations;
public class

C07_indexOf {
    public static void main(String[] args) {
        String str = "Ali topu at, at ali at";
        // Ali'nin index'i nedir?  0 // Ali kelimesini bir grup olarak alıyor ve direk 0 indexte buluyor.
        System.out.println(str.indexOf("Ali"));

        // at'in index'i nedir ? 9
        System.out.println(str.indexOf("at")); // ilk buldugu istenen sonucu döndürüyor en sondaki at kelimesine bakmıyor

        // op'un index'i nedir? 5
        System.out.println(str.indexOf("op"));//5

        System.out.println(str.indexOf('a')); // 9
        System.out.println(str.indexOf("a", 10)); // 13 , den sonra bir bosluk var ondan sonuc 13.
        // 10'uncu endeksten sonraki a'yı bul talimatı.
        System.out.println(str.indexOf("yusuf")); // -1
        //eger metinde aranan bilgi yer almiyorsa sonucu -1 olarak döndürüyor. Cunku index of sayisal deger döndürüyor.
    }
}















