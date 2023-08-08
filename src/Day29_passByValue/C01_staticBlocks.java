package Day29_passByValue;
public class C01_staticBlocks {
    /*
 - Static bloklar class ilk calistirildigi anda calisir ve class’in baslangic degerlerini olusturur(initiliaze).
 - Static bloklar tum class uyelerinden, main method’dan bile once calisir
 - Eger birden fazla static blok varsa Java’nin genel cercevesine uygun olarak once ustteki static
   blok calisir.
 */

    C01_staticBlocks() {
        System.out.println("parametresiz constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        C01_staticBlocks obj = new C01_staticBlocks();
        System.out.println("obje olusturuldu");
    }

    static {
        System.out.println("static blok 1 calisti");
    }

    static {
        System.out.println("static blok 2 calisti");
    }

    {
        System.out.println("static olmayan blok calisti");
        // obje olusturuldugunda calisir
    }
}







