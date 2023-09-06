package day21_arrays;

import java.util.Arrays;

public class C02_ArrayinElementleriniIstenenKadarArttirma {
    public static void main(String[] args) {

        int [] arr={3,5,2};
        int artis =4;

        // verilen array'in tum elementlerini (bu is for loop'un isi)
        // artis miktari kadar arttirin

        for (int i = 0; i < arr.length ; i++) {

            arr [i] += artis;
        }
        System.out.println(Arrays.toString(arr)); // [7, 9, 6]
        //ekranda gormek istiyorsak

        System.out.println(Arrays.toString(elementleriniArttirma(new int[] {3,6,7} ,5))); // [8, 11, 12]

    } // main method sonu

    public static int [ ] elementleriniArttirma (int [ ] arr,int artis) {

        for (int i = 0; i < arr.length ; i++) {

            arr [i] += artis;

        }
        return arr ;
    }
} // class body'nin sonu
