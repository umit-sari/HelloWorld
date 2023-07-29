package Day12_StringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        String str="Ali topu at, topu at ali";

        // ilk top metin parcasinin index'ini yazdirin
        System.out.println(str.indexOf("top")); // 4

        // ikinci top metin parcasinin index'ini yazdirin
        System.out.println(str.indexOf("top",5)); // 13
        System.out.println(str.indexOf("top",str.indexOf("top")+1)); //13

        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulun
        int ilkIndex= str.indexOf("at");  // ya -1 (metinde yok anlamında)  veya dogal sayi olur
        if (ilkIndex == -1){ // hic kullanilmamis. index of'ta sonuc -1 ise aranan şey metinde yoktur demektir.
            System.out.println("2 kere kullanilmamis");
        }else{ // en az 1 kere kullanilmis

             int ikinciIndex = str.indexOf("at",ilkIndex+1);
            // -1 veya 2.defa kullanilmissa dogal sayi olur
             if (ikinciIndex == -1){ // sadece 1 kere kullanilmis, 2.kullanim yok
                System.out.println("2 kere kullanilmamis");
             }else{
                System.out.println("2 defa veya daha fazla kullanilmis");
            }
        }

    }
}
