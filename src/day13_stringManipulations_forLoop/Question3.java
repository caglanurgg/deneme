package day13_stringManipulations_forLoop;

import java.util.Scanner;
import java.util.SortedMap;

public class Question3 {
    public static void main(String[] args) {

        //Soru 3-Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //       sadece ilk harfi buyuk deger diger harfler kucuk harf yapan bir program yazin.
        //       input : java1 ogRe2@nMek3 #ne +Gu=zel
        //       output : Java ogrenmek ne guzel


       Scanner scanner = new Scanner(System.in);
       System.out.println("Lutfen bir metin giriniz");
       String metin = scanner.nextLine();

        //once sayilardan kurtulalim
        metin=metin.replaceAll("\\d","");
        System.out.println(metin); // java ogRe@nMek #ne +Gu=zel

        metin=metin.replaceAll("\\s","1");

        metin=metin.replaceAll("\\W","");
        System.out.println(metin); // java1ogRenMek1ne1Guzel

        metin=metin.replaceAll("1"," ");
        System.out.println(metin); // java ogRenMek ne Guzel

        // once hepsini kucuk harfle yazalim
       metin=metin.toLowerCase();
        System.out.println(metin); // java ogrenmek ne guzel

        // sonra ilk harfi buyuk harfe cevirelim
        metin=metin.replace("java","Java");
        System.out.println(metin); // Java ogrenmek ne guzel










    }
}
