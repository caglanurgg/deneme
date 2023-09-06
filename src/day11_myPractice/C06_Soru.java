package day11_myPractice;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        //SORU- Kullanicidam bir mail alin
        //     - mail @ icermiyorsa "gecersiz mail"
        //     -mail @gmail.com icermiyorsa "mail gmail olmali"
        //     -mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin


        /*
        icerir mi sorusu sorabilmek icin contains kullaniyoruz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("mailinizi giriniz");

        String mail = scanner.nextLine();

        if (!mail.contains("@")) {  // mail @ isaretini icermiyorsa
            System.out.println("gecersiz mail");

        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if (!mail.endsWith("@gmail.com"))  {
            System.out.println("mailde yazim hatasi var");






            /*
            not:

        "else" ifadesi ise, tüm önceki koşullar yanlış olduğunda
        veya hiçbir "else if" bloğu eşleşmediğinde çalışacak olan bir alternatif blok sağlar.
         Yani, "if" ve "else if" koşullarının hiçbiri doğru değilse, "else" bloğu çalıştırılır.

        Örnek
        int sayi = -3;

        if (sayi > 0) {
        System.out.println("Sayı pozitiftir.");
        } else {
        System.out.println("Sayı sıfır veya negatif.");
        }


        örnek
        int sayi = 5;

        if (sayi > 10) {
        System.out.println("Sayı 10'dan büyüktür.");
        } else if (sayi > 5) {
        System.out.println("Sayı 5'ten büyüktür.");
        } else if (sayi > 0) {
        System.out.println("Sayı pozitiftir.");
        } else {
        System.out.println("Sayı sıfırdır veya negatiftir.");
        }
         */


        }
    }
}