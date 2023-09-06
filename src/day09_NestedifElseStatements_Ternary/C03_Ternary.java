package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tam sayi alin
        // sayinin tek mi cift mi oldugunu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi % 2 == 0) {
            System.out.println("girilen sayi cifttir");
        } else {
            System.out.println("girilen sayi tektir");
        }

       /*
       if else ile yapabilecegimiz
       basit islemleri
       daha kisa olarak yazabilmek icin ternary kullanilir
        */

        System.out.println(girilenSayi % 2 == 0 ? "cift sayi" : "tek sayi ");

        /*
        tenary' yi cok basit islemlerde tercih ederiz.
        tenary ile yapabildiğiniz tüm soruları if else ile yapabilirsiniz
        ama if else le yaptiginiz her seyi tenary ile yapamazsiniz

        */



    }
}
