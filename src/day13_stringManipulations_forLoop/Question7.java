package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

         /*
         Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup
         bunları özel forma dönüştürün.
         - Ad ve soyadın baş harfleri büyük olmalıdır
         - Kredi kartı numarasını kontrol edin,
           16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
         - Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
            Ipucu: IF Else ile çözebilirsiniz.

            Giriş : > Gandalf Grey 563245879632

            Çıktı : > İsim : G****** G***
                    > CCN : **** **** 9632
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        isim =(isim.substring(0,1).toUpperCase()) +
                (isim.substring(1).replaceAll("\\w","*"));

        soyisim=(soyisim.substring(0,1).toUpperCase()) +
                (soyisim.substring(1).replaceAll("\\w","*"));

        System.out.println("Lutfen kredi kartı numaranizi giriniz");

        String kartNo = scanner.nextLine(); //  int kartNo yazmiştim calismadi

        if (kartNo.length() < 16) {
            System.out.println("Geçersiz kredi kartı numarası");
        } else {
            kartNo=kartNo.substring(0,kartNo.length()-4).replaceAll("\\w","*") +
            kartNo.substring(12);
            //kartNo.length()-4 kisminda kartNo'yu unuttum

            System.out.println("İsim soyisim :" + isim +  " "   + soyisim );
            System.out.println("CCN :" + kartNo);
        }

    } // main method sonu
} // class sonu
