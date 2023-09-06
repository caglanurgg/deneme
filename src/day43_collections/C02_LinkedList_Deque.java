package day43_collections;

import java.util.Deque;
import java.util.LinkedList;

    public class C02_LinkedList_Deque {

        public static void main(String[] args) {
        /*
            Deque : double ended queue demektir. Cift basli kuyruk
    iki bastan da islem yapildigi icin pekcok method'un first ve last seklinde 2 versiyonu olur

         */


            Deque<String> isimler = new LinkedList<>();

            isimler.add("Cemil"); // list'deki add gibidir, sona ekler
            isimler.addFirst("Resul"); // [Resul, Cemil]
            isimler.addLast("Mehmet"); // [Resul, Cemil, Mehmet]
            isimler.addLast("Resul");
            isimler.add("Eyyup");
            isimler.add("Kaan"); // [Resul, Cemil, Mehmet, Resul, Eyyup, Kaan]

            System.out.println(isimler.removeLast()); // Kaan
            // [Resul, Cemil, Mehmet, Resul, Eyyup]

            System.out.println(isimler.removeLastOccurrence("Resul")); // true
            // [Resul, Cemil, Mehmet, Eyyup]
            // removeLastOccurrence Resul'un son kullanimini siler
            // Throws:NoSuchElementException – if this deque is empty

            System.out.println(isimler.removeLastOccurrence("Hilal")); // false
            // [Resul, Cemil, Mehmet, Eyyup]
            // Listede Hilal yok


            System.out.println(isimler.pollFirst()); //listedeki ilki Resul'u getirdi
            // [Cemil, Mehmet, Eyyup] artik listede Resul yok
            // Bos bir  queue icin poll() null sonucu doner.


            System.out.println(isimler.pop()); // Cemil'i getirdi
            // [Mehmet, Eyyup] artik listede Cemil yok
            // eger liste bossa NoSuchElementException firlatirmis


            System.out.println(isimler.offerFirst("Bugra")); // true ekleyebildigi icin
            // [Bugra, Mehmet, Eyyup]
            // offerFirst icine bir String yazmamizi istiyor bi de listede en basa koyuyor
            // ekler ama kapasite sinirlamasi yoksa


            System.out.println(isimler.peekFirst()); // Bugra
            // [Bugra, Mehmet, Eyyup]
            // peekFirst bana getiriyor ama silmiyor
            // Bos bir  queue icin peek() null sonucu doner.


            System.out.println(isimler.element()); // Bugra
            // [Bugra, Mehmet, Eyyup]
            // Throws: NoSuchElementException – if this deque is empty


            System.out.println(isimler.hashCode()); // 275678710
            // hashCode Sadece javanin bildigi,bu listeye karsilik gelen bir numara
            // ayni element icin ayni numara vermeli


            isimler.clear(); // her seyi sildim

            System.out.println(isimler.hashCode()); // 1 verdi

            isimler.add("Kahraman");

            System.out.println(isimler.hashCode()); // 841010808


            System.out.println(isimler); // [Kahraman]

        }
    }
