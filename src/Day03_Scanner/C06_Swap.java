package Day03_Scanner;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi= scanner.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi= scanner.nextInt();

        //ilkSayi=ikinciSayi; // yer değiştirme için gecici- (temp) bir variable olusturmaliyiz.

        int temp=ilkSayi; // temp gecici demek
        ilkSayi=ikinciSayi;
        ikinciSayi=temp;

        System.out.println("ilk sayinin yeni degeri:"+ilkSayi);
        System.out.println("ikinci sayinin yeni degeri:"+ikinciSayi);


    }
}
