package Day22_arrays_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanSayiAlipArrayeEkleme {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alip
        // arr'ye 4.element olarak ekleyin.

        int [] arr={3,5,8};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Array'e eklenecek sayıyı giriniz");
        int eklenecekSayi= scanner.nextInt();
        arr=C06_ArrayeBirElemanEkleme.arrayeBirElemanEkle(arr,eklenecekSayi); // daha önce olusturdugumuz methodu kullanndık
        System.out.println(Arrays.toString(arr));

        // 5.element olarak 11'i ekleyelim.
        arr=C06_ArrayeBirElemanEkleme.arrayeBirElemanEkle(arr,11);
        System.out.println(Arrays.toString(arr));

    }
}
