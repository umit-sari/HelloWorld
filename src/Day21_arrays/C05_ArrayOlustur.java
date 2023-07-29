package Day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlustur {
    public static void main(String[] args) {
        /*
         Kullanicidan array’in boyutunu ve elementlerini alip
         array’i olusturan ve bize donduren bir method olusturun
         */

        System.out.println(Arrays.toString(ArrayOlustur()));

    }
  public static int[]ArrayOlustur(){

      Scanner scanner=new Scanner(System.in);
      System.out.println("Lütfen arrayin uzunlugunu giriniz");
      int uzunluk= scanner.nextInt();
      int[] arr=new int[uzunluk];
      for (int i = 0; i < arr.length; i++) {
          scanner=new Scanner(System.in);// for loop ile her seferinde deger alabilmesi için var olan scanner objesine yeniden deger atayalım
          System.out.println("array için element giriniz");
          arr[i]= scanner.nextInt();

      }
      return arr;
  }

}
