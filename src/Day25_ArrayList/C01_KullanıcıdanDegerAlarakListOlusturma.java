package Day25_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanıcıdanDegerAlarakListOlusturma {
    public static void main(String[] args) {
 /*
 Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
 liste olarak dondurecek bir method olusturun.

  */
   System.out.println(listOlustur());


    }
    public static List<String> listOlustur(){
        Scanner scanner=new Scanner(System.in);
        String girilenIsim;
        List<String> isimList= new ArrayList();
        do{ // kullanıcının ne zaman Q girecegini bilmiyoruz. hemen listeye eklemiyoruz.Q degilse ekliyoruz. Qatar eşit değil Q'ya
            scanner=new Scanner(System.in);
            System.out.println("Listeye ekelemek için isim giriniz,\n Bitirmek için Q'ya basınız");
            girilenIsim=scanner.nextLine();
            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimList.add(girilenIsim);

            }
        }while (!girilenIsim.equalsIgnoreCase("Q")); // kullanıcının ne kadar isim girdiğimizi bilmiyoruz.
        // Q 'ya basılmadıgı surece devam et.

         return isimList;


    }

}


