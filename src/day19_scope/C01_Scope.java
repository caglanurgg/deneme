package day19_scope;

public class C01_Scope {

    static int classLevelStatic =12;
    String strClassLevelStaticOlmayan ="Java Guzeldir";

    public static void main(String[] args) {

        /*
       metotlarin disinda kalan yerlerde de variable'lar olusturulabilir ve bunlara CLASS LEVEL VARİABLE'LAR denir
       static kelimesini variable'lar icin  sadece class level'da kullanabiliyoruz
         */
        int sayiMain = 20;
        System.out.println(classLevelStatic);

        for (int i = 0; i <10 ; i++) {
            int sayiForLoop =5;
            System.out.println(classLevelStatic);
        }

    } // main method sonu



    public static void staticMethod () {

        String strStaticMethod ="Java Guzeldir";
        System.out.println(classLevelStatic);

    }


    public void staticOlmayanMethod() {

        boolean b1StaticOlmayanMethod = true;
        classLevelStatic =40;
    }

      /*
        Scope temelde 2'ye ayrilir
            1- Local variable'lar
                A - scope'lari icinde olusturulduklari kod blogudur
                    bir method'da olusturulan variable, baska method'dan KULLANILAMAZ
                B - Loop Scope'u
                    bir loop icerisinde olusturulan variable
                    sadece o loop icerisinde kullanilabilir
                    olusturuldugu method'da loop'un disinda da KULLANILAMAZ
               Not: local variable'lar deger verilmeden olusturulabilir
                    ama deger atanmadan KULLANILAMAZ

           2- Class Level Variable'lar
              Class level variable'lar method'larin ve kod bloklarinin disinda olusturulur
              ve scope'lari TUM CLASS'dir.

              Class level variable'larin scope'u tum class olsa da
              static keyword de variable'larin kullanimina etki eder

              -> hastane ismi, hastane adresi, bashekim adi gibi variable'lar
              herkes icin ortak olmalidir.
              bu tur variable'lar static olarak isaretlenir

              -> personel ismi, personel adresi, personel telefonu gibi variable'lar ise
              tum personel icin tanimli olmakla birlikte
              bu variable'lardaki degisim herkesi ETKILEMEZ
              sadece o personeli etkiler
              bu tur varianble'lari ise static yapmayiz
              static olmayan class level'daki variable'lara INSTANCE variable'lar denir

                C - class level static variable'lar
                    bu variable'lar static klubune uye olduklari icin
                    her yere gidebilirler
                    her method'dan kullanilabilirler
                D - class level instance variable'lar
                    variable static olmayinca ustunlugu olmaz
                    bu durumda SECİCİ OLAN METHOD olur

                    static method'lar instance variable'larin girmesine izin vermez
                    ama static olmayan method'lar,
                    static olmayan(instance) variable'lari kabul eder


     */

} // class body'nin sonu
