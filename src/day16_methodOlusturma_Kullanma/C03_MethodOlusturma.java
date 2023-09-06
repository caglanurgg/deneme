package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {

    //Soru 2- Kullanicidan main method icinde  ayri ayri isim ve soyismini alin

    //        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    //        isim bosluk soyisim seklinde bize DONDUREN bir method olusturun
    //        input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isim giriniz"); // tek isim istiyoruz o yüzden line yok
        String isim = scanner.next();

        System.out.println("Lutfen soyisim giriniz"); // tek kelime
        String soyisim = scanner.next();

        System.out.println(isimDuzenle(isim,soyisim));
        // istersek direkt döndürdüğü sonucu yazdirabilir

        String duzenliIsim = isimDuzenle(isim,soyisim);
        // istersek de ilerde kullanmak uzere kaydedebiliriz


    } // main method sonu

    public static String isimDuzenle (String isim,String soyisim) {

        isim =isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase() +soyisim.substring(1).toLowerCase();

        String istenenFormattaIsimSoyisim = isim + " " + soyisim ;

        return istenenFormattaIsimSoyisim ;

    }

    /*
    bize bir sey donduren method'larda bu  String olur int olur hic onemli degil döndürdüğü seyi
    ya direkt yazdirirsiniz ya da kaydedersiniz
     */

} // class sonu
