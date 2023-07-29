package Day07_IfStatment;

import java.util.Scanner;

public class C03_BagımsızIfCumleleri {
    public static void main(String[] args) {
        /*soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayi giriniz");
        int girilenSayi=scanner.nextInt();

        if (girilenSayi%5==0){
            System.out.println("Girilen sayi 5'in tam katıdır");
            /*
            Girilen sayi 5'in kati degilse if body'si sonuc üretmez ama calisir.
            Process finished with exit code 0 sonucunu döndürür.
            Calismasa hata verir class'ımız calismazdi.
             */
        }
    }
}
