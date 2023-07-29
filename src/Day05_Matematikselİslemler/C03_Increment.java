package Day05_Matematikselİslemler;

public class C03_Increment {
    public static void main(String[] args) {
        int sayi=10;

        // sayi variablenin degerini 2 katının 5 fazlasını yazın.

        sayi=10;
        sayi=2*sayi+5;
        System.out.println(sayi); //25

        //2.yontem

        sayi*=2;
        sayi+=5;
        System.out.println(sayi); //25

        sayi=10;
        sayi*=3;
        sayi-=3;
        sayi/=3;
        System.out.println(sayi); // 9

        int a=10;
        /*
        a nın degerini yeni oluşturdugumuz b ye atayıp
        sonra a nın degerini 1 artırın.
        sonra a ve b yi yazdırın
        */
        int b=a;
        a++;
        System.out.println("a:"+a+"b:"+b); // a:11 b:10

        a++;
        b=a;
        System.out.println("a:"+a+"b:"+b); // a:12, b:12 .
        // a'nin degeri yukarda 11 oldu ve +1 eklenince 12 oldu ve daha sonraki adim da 12 olarak b'ye atandi.




    }
}
