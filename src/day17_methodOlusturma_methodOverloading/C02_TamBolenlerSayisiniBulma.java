package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C02_TamBolenlerSayisiniBulma {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //        Girilen sayinin pozitif tam bolenleri sayisini bulup
        //        bize donduren bir method olusturun.
        //   ornek : 20  pozitif tam bolenleri : 1,2,4,5,10,20 ptbs : 6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif tam bolenleri sayisini bulmak istediginiz sayiyi giriniz");
        int tamSayi= scanner.nextInt();

        System.out.println(tamBolenlerSayisi(tamSayi));

    } // main method sonu

          /*
          Girilen sayinin pozitif tam bolenleri sayisini bulup
           bize donduren bir method olusturun.
          */

        public  static int tamBolenlerSayisi(int tamSayi) {

            int sayac=0;

            for (int i = 1; i <= tamSayi ; i++) {
               if (tamSayi %  i == 0) {
                   sayac++;
               }
            } // for loop sonu

            return sayac;

        }

} // class sonu
