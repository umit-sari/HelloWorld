package Day02_DataTurleri_variable;

public class C04_StringDataTuru {
    public static void main(String[] args) {
        int sayi = 20;
        System.out.println(sayi);// sayi yanına nokta koyarsak bize method önerisi sunar.

        String isim = "Umit Sari";
        System.out.println(isim.toUpperCase()); // isim yanına nokta koyarsak ta java bize öneri sunar.
        // toUpperCase girilen metinin harflerinin hepsini büyük harf yapar
        System.out.println(isim.toLowerCase());
        //toLowerrCase girilen metinin harflerinin hepsini kücük harf yapar


        // verilen isim ve soyismi
        // girilen: Ümit sari database'e kaydedildi.
        //seklinde yazdirin.

        String adi = "Ümit";
        String soyadi = "Sari";
        System.out.println("Girilen:" + " " + adi +" " + soyadi + " " + "databese'e kaydedildi");

        // "" arasındaki boşluklar konsola yazdırılan metne yansır.
        //ancak kodlar arasına bırakılan bosluklar metne yansımaz.
    }
}
