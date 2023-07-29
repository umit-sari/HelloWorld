package Day14_forLoops;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 20den kucuk pozitif bir sayı alın ve girilen sayının faktöriyel degerini yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scanner.nextInt();
        int faktoriyel=1;
        if (sayi>20){
            System.out.println("Lutfen 20'den kucuk bir sayi giriniz");
        }else{
            for (int i = 1; i <=sayi ; i++) {
                faktoriyel*=i;

            }
            System.out.println("Faktoriyel degeri :"+ faktoriyel);

            }
        }



}
