package Day35_inheritance;

public class FDoktor extends EMuhasebe{
    FDoktor(){
        super(3);
        System.out.println("Parametresiz Doktor constructor'i calisti");
    }
    FDoktor(String str){
        System.out.println("String Parametreli Doktor constructor'i calisti");
    }
    FDoktor(int sayi){
        this();
        System.out.println("Int Parametreli Doktor constructor'i calisti");
    }
    public static void main(String[] args) {
        // FDoktor doktor1 = new FDoktor("Java");
         /*
         Parametresiz hastane constructor'i calisti
         Parametresiz Muhasebe constructor'i calisti
         String Parametreli Doktor constructor'i calisti
          */

        //FDoktor doktor2 = new FDoktor();
        /*
        Parametresiz hastane constructor'i calisti
        String Parametreli Muhasebe constructor'i calisti
        int Parametreli Muhasebe constructor'i calisti
        Parametresiz Doktor constructor'i calisti
         */

         FDoktor doktor3 = new FDoktor(5);
         /*
        Parametresiz hastane constructor'i calisti
        String Parametreli Muhasebe constructor'i calisti
        int Parametreli Muhasebe constructor'i calisti
        Parametresiz Doktor constructor'i calisti
        Int Parametreli Doktor constructor'i calisti

          */
    }
}