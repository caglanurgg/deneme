package day14_forLoop;

import java.util.Scanner;

public class C05_RakamlarToplami {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip rakamlar toplamini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("rakamlarini toplamak uzere pozitif bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        /*girilenSayi bir inputtur onu sıfırlayarak oldurmak istemedi.
        onun degerine sahip sayi variable'i ile is yapayim
         */

        int sayi =girilenSayi; //1453
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        /*
        kullanicinin kac basamak girdigini bilmiyoruz
        sayiyi String'leştiriyoruz sayiya hiclik eklersek String olur.
        int'in basamak sayisini bulmak icin 27.satiri yaptık.
         */
       int basamakSayisi =(sayi+"").length(); // 4

        for (int i = 1; i <=basamakSayisi ; i++) {

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi; //birler bas.'nı rakamlarToplamina ekle
            sayi /=10;
        }

        System.out.println("Girilen " + girilenSayi  + " sayisinin rakamlar toplami; " + rakamlarToplami);
       


    }
}
