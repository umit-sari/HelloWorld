package Day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cemberin yari capini giriniz");
        double yaricapi= scanner.nextDouble();
        System.out.println("Cemberin cevresi:"+2*3.14*yaricapi);
        System.out.println("Cemberin alani:"+ 3.14*yaricapi*yaricapi);
    }
}
