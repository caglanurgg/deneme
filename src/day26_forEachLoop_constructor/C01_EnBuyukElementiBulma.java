package day26_forEachLoop_constructor;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {

        // array'in elementlerinden en buyuk olani bulun

        int[] arr = {3,6,9,1,3,7,12,34,23,-87,32,-43};

        int enBuyukElement=arr[0];

        /*
        enBuyukElementi array'deki her bir elementle karsilastirmam ve
        daha buyuk bir eleman varsa onu enBuyukElement ilan etmem lazim
         */

        for (int each : arr // arraydeki her bir int'i bana getir
             ) {
           if (each > enBuyukElement) {
               enBuyukElement = each ;
           }
        }
        System.out.println("Arraydeki en buyuk element : " + enBuyukElement);
        // Arraydeki en buyuk element : 34

     /*
     for each loop (enhanced) gelismis bir loop olarak bilinir
     ve bir array veya collection'daki TUM ELEMENTLERI index veya siralama olmaksizin bize getirir.

     AVANTAJI : Index yapisina ihtiyac duymadigindan kod yazarken yasanacak hatalari azaltir,
     tum elementleri eksiksiz olarak bize getirir.

     DEZAVANTAJI : Index yapisi olmadigindan belli elementleri atlama,elementleri bastan sona
     veya sondan basa sirali getirme gibi islemleri yapamaz

 */


    } // main method sonu
} // class body'nin sonu
