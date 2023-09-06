package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C05_usHesaplama {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip
        //        YAZDİRAN BİR METHOD OLUSTURUN

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen ussunu hesaplayacagimiz pozitif bir sayi  giriniz");
        double sayi = scanner.nextDouble();

        System.out.println("Lutfen hesaplanacak us icin pozitif bir tamsayi giriniz");
        int us = scanner.nextInt();

        usHesapla(sayi,us);

    } // main method sonu

    public static void usHesapla (double sayi ,int us) { //YAZDİRAN BİR METHOD OLUSTURUN (VOİD)

        double sonuc=1;

        while (us > 0) {

            sonuc *=sayi;
            us--;
        }
        System.out.println("sonuc :" + sonuc );
    }
} // class body'nin sonu
