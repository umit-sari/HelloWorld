package Day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_Tekrar {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini
                2 artirip bize yazdırın.
                Eski array’i yeni haliyle kaydedin.
         */

        int[] arr = {3,4,6,8,1,4,7,3,2};
        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=2;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------");
        int[] arr2 = {3,5,2,7};
        int artis = 3 ;
        // verilen array'in tum elementlerini
        // artis miktari kadar artirin
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]+=artis;

        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------------------------");
        /*Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize  yaziniz.

         */
        int[] arr3 = {-4, 5, 2, 0, -3, 5};//12
        int toplam=0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]>0){
                toplam+=arr3[i];
            }

        }
        System.out.println("Toplam :"+toplam);
        System.out.println("-------------------------------");

        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdirın.

        int[] arr4 = {3,5,2,3,5,6,7,1,8};
        int arananSayi = 5;
        int sayac=0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] == arananSayi) {
                sayac++;
            }
        }
            if (sayac==0){
                System.out.println("Aranan sayı Array'de yoktur");
            }else{
                System.out.println("Aranan " +arananSayi +" sayisi array'de "+
                        sayac+ " kere kullanilmis.");

            }
        System.out.println("-------------------------------");
            /*
         Kullanicidan array’in boyutunu ve elementlerini alip
         array’i olusturan ve bize yazdırın
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Array'in boyutunu giriniz");
        int Boyut= scanner.nextInt();
        int [] arr5=new int[Boyut];
        for (int i = 0; i < arr5.length; i++) {
            scanner=new Scanner(System.in);
            System.out.println("Lütfen Array'in elementlerini giriniz");
            arr5[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr5));

        System.out.println("-------------------------------");
        /*  Soru 6- Verilen String bir array’deki
                 en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
         */

        String[] isimler = {"Resul","Omer","Mehmet","Ertugrul","Ozan","Suleyman"};
        String enKısaIsım=isimler[0];
        String enUzunIsım=isimler[0];
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length()>enUzunIsım.length()){
                enUzunIsım=isimler[i];
            }
            if (isimler[i].length()<enKısaIsım.length()){
                enKısaIsım=isimler[i];
            }
        }
        System.out.println("En uzun isim : " + enUzunIsım);
        System.out.println("En kisa isim : " + enKısaIsım);





    }
}
