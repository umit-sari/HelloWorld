package Day43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList_Deque {
    public static void main(String[] args) {

         /*
            Deque : double ended queue demektir. Cift basli kuyruk
            iki bastan da islem yapildigi icin pekcok method'un first ve last seklinde 2 versiyonu olur

         */
        Deque<String>isimler=new LinkedList<>();

        isimler.add("Cemil"); // list'deki add gibidir, sona ekler
        isimler.addFirst("Resul"); // [Resul, Cemil]
        isimler.addLast("Mehmet"); // [Resul, Cemil, Mehmet]
        isimler.addLast("Resul");
        isimler.add("Eyyup");
        isimler.add("Kaan"); // [Resul, Cemil, Mehmet, Resul, Eyyup, Kaan]

        System.out.println(isimler.removeLast());// Kaan
        // [Resul, Cemil, Mehmet, Resul, Eyyup]

        System.out.println(isimler.removeLastOccurrence("Resul")); // true
        // [Resul, Cemil, Mehmet, Eyyup]

        System.out.println(isimler.removeLastOccurrence("ümit")); // false
        // [Resul, Cemil, Mehmet, Eyyup]

        System.out.println(isimler.pop());// Resul
        // [Cemil, Mehmet, Eyyup]

        System.out.println(isimler.offerFirst("ali"));
        // [ali, Mehmet, Eyyup]

        System.out.println(isimler.peekFirst());// ali
        // [ali, Mehmet, Eyyup]

        System.out.println(isimler.element());// ali
        //[ali, Mehmet, Eyyup]

        System.out.println(isimler.hashCode()); //-703778043

        isimler.clear();

        System.out.println(isimler.hashCode()); // 1

        isimler.add("Kahraman");

        System.out.println(isimler.hashCode()); // 841010808


        System.out.println(isimler);


    }
}
