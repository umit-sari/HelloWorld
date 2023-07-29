package Day04NewDattacas;

public class C01_DataCasting {
    public static void main(String[] args) {

        String str= "Java candır";
        //int sayi=str;
        //char chr=str;
        //boolean bl1=str;

        String s1=str;

        //boolean bl2=10;
        //boolean bl2='s';

        int sayi2='k'; // aynı data turleri arasında
        double dbl1=sayi2;
        int sayi3 =10;
        double dbl2=4.5;
        short shrt1=3;
        byte byt1=7;

        //sayi3=dbl2; int<double oldugundan data casting yapamayız.

        sayi3=shrt1; // int>short oldugundan
        sayi3=byt1; // int>byte oldugundan
        dbl2=sayi3; // double > int oldugundan
        dbl2=shrt1; // double > short oldugundan
        dbl2=byt1;  // double> byte oldugudan  data casting işlemi yapılır.

        // byt1=dbl2; byte<double oldugundan data casting yapilamaz
        // shrt1=sayi2; short<int oldugundan data casting yapilamaz
        // sayısal ifadeler de daha geniş kapsamlı data turuleri daha dar kapsamlı data turunu kabul ediyor.

       // byt1=dbl2; olmuyor iken;
        byt1=(byte)dbl2;
        /* veri kaybini kabul ederek ( ) içine cevirecegimiz data turunu yazarız
        Java islemi kabul eder */ // kontrollu daraltma islemin adi.

        /*
            char, boolean, String'i diger data turlerine cast edemeyiz.
        Sayisal data iceren primitive data turlerini birbirine cast edebiliriz.

            1- daha kucuk data turundeki degeri, daha genis data turundeki variable'e atama yaparsak
               Java Auto Widening yapar, yani otomatik olarak bu islemi yapar

            2- daha genis kapsamli data turundeki degeri, daha dar kapsamli variable'a atama yaparsak
               Java bunu otomatik olarak yapmaz
               Biz sorumlulugu uzerimize alarak bu casting'i yaptirabiliriz

               sorumlulugu almak icin
               degerin onune bir parantez ( ) acip
               parantez icine cast etmek istedigimiz data turunu yazabiliriz. ornek: byt1=(byte)dbl2

               Daraltma (Explicit Narrowing)yapildiginda
               data kayiplari olabilecegi gibi, data baskalasabilir de

        */









    }
}
