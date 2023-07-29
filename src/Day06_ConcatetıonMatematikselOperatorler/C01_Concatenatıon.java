package Day06_ConcatetıonMatematikselOperatorler;

public class C01_Concatenatıon {
    public static void main(String[] args) {
        String s1="Java";
        String s2= "Candır";
        String s3=" ";
        String s4="";
        int a=3;
        int b=5;
        // sadece yukardaki variable'lari kullanarak
        // asagida verilen metin'leri yazdirin
        /* java yukardan asagiya ve soldan saga calisir.
        String

         */

        //Java35
        System.out.println(s1+a+b); // Java35

        //Java15
        System.out.println(s1+a*b);//Java15

        //8candır
        System.out.println(a+b+s2);

        //53Java
        System.out.println(b+(a+s1)); // parantez oldugundan islem önceligi var.
        System.out.println(s4+b+a+s1);
        System.out.println(b+s4+a+s1);
        /* b yi stringleştirmek için ""(String hiçlik) ile topluyoruz. String ile toplama da  herşeyi String yapar.
        b yi (5 i) Stringlestiriyoruz.
        String5+3 (a) toplamı String olarak 53 eder.
        */

        //35 Java
        System.out.println(s4+a+b+s3+s1); // 35 Java













    }
}
