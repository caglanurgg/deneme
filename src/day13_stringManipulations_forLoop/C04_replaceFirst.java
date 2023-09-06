package day13_stringManipulations_forLoop;

public class C04_replaceFirst {
    public static void main(String[] args) {

       String str="Java Candir,kendisini cok seviyoruz123.";

       // sadece ilk a'yı BUYUK A yapin

        str =str.replaceFirst("a","A");
        System.out.println(str);  // JAva Candir,kendisini cok seviyoruz123.

        // ilk space'i iki space hale getirin

        System.out.println(str.replaceFirst(" ","  "));
        //JAva  Candir,kendisini cok seviyoruz123.

        //ilk sayiyi space haline getirin
        System.out.println(str.replaceFirst("\\d"," "));
        //JAva Candir,kendisini cok seviyoruz 23.

        /*
       methodum first replace oldugu icin sadece  butun sayilar kapsamına giren
       ilk sayi icin bu degisimi yapar
       sonrakiler icin yapmaz
         */


        // ilk ozel karakteri * olarak degistirin
        System.out.println(str.replaceFirst("\\W","*"));
       //JAva*Candir,kendisini cok seviyoruz123.

        /*
        ozel karakterli \\W ile belirliyoruz
         */






    }
}
