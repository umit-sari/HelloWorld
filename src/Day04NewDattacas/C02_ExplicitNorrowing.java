package Day04NewDattacas;

public class C02_ExplicitNorrowing {
    public static void main(String[] args) {
        double db1=123.6;
        // int sayi1=db1; Java otomatik olarak kabul etmez.
        int sayi1=(int)db1;
        System.out.println("sayi1:"+sayi1); // sonuc:123

        byte by1=(byte)sayi1;
        System.out.println("by1:"+by1); // sonuc:123

        int sayi2=130;
        byte by2=(byte)sayi2;
        System.out.println("by2:"+by2); // sonuc:-126

        int sayi3=150;
        byte by3=(byte)sayi3;
        System.out.println("by3:"+by3);
        // sonuc:-106 sayi 127 den fazla olunca eksi 128 den başlayarak sayı eksi tarafta buyuyor.

        int sayi4=260;
        byte by4=(byte)sayi4;
        System.out.println("by4:"+by4);// sonuc:4  2 defa eksi 128 doneceginden 260-256: sonuc 4

        int sayi5=2568;
        byte by5=(byte) sayi5;
        System.out.println("by5:"+by5); // sonuc : 2568/256 byte sayısı kalan 8


    }
}
