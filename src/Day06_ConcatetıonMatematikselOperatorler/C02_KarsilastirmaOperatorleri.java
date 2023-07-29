package Day06_ConcatetıonMatematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // Java da tek = isareti atama isaretidir.
        b=2*a;

        // Java da esitligi kontrol etmek istersek == kullanırız.
        System.out.println(b==2*a);// 20==20 cevap true / false olarak dönüyor.

        System.out.println(3*b>5*a); // assigmentın sol tarafında sadece variable bulunur sol tarafta matematiksel islemler bulunmaz
        // karsilastirma operatorlerinde iki tarafta da islem olabilir.
        // java once karsilastırma yapar

        System.out.println(b>=b-a);//20>=10
        System.out.println(a<=b-a); //10<=10

        boolean c;
        System.out.println(c=a*6==3*b);// c ye atama yapiliyor c=60 degerini aliyor.60==60 true;

        // Java da karsilastirma operatorlerinde kullanılan ! boolean (true/false) islemini tersine cevirir.
        System.out.println(a<b);// true
        System.out.println(!(a<b)); // true iken ! tersine ceviriyor false oluyor sonuc.
        System.out.println(a!=b); // false iken ! true ya ceviriyor sonucu.





    }
}
