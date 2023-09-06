package day29_passByValue;

public class C01_staticBlocks {

   C01_staticBlocks() {
      System.out.println("parametresiz constructor calisti");
   }

    static {
        System.out.println("static blok 2 calisti");
    }
    public static void main(String[] args) {
    System.out.println("main method calisti");


        C01_staticBlocks obj = new C01_staticBlocks();
        System.out.println("obje  olusturuldu");
    }

    static {
        System.out.println("static blok 1 calisti");
    }

    {
        System.out.println("static olmayan blok calisti");
        // obje olusturuldugunda calisir
    }

   /*
   calisma sirasi

   static bloklar tum class uyelerinden, main method'dan bile once calisir

   static blok 2 calisti   birden fazla varsa once ustteki static blok calisir
   static blok 1 calisti
   main method calisti
   static olmayan blok calisti
   parametresiz constructor calisti
   obje  olusturuldu


   bilgi
   static bloklar class ilk calistirildigi anda calisir
   ve class'in baslangic degerlerini olusturur(initiliaze)
   */

}
