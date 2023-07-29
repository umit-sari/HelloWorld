package Day11_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesiyor";
        // contains sadece true -false sonucu döndürür.

        // str java iceriyor mu?
        System.out.println(str.contains("Java"));// true
        System.out.println(str.contains("java"));// false - case sensetive (kucuk-buyuk harf duyarlılık)

        // str a icerir mi?
        System.out.println(str.contains("a"));//true

        /*
         contains ()'u aranan metnin sayısı ile ilgilenmez sadece var(true) veya yok(false) sonucu döndürür
         */




    }
}
