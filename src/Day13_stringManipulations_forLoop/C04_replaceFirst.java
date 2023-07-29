package Day13_stringManipulations_forLoop;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str = "Java Candir, kendisini cok seviyoruz123.";
        // sadece ilk a'yi BUYUK A yapin
        System.out.println(str.replaceFirst("a", "A"));
        // JAva Candir, kendisini cok seviyoruz123.
        // ilk space'i iki space haline getirin
        System.out.println(str.replaceFirst(" ", "  "));
        // Java  Candir, kendisini cok seviyoruz123.
        // ilk sayiyi space haline donusturun
        System.out.println(str.replaceFirst("\\d", " "));
        // Java Candir, kendisini cok seviyoruz 23.

        // ilk ozel karakteri * olarak degistirin
        System.out.println(str.replaceFirst("\\W", "*"));
        // Java*Candir, kendisini cok seviyoruz123.

        System.out.println(str.repeat(2)); // tekrar icin kullanıyoruz.
        // Java Candir, kendisini cok seviyoruz123.Java Candir, kendisini cok seviyoruz123.

        String str2= "     Ali kos   ";
        System.out.println(str2.trim()); // Ali kos
        // Bir String’in basinda ve sonunda (varsa) bulunan space’leri siler.


    }
}
