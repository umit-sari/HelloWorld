package Day44_maps;

import java.util.Map;
import java.util.TreeMap;

public class C03_SinifListesi {
    public static void main(String[] args) {
        // ogrenci map'de sinif ve sube verdigimizde
        // o sinifta bulunan ogrenci isim ve soyisimlerini yazdirin

        Map<Integer,String>ogranciMap=MethodDeposu.ogreciMapOlustur();
        MethodDeposu.sinifSubedekiOgrenciListesiYazdir(ogranciMap,11,"h");


    }
}
