package day12_StringManipilation;

public class C04_nullPointer {
    public static void main(String[] args) {

        String str1;

      //  System.out.println(str1); sen buna deger atamadin ki neyi yazdirmak istiyorsun ki der java
        // str1.concat("candir");

        str1="java";

        System.out.println(str1); // java
        System.out.println(str1.concat(" candir")); // java candir

        String str2 = null;
        System.out.println(str2); // null
        System.out.println(str2 + " candir"); // null candir

        /*
        null bir deger degil pointer (isaretleyici)

        16.satir icin
        str2'nin degeri null veya str2'ye null atanmis ifadeleri YANLISTIR

        dogru olan ifade
        str2'ye deger atamadik,BUNUN FARKİNDAYİZ ve null olarak isaretledik
       */

        /*
        eğer bunu bir methot'da kullanmak isterseniz
        sen bunu null olarak isaretlemistin
        null bir deger degildir
        deger olmadıgı icinde bunu bir methot'da kullanamazsin der
        kullanirsan java altını kırmızı  cizmez ama program calistirildiginda NullPointerException der
         */

        // System.out.println(str2.concat("  candir")); // NullPointerException

        str2="tava";
        System.out.println(str2); // tava
        System.out.println(str2.concat(" yemekleri")); // tava yemekleri













    }
}
