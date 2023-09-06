package day11_myPractice;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {

        String isim="Ramazan Uzunkavaklaraltindayataruyumazoglu";

        // son harfi yazdirin

        System.out.println("isim uzunlugu : "  + isim.length() ); // isim uzunlugu : 42

        System.out.println("son harf :" + isim.charAt(isim.length() - 1) ); // u

        System.out.println("son harf :" + isim.charAt(41) ); // u

        // sondan 5.harfi yazdirim
        System.out.println("sondan 5.harf :" + isim.charAt(isim.length() - 5)); // z

        // Kullanicidan ismini alin
        // ve ortadaki harfi yazdirin
        // ismin uzunlugu cift sayi ise orta kisimdaki 2 harfi yazdirim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim= scanner.nextLine();

        int uzunluk= girilenIsim.length();

        if ( uzunluk  % 2 == 0) {  // ismin uzunlugu cift sayi
            System.out.println("uzunluk cift: " +
                    girilenIsim.charAt(uzunluk / 2 - 1 )+
                     girilenIsim.charAt(uzunluk / 2) ) ;

        } else { // ismin uzunlugu tek sayi
            System.out.println("uzunluk tek :"  + girilenIsim.charAt((uzunluk - 1) / 2 ) );

        }


     /*
     kendime not : parantezlere dikkat et

     */



       }






    }

