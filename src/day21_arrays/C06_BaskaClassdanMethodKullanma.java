package day21_arrays;

import day16_methodOlusturma_Kullanma.C02_baskaClassdanMethodKullanma;
import day20_arrays.C02_ArrayElementleriniGuncelleme;

import java.util.Arrays;

public class C06_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        int [] arr = {2,4,6,8} ;
        System.out.println("eski array : " + Arrays.toString(arr)); // [2, 4, 6, 8]

        arr= C02_ArrayinElementleriniIstenenKadarArttirma.elementleriniArttirma(arr,4);
        System.out.println("yeni array : " + Arrays.toString(arr)); // [6, 8, 10, 12]

        System.out.println(C03_PozitifElementleriTopla.pozitifSayilariToplama(arr)); //  36

        C04_ElementSay.elemanSay(arr,4); // Aranan sayi array'de yok

        // method void oldugu icin bizim sout yapmamiza gerek yok

        //kullanicidan deger alarak int[] olusturmak istiyorum

        int [] kullaniciArrayi = C05_ArrayOlustur.arrayOlustur();

        System.out.println(Arrays.toString(kullaniciArrayi));

    } // main method sonu
} // class body'nin sonu
