package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakListOlusturma {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri bize LISTE OLARAK DONDURECEK
        //        bir method olusturun.

        System.out.println(listOlustur());

    } // main method sonu

    public static List<String> listOlustur() {

        Scanner scanner;
        String girilenIsim ;
        List<String> isimList =new ArrayList<>();

        do { // avantaji kullanicidan deger alarak yaptigimiz islemlerde
            // ilk deger atamasini kod yazan kisinin degil de kullanicinin yapmasi acisindan avantajli

            scanner=new Scanner(System.in);
            System.out.println("Listeye eklemek icin isim giriniz, \nBitirmek icin Q'ya basiniz");
            girilenIsim = scanner.nextLine();

            /*
            kullanicidan aldigim ismi hemen listeye ekleyecek miyim
            kullanici Q'ya basarsa bunu bir isim olarak eklemek icin degil bitirmek icin basmistir
             */

            if (!girilenIsim.equalsIgnoreCase("Q")) { // eger Q degilse listeye eklenecek
                isimList.add(girilenIsim);
            }

        } while (!girilenIsim.equalsIgnoreCase("q"));  // q'ya basilmadigi sürece devam et

        return isimList;


    }
} // class body'nin sonu
