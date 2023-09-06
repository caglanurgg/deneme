package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class usHesaplama_pratice {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip
        //        YAZDİRAN BİR METHOD OLUSTURUN

        Scanner  scanner =new Scanner(System.in);
        System.out.println("Lutfen ussunu hesaplamak icin bir sayi giriniz");
        double sayi= scanner.nextDouble();

        System.out.println("Lutfen hesaplamak icin us giriniz");
        int us= scanner.nextInt();

        usHesaplama(sayi,us); // method ismi 

    } // main method sonu

    public static void usHesaplama (double sayi, int us) {

        double sonuc =1;

        while (us >0) {

            sonuc *=sayi;
            us--;
        }
        System.out.println("sonuc  :" +  sonuc);
    }
} // class body'nin sonu
