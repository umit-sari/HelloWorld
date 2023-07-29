package Day07_IfStatment;

import java.util.Scanner;

public class C10_IfElseodev2 {
    public static void main(String[] args) {
        /*
         Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
olup olmadigini yazdirin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scanner.next().charAt(0);
        if(girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println("girilenKarakter:Büyük harftir.");
        }else{
            System.out.println("girilenKarakter:Büyük harf değildir.");
        }

    }
}
