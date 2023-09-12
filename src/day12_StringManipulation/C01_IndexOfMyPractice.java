package day12_StringManipulation;

public class C01_IndexOfMyPractice {
    public static void main(String[] args) {

        String str = "Ali topu at, topu at ali at";

        /*
        not = her bir kırılma bir if else dir
        */

        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulun

        int ilkIndex = str.indexOf("at");

        if (ilkIndex == -1) { // hiç kullanılmamıssa
            /*
            ilk index -1 ise bu hiç kullanilmamis bosuna ugrasma
             */
            System.out.println("2 kere kullanilmamıs");

        } else { // // en az 1 kere kullanilmis
            int ikinciIndex = str.indexOf("at", ilkIndex + 1);
            // -1 veya  2.defa kullanilmissa  dogal sayi olur
            if (ikinciIndex == -1) {
                // ikinci index'in -1 olmasi
                // sadece 1 kere kullanilmis,ikinci kere kullanilmamis
                System.out.println("2 kere kullanilmamis");
            } else {
                System.out.println("2 veya daha fazla kullanilmis");
            }

          /*
         1. bolum  hic kullanilmamis bolumu

          if (ilkIndex == -1) { // hiç kullanılmamıssa

            // ilk index -1 ise bu hiç kullanilmamis bosuna ugrasma

            System.out.println("2 kere kullanilmamıs");
            */

            /*
         2. bolum   en az 1 kere kullanilmis bolumu

            } else { // // en az 1 kere kullanilmis
            int ikinciIndex = str.indexOf("at", ilkIndex + 1);
            // -1 veya  2.defa kullanilmissa  dogal sayi olur
            if (ikinciIndex == -1) {
                // ikinci index'in -1 olmasi
                // sadece 1 kere kullanilmis,ikinci kere kullanilmamis
                System.out.println("2 kere kullanilmamis");
            } else {
                System.out.println("2 veya daha fazla kullanilmis");
            }
             */
        }
    }
}
