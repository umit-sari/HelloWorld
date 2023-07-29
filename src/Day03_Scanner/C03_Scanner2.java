package Day03_Scanner;

import java.util.Scanner;

public class C03_Scanner2 {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String girilenIsim= scanner.nextLine(); // sadece bir kelime icin next, birden fazla kelime icin
        // nextline kullaniyoruz.
        // bir oncekini next sonra nextline yaparsak hata olabilir.

        System.out.println("Lutfen soyisminizi yazin");
        String girilenSoyisim=scanner.nextLine();
        System.out.println("Lutfen yasinizi yazin");
        int girilenYas=scanner.nextInt();

        System.out.println("Isminiz:"+ girilenIsim);
        System.out.println("Soyisim:"+girilenSoyisim);
        System.out.println("Yas:"+ girilenYas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
    }
}
