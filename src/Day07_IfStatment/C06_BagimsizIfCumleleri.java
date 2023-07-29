package Day07_IfStatment;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri {
    public static void main(String[] args) {
        /*Kullanıcıdan bir sayı isteyin ve 3 veya 5 e bölünebiliyorsa Güzel sayı yazdırın

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();
        if (girilenSayi%3==0 ||girilenSayi%5==0){
            System.out.println("Güzel Sayi");
        }
    }
}
