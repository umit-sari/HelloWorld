package Day01_HelloWorld;

public class C01_HelloWorld {
    public static void main(String[] args) {
        //bu class yazılım dünyasına giren herkes gibi hello world
        // yazmak için oluşturuldu. az sayıda paragrafta bilgi notu için ters slasları kullanırız.

        /*
        birden çok fazla satırı
        yazmak için slas-yıldız kullanırız.
        bilgi notları main methodu etkilemez.
         */
        System.out.println("Hello World");
        System.out.println( "\tMerhaba Dunya");// \t bir tab kadar boşluk bırakıyor.
        System.out.println("merhaba" +
                "Dunya");
        System.out.println(10+"15");// tırnak içinde rakam yazdığımızda + işareti baştakinin yanına getiriyor.
        System.out.println(10+15);// tırnak içinde yazmazsak toplama yapıyor matematik işlemi olarak algılıyor.
        System.out.print("\tMerhaba\nDunya"); // \n alt satıra inmemize yarıyor.

    }
}
