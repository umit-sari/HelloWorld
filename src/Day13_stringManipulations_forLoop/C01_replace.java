package Day13_stringManipulations_forLoop;

public class C01_replace {
    public static void main(String[] args) {
        String str = "Javayi anliyorum ama yazamiyorum";
        // var olan bir String'in istedigimiz bolumunu degistirebiliriz
        System.out.println(str.replace('J', 'T'));
        // Tavayi anliyorum ama yazamiyorum
        System.out.println(str.replace('a', '*'));
        // J*v*yi *nliyorum *m* y*z*miyorum
        System.out.println(str.replace("ama yazamiyorum", "ve yazabiliyorum"));
        // Javayi anliyorum ve yazabiliyorum
        System.out.println(str.replace("Java","AA"));
        // AAyi anliyorum ama yazamiyorum
        System.out.println(str.replace("yorum","yore"));

        /*
         replace(target:"yorum",replacement:"yore")) ile string kelimeleri/ harfleri
         uzunluk-kısalık farketmeksizin değistirebiliyoruz. Uzun bir kelimeyi bir harfle bile degistirebiliyoruz.
         replace(oldChar:'a', newChar:'*')) ile tek bir karakter Char degisimi yapabiliyoruz.
         */
    }

}
