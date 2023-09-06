package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {
    public static void main(String[] args) {

        // Soru 6-
        //         verilen pozitif bir  tamsayiyi
        //         tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun.

        System.out.println(pozitifTamBolenlerListesi(20)); // [1, 2, 4, 5, 10, 20]

        System.out.println(pozitifTamBolenlerListesi(120));
        // [1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 30, 40, 60, 120]

        System.out.println(pozitifTamBolenlerListesi(1345)); // [1, 5, 269, 1345]

    } // main method sonu

public static List<Integer> pozitifTamBolenlerListesi(int sayi)  {

        List<Integer> tamBolenlerListesi = new ArrayList<>();

    for (int i = 1; i <= sayi ; i++) {

        if (sayi % i == 0) {
            tamBolenlerListesi.add(i);
        }
    }
    return tamBolenlerListesi;

}
} // class body'nin sonu
