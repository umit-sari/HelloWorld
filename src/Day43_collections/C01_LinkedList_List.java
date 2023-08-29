package Day43_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList_List {
    public static void main(String[] args) {
        List<String> isimler=new LinkedList<>();
        isimler.add("ahmet");
        isimler.add("cemal");
        isimler.add("ümit");


        List<String>ikinciList=new LinkedList<>();
        ikinciList.add("mahmut");
        ikinciList.add("ahmet");

        System.out.println(isimler.retainAll(ikinciList)); // true
        System.out.println(isimler); //[ahmet]-- // ortak elemanlar disindaki tum elemanlari siler

        System.out.println(ikinciList); //[mahmut, ahmet]

        ikinciList.retainAll(isimler);
        System.out.println(ikinciList); //[ahmet]

    }

}
