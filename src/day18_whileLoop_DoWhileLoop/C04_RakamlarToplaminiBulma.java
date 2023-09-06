package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner =  new Scanner(System.in);

        System.out.println("lutfen rakamlar toplamini bulmak istediginiz sayiyi yaziniz");

        int girilenSayi = scanner.nextInt();

        int sayi=girilenSayi;
        /*
        sayiyi bole bole sifira gittigimiz icin girilen sayiyi degistirmek istemedigim icin
        kodun ilerleyen asamalarinda girilen sayiyi kullanmayin o bir kenarda dursun
        bunu baska bir variable'a atayin
         */
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while (sayi > 0) { // sayi 0'dan buyuk oldugu muddetce devam edecek

            birlerBasamagi =sayi % 10;
            rakamlarToplami +=birlerBasamagi;
            sayi /= 10;
        }

        System.out.println("Girilen " + girilenSayi + " 'nin rakamlar toplami : " + rakamlarToplami );

        /*
        eger 17.satiri yapmasam 33.satirda girilen sayiyi yazamazdim cunku sayi 0 olurdu
         */

    } // main method sonu
} // class body'nin sonu
