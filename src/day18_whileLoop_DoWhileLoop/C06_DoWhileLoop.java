package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere pozitif sayilar isteyin
        // kullanici islemi bitirmek icin 0'a basmalidir
        // kullanici 0'a bastiginda kac pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin

        /* once while loop ile yapalim

        Scanner scanner ;
        int sayac =0; //sayac olusturmam lazim cunku kac sayi girdigimi istiyor
        int toplam =0;
        int girilenSayi = 9; // 0 yapmada ne yazarsan yaz

        while (girilenSayi != 0) { // kullanici 0'a basinca  bitiricem

            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilenSayi =scanner.nextInt();

            if (girilenSayi !=0 ) {
                toplam +=girilenSayi; // girilenSayi 0 degilse toplama ekledim
                sayac ++;             // sayaci da bir arttirdim
            }

        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam );

        */

        // do while ile yapalim

        Scanner scanner;
        int sayac =0;
        int toplam =0;
        int girilenSayi ;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilenSayi = scanner.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;
            }

        } while(girilenSayi != 0 );

        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam );

        /*
        once islemi yapacak sonra sarti kontrol edecek
         */



    } // main method sonu
} // class body'nin sonu
