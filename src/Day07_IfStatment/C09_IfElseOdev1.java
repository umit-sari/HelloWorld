package Day07_IfStatment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C09_IfElseOdev1 {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int girilenYas= scanner.nextInt();
        if (girilenYas>=65){
            System.out.println("Emekli olabilirsin");
        }else{
            System.out.println("Emekli olmak için gereken yıl:"+ (65-girilenYas));
        }

    }
}
