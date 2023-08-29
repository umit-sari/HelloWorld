package Day46_nestedMaps;
public class DersTekrari_MapsVeMethodlari {
/*
    1-  Map : Map bugune kadar gordugumuz tum Java yapilarindan farklidir.
    2-  Map’i diğer java yapilarindan ayiran en buyuk özelliği key-value yapisinda olmasidir.
    3-  Java map’deki elementleri key'e göre tuttuğu için key değerleri unique olmalidir.
    Eğer map'de var olan bir key ile yeni element eklemek istersek, eski value silinip
    yeni eklenen value o key ile ilişiklendirilir.
    4-  Map güncel projelerde kullanilan data base’e en yakin Java objesidir.
    Özellikle ihtiyaç olduğunda nested map'ler kullanilarak
    bir cok uygulamanın java versiyonu yapilabilir.
    5-  Bir obje içerisinde tutulan data ne kadar kompleks olursa,
    o datalara erişim ve update o kadar zor olur.
    6-  Map'de bir bilgiye ulaşmak ve update etmek bir cok işlem gerektirdiğinden,
    genellikle bu tür işlemleri method olarak olusturmayi tercih ederiz.
    7-  Method'larda istediğimiz bilgiye ulasincaya kadar map’i parçalara ayirip,
    istediğimiz bilgiye ulastiktan veya update ettikten sonra yeniden map'e eklememiz
    ve map’i güncellememiz gerekir.
 */
/*
            map'ler kompleks bilgiler barindirabilir
            barindirdigi bilgi ne kadar kompleks olursa
            o bilginin detaylarina ulasmak da o kadar asama gerektirebilir.
            Bu tur kompleks islemleri, her seferinde yeniden kodlamak yerine
            ilk istendiginde method olarak olusturup
            sonra ihtiyac durumunda, o method'u kullanmak daha mantikli olur.
            Bir map ile islem yapmak istedigimizde
            ilk bakacagimiz sey istenen bilginin key mi yoksa value'da mi bulundugudur
            Eger sadece value'de olan bir bilgiyi ariyorsak:
            1- tum value'leri bir Collection olarak kaydedelim
            2- bir for-each loop ile herbir value'yu ele alalim
            3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
               bu ayirac kullanilarak split() ile bir array'e donusturulebilir
            4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut
               istenen bilgiyi, array'den index ile alabiliriz
            Eger her bir key'e ulasmak istiyorsak:
            1- tum key'leri bir Set olarak kaydedelim
            2- bir for-each loop ile her bir key'i ele alalim
            3- bu sekilde ulastigimiz key'in value'larina da artik ulasmak mumkundur.
*/
/*
            eger hem key, hem de value ile islem yapmamiz gerekirse
            mecburen key'lerin bulundugu Set
            ve value'larin bulundugu Collection
            objelerini beraber yonetmemiz gerekiyordu.
            Java key ve value'lari birlikte barindirmasi icin
            Entry isimli bir class olusturmustur.
            Entry ile key ve value'yu birlikte kullanabilir,
            entry uzerinde yapilan update'leri otomatik olarak map'e isleyebiliriz.
            Map.Entry<Integer,String>
*/
 /*
            map'de bir value'yu update etmek istersek
            1- bilgiye ulasmak icin yaptigimiz gibi adim adim value'yu array'e cevirmeliyiz
                - key ile value'yu cagiririz
                - value'yu array'e ceviririz
                - array'de istedigimiz update'i yapariz
            2- bilgiye ulasmak icin parcaladigimiz value'yu yeni haliyle tekrar birlestiririz
            3- key ve yeni value'yu kullanarak, map'i update ederiz
 */
    /*
     MAP METHODLARI :
        mapismi.put(key, value) : Istenen key ve value’ye sahip elementi map’e ekler
        Map<String,Integer> harfler = new HashMap<>();
        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=10}

        mapismi.putIfAbsent(key, value) : Eklenmek istenen key ve value map’de daha
        onceden mevcut ise ekleme yapmaz, map’de yoksa ekleme yapabilir.

        System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=10}
        System.out.println(harfler.putIfAbsent("L", 30));//10
        System.out.println(harfler);// L var olduğu için 30'u eklemedi.

        mapismi.compute(key, (k,v)->yeni deger) : istenen key’e sahip elementin value’sunu
        hesaplama veya atama yontemiyle update eder.

        {A=15, T=10, Z=50, K=25, L=10}
        harfler.compute("Z", (k,v)-> v+20);
        System.out.println(harfler);// {A=15, T=10, Z=70, K=25, L=10}

        mapismi.computeIfAbsent(key, (k,v)->yeni deger) : istenen key’e sahip element map’de
        yoksa value’sunu hesaplama veya atama yontemiyle update eder, map’de varsa birsey
        yapmaz.

        {A=15, T=10, Z=50, K=25, L=10}
        // L'nin degerini 3 katinin 5 fazlasi yapin
        harfler.compute("L", (a,b) -> 3*b +5 );

        System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=35}
        mapismi.computeIfPresent(key, (k,v)->yeni deger) : istenen key’e sahip element map’de
        varsa value’sunu hesaplama veya atama yontemiyle update eder, map’de yoksa birsey
        yapmaz.

        {A=15, T=10, Z=50, K=25, L=10}
        // T harfi varsa value'sunu bir artirin
        harfler.computeIfPresent("T" , (k,v) -> v+1);
        System.out.println(harfler); // {A=15, T=11, Z=70, K=25, L=35, M=50}
        mapismi.get(key) : Girilen key map’de varsa, o key’e ait value’yu, girilen key map’de
        yoksa null döndürür.

        {A=15, T=5, Z=50, K=25, L=10}
        System.out.println(harfler.get("G")); // null
        mapismi.getOrDefault(key, defaultValue) : Girilen key map’de yoksa null degil
        belirledigimiz bir deger(ornegin 0) döndürmesini istiyorsak bu method kullanilir.

        {A=15, T=5, Z=50, K=25, L=10}
        System.out.println(harfler.getOrDefault("G", 0)); // 0
        System.out.println(harfler.getOrDefault("T", 0)); // 5
     */
   /*
    TREEMAP METHOD'LARI :

    treeMapismi.tailMap(fromkey) :
    Verilen key'den sonraki ilk key'den itibaren değerleri dondurur.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.tailMap("L")); // {L=10, T=5, Z=50}
    treeMapismi.headMap(key ) : verilen key exclusive olarak oncesindeki entry’leri verir
    treeMapismi.headMap(key, true ) : verilen key inclusive olarak oncesindeki entry’leri verir
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.headMap("T")); // {A=15, K=25, L=10}
    treeMapismi.ceilingKey(key) :
    Verilen key treeMap’de varsa, o key’i dödürür.
    Verilen key treeMap’de yoksa verilen key’den buyuk olan ilk key’i döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.ceilingKey("K")); // K buyuk esit
    treeMapismi.ceilingEntry(key) :
    verilen key treeMap’de varsa, o key’e ait entry’yi, verilen
    key treeMap’de yoksa, verilen key’den buyuk olan ilk key’e ait entry’yi döndürür.
    Eger verilen key treeMap’de yoksa ve girilen key degerinden buyuk baska key yoksa
    null döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.ceilingEntry("K")); //  K=25
    treeMapismi.floorKey(key) :
    treeMapismi.floorEntry(key) :verilen key treeMap’de yoksa verilen key’den kucuk olan ilk key’i döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.floorKey("K")); // K  (kucuk esit)
    System.out.println(harfler.floorKey("M")); // L (M olmadığı icin siralamadaki daha kucuk ASCİİ değerine sahip ilk harfi aldi.)
    treeMapismi.pollFirstEntry( ) :Verilen entry’deki ilk entry'i silip, bize döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.pollFirstEntry()); // A=15
    System.out.println(harfler); // {K=25, L=10, T=5, Z=50}
    treeMapismi.pollLastEntry( ) : Verilen entry’deki son entry'i silip, bize döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.pollLastEntry()); // Z=50
    System.out.println(harfler); // {K=25, L=10, T=5}
    treeMapismi.descendingMap( ) : gecici olarak tree map’i descending siralar.
    System.out.println(harfler.descendingKeySet()); // [T, L, K]
    System.out.println(harfler.descendingMap()); // {T=5, L=10, K=25}
    harfler = harfler.descendingMap(); ==> TreeMap doğal sıralı olduğundan tersten sıralamayı kaydetmeye izin vermez.
    harfler'i yazdırdığımızda descendingMap()'nun yaptığı değişikliği de tanımamış olur.
    treeMapismi.higherKey(key) : Verilen key’den buyuk olan ilk key’i döndürür.
    treeMapismi.higherEntry(key) : Verilen key’den buyuk olan ilk key’e ait entry’yi döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.higherKey("K")); // L buyuk
    System.out.println(harfler.higherEntry("K"));  //  L=10
    treeMapismi.lowerKey(key) : Verilen key’den kucuk olan ilk key’i döndürür.
    treeMapismi.lowerEntry(key) : Verilen key’den kucuk olan ilk key’e ait entry’yi döndürür.
    {A=15, K=25, L=10, T=5, Z=50}
    System.out.println(harfler.lowerKey("K")); // A (K'dan kucuk ilk Key => A)
    System.out.println(harfler.lowerKey("M")); // L
     */
}

