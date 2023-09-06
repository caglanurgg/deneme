package day13_stringManipulations_forLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        // SORU 5-Kullanicidan isim ve soyismini ayri ayri alin
        //       - ismi daha uzun ise,isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //       -soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk,
        //        soyismi buyuk harflerle yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz ");
        System.out.println("Lutfen soyisminizi giriniz");
        String isim= scanner.nextLine();
        String soyisim= scanner.nextLine();

        if (isim.length() > soyisim.length()) {
        //once ismin  hepsini kucuk harfle yazalim
                        isim=isim.toLowerCase();
                        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
                        System.out.println(isim);
        } else if (soyisim.length() > isim.length()) {
            // once ismin  hepsini kucuk harfle yazalim sonra ilk harfi buyuk gerisini kucuk harfle yazdiralim
            isim=isim.toLowerCase();
            isim =isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
            System.out.println(isim); //

            //soyismi buyuk harflerle yazdiralim
            soyisim =soyisim.toUpperCase();
            System.out.println(soyisim); //
        }





















    }
}
