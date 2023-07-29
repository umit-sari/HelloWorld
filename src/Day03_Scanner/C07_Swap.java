package Day03_Scanner;

import java.util.Scanner;

public class C07_Swap {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi= scanner.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi= scanner.nextInt();
        System.out.println("Ilk sayinin yeni degeri:"+(ilkSayi*ikinciSayi)/ilkSayi); // 4 islem ile degisim yapılabilinir.
        System.out.println("Ikinci sayinin yeni degeri:"+(ikinciSayi*ilkSayi)/ikinciSayi);

    }
}