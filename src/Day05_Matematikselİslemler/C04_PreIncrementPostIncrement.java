package Day05_Matematikselİslemler;

public class C04_PreIncrementPostIncrement {
    public static void main(String[] args) {
        //Java da bir önceki class ta yaptıgımız gibi artırma ve atama
        //veya artırma ve yazdırma beraber olabilir.

        int a=20;
        int b=10;
        System.out.println(b=2*a);//40
        System.out.println(a=b-5);//35

        a=10;
        // once a nın degerini b ye atayın sonra a yı artırın
        //b=a;
        //a++; bunun yerine tek satırda

        b=a++; // burda önce b ye atadık sonra a yı artırdık.
        System.out.println("a:"+a+"b:"+b);// a:11b:10

        // a nın degeri +1 artirin sonra b ye atayın

        b=++a;// burda önce a nin degerini artırıp b ye atadık.
        System.out.println("a:"+a+"b:"+b);// a:12b:12

        /* bu kullanim sadece ++ ve -- için var
        burada ++ veya -- yi önce mi veya sonra mı kullanacagımıza
        bizden istenen sonuca göre karar veririz.
        artırma önce ise ++a, artırma sonra ise a++

         */

        a=20;
        System.out.println(a++);//21
        /*
        ++ isaretleri variable den sonra (a++) ise önce yazdiriyo sonra artırıyor.
        ++a ise önce artırıyor sonra yazdırıyor.

        */

        System.out.println(a);//20  // ++ isleminde önce a yı yazdırıp sonra a yı artırma

        a=20;
        System.out.println(--a); // 19
        System.out.println(a); // 19 //-- a dan önce oldugundan islemde önce a yı azaltıp sonra a yı yazdırıyor.




    }
}
