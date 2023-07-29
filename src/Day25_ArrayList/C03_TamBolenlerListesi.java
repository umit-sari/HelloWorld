package Day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {
    public static void main(String[] args) {

        System.out.println(pozitifTamBolenlerListesi(20));
        System.out.println(pozitifTamBolenlerListesi(152444));


    }

    public static List<Integer> pozitifTamBolenlerListesi(int sayi){

        List<Integer> tamBolenlerListesi=new ArrayList<>();
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0) {
                tamBolenlerListesi.add(i);
            }

        }

        return tamBolenlerListesi;

    }
}
