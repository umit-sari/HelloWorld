package Day28_ConstructorCall;
public class C01_ConstructorCall {
    /*
        java'da bir constructor'in icinde baska bir constructor'i cagirmamiz gerekebilir
        bu durumda
        C01_ConstructorCall(4);  yazarsak,
        Java bunu cons. call olarak degil, method call olarak kabul eder
        Eger bir constructor'in icinden baska bir constructor cagirmamiz gerekirse
        ClassIsmi(ilgiliArgumentler) yerine this(ilgiliArgumentler) kullanilir
     */
    C01_ConstructorCall (){
        System.out.println("Parametresiz constructor calisti");
    }
    C01_ConstructorCall(String str){
        this(11);// constructor call
        C01_ConstructorCall(4); // method call
        System.out.println("String parametreli constructor calisti");
    }
    C01_ConstructorCall(int a){
        System.out.println("int parametreli constructor calisti");
    }
    static void C01_ConstructorCall(int sayi){
        System.out.println("int parametresi olan method calisti");
    }
    public static void main(String[] args) {
        C01_ConstructorCall obj1 = new C01_ConstructorCall("Merhaba Televole");
        // new C01_ConstructorCall(4);  // constructor
        // C01_ConstructorCall(4); // method
    }
}
            /*
        CONSTRUCTOR CALL ÖNEMLİ NOTLAR:

        1-) Main Method'un icinde constructor olusturmak icin "new ClassIsmi(ilgili argument)"
               seklinde constructor'ı yazabiliriz.
        2-) Main Method'un icinde Method yazmak icin direk ismini yazabiliyoruz.
         ===> "ClassIsmi(ilgiliargument)" Methodu'dur diyebiliriz.
        3-) Bir constuctor'ın icinde constructor call yapmak istersek bunun 2 şartı vardır:
            1. this() şeklinde yazıp varsa parametresini parantez içinde belirtirsek
               ilgili constructor'ı çalıştırmak üzere çağırırız.
            2. Birde this() constructor'ın içinde sadece ilk satırda yazılmalıdır.
               Sonraki satırlar için cte hatası verir.
               Bu nedenle de bir constructor'ın içinde birden fazla constructor call yapilamaz.
        4-) Eğer constructor'ın içinde ClassIsmi(ilgiliargument) seklinde bir call yapılmışsa
               bu Method Call'dur demeliyiz.

             */
