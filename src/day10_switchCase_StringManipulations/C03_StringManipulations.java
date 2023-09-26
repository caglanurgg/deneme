package day10_switchCase_StringManipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {

        /*
        String Manipulations,
        verilen bir String uzerinde "HAZIR METHOD'LAR kullanarak
        - degisiklik yapmak
        - veya verilen String uzerindeki bir bilgiyi
        almak icin yaptigimiz islemlerdir

        String uzerinde yapilan manipulasyon islemleri
        String'i kalici olarak degistirmez

        Eger yapilan islem sonucundaki yeni halin kalici olmasini istersek
        ATAMA yapmaliyiz
        */

      String str= "Java Candir";

      // str'in ilk harfini yazdirin
        System.out.println(str.charAt(0)); // J

        // str'in tum harfleri buyuk olacak sekilde yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        // str'i tamamen kucuk harflerden olusan bir metne cevirin

        str=str.toLowerCase();

        System.out.println(str); // java candir






    }
}
