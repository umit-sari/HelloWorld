package Day06_ConcatetıonMatematikselOperatorler;

public class C03_AndOperatoru {
    public static void main(String[] args) {
        System.out.println(5>3 && 6>4); //5>3 true and 6>4 true sonuc true
        System.out.println(5<3&&6>4); // 5<3 false and 6>4 true sonuc false
        System.out.println(5>3&&6<=4); // true and false.... sonuc false
        // bir tanesi false sa sonuc false

        System.out.println(5<=3&&6<=4); //false and false sonuc false

        /*AND operatoru mukemmelliyetcidir.AND && operatoru ile baglanan boolean ifadeler kac tane olursa olsun hepsi
        true ise true bunun disindaki tüm durumlarda sonuc false olur.
        bu yonu ile matematikteki çarpiya benzer.
        1*1*1*1= 1 true
        1*1*1*1*0*1*1= 0  bir sıfır tüm sonucu sıfır yapar.
        0*0*0*0*0=0  false
         */

        // bir sayinin hem 2, hem 3, hem 5 ile bolunmesi lazim
        int sayi=24;
        System.out.println(sayi%2==0 && sayi%3==0 && sayi%5==0 ); // sayinin 2-3-5 ile bölümünden kalan sıfır olmali
        // true-true-false.. sonuc :false

        // sayı 0 veya daha buyuk ve 100 veya daha kucuk olmalıdır.
        System.out.println(sayi>=0&&sayi<=100); //true-true sonuc true



    }
}
