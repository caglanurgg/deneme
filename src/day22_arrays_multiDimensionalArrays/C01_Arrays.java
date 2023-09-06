package day22_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Ayse", "Yusuf", "Bugra", "Abdullah", "Nergiz", "Gulay", "Ramazan"};

        // verilen bir array'deki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin

        /*
        for loop'un icinde sayac olusturursam for loop disinda sayaci kullanamam
         */

        int sayac =0;
        int kelimeUzunlugu = 0;

        for (int i = 0; i < isimler.length ; i++) {

            kelimeUzunlugu = isimler[i].length();

            if (kelimeUzunlugu % 2  != 0) {
                System.out.print(isimler[i] + " "); // yan yana aralarinda bir bosluk birakarak yazdirin
                sayac ++;
            }
        }

        System.out.println("\nToplam " + sayac + " adet isim yazdirildi.");



    } // main method sonu

} // class body'nin sonu
