package day11_myPractice;

public class C03_substring {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        System.out.println(str.substring(4)); // Guzeldir

        System.out.println(str.substring(7)); // zeldir

        // System.out.println(str.substring(15)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(3,6)); // a G

        System.out.println(str.substring(5,10)); //Guzel

        // 6.indexdeki harfi buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().substring(6,7)); // U
        /*
        bu yazim bize istenen index'deki tek bir elementi verir
        yoksa
        System.out.println(str.toUpperCase().substring(6)); // UZELDIR
        olurdu ama benden sadece 6. harfi buyuk yazmami istemiş
           */

        System.out.println(str.substring(3,3)); // hiclik yazdirir

        // System.out.println(str.substring(8,5)); // StringIndexOutOfBoundsException
        /*
        java'da geri donus yok
         */

        // son 3 harfi yazdirin

        System.out.println(str.substring(str.length()-3)); // dir

        String str1="Java";
        String  str2=" " ;
        String str3 = "candir";

        System.out.println(str1.concat(str2).concat(str3)); // Java candir
        System.out.println(str1 + str2 +str3 );  // Java candir

    }
}
