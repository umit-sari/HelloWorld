package Day02_DataTurleri_variable;

public class C01_VariableOlusturma {
    public static void main(String[] args) {
        int sayi;

        // ınt tam sayı degerler alır.
        // deklarasyon sadece bir kez yapılır
        // ama deger ataması istedigi kadar yapılır.

        sayi=20;
        System.out.println(sayi); // main den başlayarak kod yukardan aşagıya dogru sırayla calısır.
        sayi=sayi+10;

        // bir variable deger atanmadan da declare edilebilinir.( yani üstte yaptiğimiz int sayi; gibi)
        //ancak deger atanmayan variable deger atanıncaya kadar kullanılamaz/ calısmaz.
        // int sayi2; gibi deger ataması yapılmamıssa deger atanana kadar bize sonuc döndürmez.

        System.out.println(sayi); // burada deger 30 cikti.
        // java da önce degeri hesaplar sonra atama yapar.
        // bu islemde sayi 20 +10 yeni sayi degeri 30 oldu.
    }
}
