package day12_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        // a harfinin ilk kullanim index'ini yazdirin
        System.out.println(str.indexOf("a"));  // 1

        // a harfinin son kullanimin index'ini yazdirin
        System.out.println(str.lastIndexOf("a")); // 24

        // J harfinin ilk index'ini yazdirin
        System.out.println(str.indexOf("J"));  // 0

        // J harfinin son kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("J")); // 0

        // metne bakmadan e harfini 2 kere veya daha fazla kulllanılıp
        // kullanılmadıgını kontrol edin

        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");


        if (ilkIndex == -1) { // hiç kullanılmamıssa
            System.out.println("metinde e harfi kullanılmamıstır");

        } else if (ilkIndex == sonIndex) {
            System.out.println("sadece 1 kere kullanilmis");
        } else {
            System.out.println("e harfi 2 veya daha fazla kullanilmis");
        }

        //  "Javayi ogrenecegiz, baska yolu yok";

        // o harfinin son index'ini  yazdirin
        System.out.println(str.lastIndexOf("o")); // 32

        // o harfinin son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("o",31)); // 27
        /*
        bundan bir  onceki o'yu bulmak istiyorsam 32'nin 1 eksiginden baslamalıyım
        */

       // k harfinin son kullaniminin index'ini yazdiralim
        System.out.println(str.lastIndexOf('k')); //  33

    }

}















