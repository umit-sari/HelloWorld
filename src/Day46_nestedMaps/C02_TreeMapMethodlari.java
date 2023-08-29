package Day46_nestedMaps;

import java.util.TreeMap;

public class C02_TreeMapMethodlari {
    public static void main(String[] args) {

       TreeMap<String,Integer> harfler=new TreeMap<>();

        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler); // {A=15, K=25, L=10, T=5, Z=50}

        System.out.println(harfler.tailMap("L")); // {L=10, T=5, Z=50} L dahil L den sonrakiler
        System.out.println(harfler.tailMap("C")); // {K=25, L=10, T=5, Z=50} C yok ama
         // C olsaydı A ile K arasında olacaktı bu yüzden C olmadıgından K ve sonrasındakiler

        System.out.println(harfler.tailMap("L",false)); //{T=5, Z=50}
        System.out.println(harfler.tailMap("C",false)); // {K=25, L=10, T=5, Z=50}

        System.out.println(harfler.headMap("T")); // {A=15, K=25, L=10} T hariç öncekiler
        System.out.println(harfler.headMap("M")); // {A=15, K=25, L=10} M yok ama olsaydı L den sonra olacaktı
        // buna göre L dahil olmak üzere L ve öncekiler

        System.out.println(harfler.headMap("T",true)); // {A=15, K=25, L=10, T=5}
        System.out.println(harfler.headMap("M",true)); // {A=15, K=25, L=10}

        // {A=15, K=25, L=10, T=5, Z=50}

        System.out.println(harfler.ceilingKey("K")); // K buyuk ve esit degeri soruyoruz
        System.out.println(harfler.ceilingKey("N")); // T .. N olmadıgından bir sonraki sıradaki eşit ve büyük deger
        System.out.println(harfler.ceilingKey("U")); // Z .. U olmadıgından bir sonraki sıradaki eşit ve büyük deger

        System.out.println(harfler.higherKey("K"));  // L buyuk
        System.out.println(harfler.higherKey("N")); // T .. N olmadıgından bir sonraki sıradaki büyük deger
        System.out.println(harfler.higherKey("U")); // Z .. U olmadıgından bir sonraki sıradaki büyük deger

        System.out.println(harfler.ceilingEntry("K")); // K=25 K' ya eşit ve degerini getiriyor
        System.out.println(harfler.higherEntry("K")); // L= 10  K'dan sonraki sıradakini ve degerini getiriyor

        // {A=15, K=25, L=10, T=5, Z=50}

        System.out.println(harfler.floorKey("K")); // K kücük esit
        System.out.println(harfler.floorKey("M")); // L olmadıgından öncesi sıradaki

        System.out.println(harfler.lowerKey("K"));// A kücük - kendisinden önceki ilk kücük deger
        System.out.println(harfler.lowerKey("M")); // L

        // {A=15, K=25, L=10, T=5, Z=50}
        System.out.println(harfler.pollFirstEntry()); // A=15 - ilk degeri getiriyor ve o degeri siliyor
        System.out.println(harfler); // {K=25, L=10, T=5, Z=50}
        System.out.println(harfler.pollLastEntry()); // Z=50 - son degeri getiriyor ve o degeri siliyor
        System.out.println(harfler); // {K=25, L=10, T=5}
        System.out.println(harfler.descendingKeySet()); // [T, L, K] - key'leri sıralamayı ters ceviriyor
        System.out.println(harfler.descendingMap()); // {T=5, L=10, K=25} key'leri degerleriyle  sıralamasını ters ceviriyor
        // harfler = harfler.descendingMap();



    }
}
