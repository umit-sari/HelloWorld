package Day07_IfStatment;

import java.util.Scanner;

public class C11_IfElseOdev3 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin, girilen karakter
        kucuk harf ise onu buyuk harf olarak yazdirin,
        yoksa girilen harfi yazdirin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf=scanner.next().charAt(0);

        if (girilenHarf>='A' && girilenHarf<='Z'){
            System.out.println(girilenHarf);
        }else{
            System.out.println(Character.toUpperCase(girilenHarf));//toUpperCase küçük harfi büyük harf yapan methodtur

        }
    }
}
