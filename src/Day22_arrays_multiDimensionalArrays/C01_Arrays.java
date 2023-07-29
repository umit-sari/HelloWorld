package Day22_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {

         /* verilen bir array'deki uzunlugu tek sayi olan isimleri
            yan yana aralarinda bir bosluk birakarak yazdirin
            en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin
          */

         String[] isimler={"Ayşe","Yusuf","Bugra","Abdullah","Nergiz"};

         int sayac=0;
         int kelimeUzunlugu=0;

         for (int i = 0; i < isimler.length; i++) {
             kelimeUzunlugu=isimler[i].length();
             if (kelimeUzunlugu%2!=0){ // uzunluk tek olması için eşit değil dedik
                 System.out.println(isimler[i]+" ");
                 sayac++;

             }
        }

        System.out.println("\nToplam " +sayac+" adet isim yazdırıldı");
    }
}
