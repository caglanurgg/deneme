package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlustur {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        //         array’i olusturan ve bize DONDUREN BİR METHOD OLUSTURUN.

        System.out.println(Arrays.toString(arrayOlustur())); // [1, 2, 3, 4, 5]

    } // main method sonu
    public static int [ ] arrayOlustur () {

        Scanner scanner=new Scanner(System.in) ;
        System.out.println("Lutfen array'in uzunlugunu giriniz");

        int uzunluk = scanner.nextInt();

        int [] arr = new int[uzunluk];

        for (int i = 0; i < arr.length ; i++) {
            scanner = new Scanner(System.in); // yani yeni bir obje olusturmadim var olan objeye deger atadim
            System.out.println("Array icin element giriniz");
            arr [i] = scanner.nextInt();

        }
        return arr;
}


} // classbody'nin sonu
