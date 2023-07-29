package Day23_multiDimensionalArrays;

public class C01_TumElementleriToplama {
    public static void main(String[] args) {

        int [] arrTek={3,7,1,9};
        int toplam=0;

        for (int i = 0; i < arrTek.length; i++) {
           // arrTek[i]=> index degistikce bize array'deki tüm elementleri sırayla getirir.

            toplam+=arrTek[i];

        }
        System.out.println("arrTek'in elementleri toplamı : "+ toplam);

         toplam=0;
        int [][] sayilar={{1,2,5},{7,4},{9},{3,0,1}};
        // arr[i]=> inner array'leri getirir.
        // arr[i][j] seklinde yaparsak array'lerin içindeki elemenlere ulaşırız
        // yani kat sayisi kadar index e yani forLoop a ihtiyacımız var.

        for (int i = 0; i < sayilar.length ; i++) { // dışardaki forLoop outer Array'i kontrol eder.
            for (int j = 0; j <sayilar[i].length ; j++) { // icerdeki forLoop inner Array'leri kontrol eder.
                // inner array'lerin length uzunlugunu alıyor. örnek sayılar 0 inner array'in uzunlugu 3...{1,2,5}

                // sayilar[i][j] sırasıyla herbir int elementi getirir.

            toplam+=sayilar[i][j];

            }
        }

        System.out.println("Sayilar Array'in elementleri toplamı: "+toplam);
    }

}
