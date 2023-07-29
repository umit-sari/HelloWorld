package Day07_IfStatment;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {
        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen üçgenin kenar uzunluklarını giriniz");

        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();
        /*
        Java da 3 lü karşılaştırma olmaz. İkili karşılaştırmalar yapıp and yada or operatörleri ile birleştirmeliyiz.
         */
        if (kenar1==kenar2&&kenar1==kenar3&&kenar1>0){
            // kenar1>0 diyerek negatif ve 0 degerleri ile eş kenar sonucunu vermesini engelledik
            System.out.println("Eskenar ucgen");
        }
    }
}
