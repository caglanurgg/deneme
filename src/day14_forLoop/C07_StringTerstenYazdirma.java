package day14_forLoop;

import java.util.Scanner;

public class C07_StringTerstenYazdirma {
    public static void main(String[] args) {

        //Soru 9(interview)- Kullanicidan bir String isteyin ve String'i tersten yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen tersten yazdirmak istediginiz metni giriniz");
        String str= scanner.nextLine();

        // Java Candir

        // ridnaC avaJ

        /*
        str.lenght()-1 olmasinin nedeni baslangic index'inin 0'dan baslamasi
        strşng değerlerin indexi sıfırdan başlar fakat string değerin uzunluğu bulan length ile
        kelimenin uzunluğu sıfırdan başladığı için eksi 1 diyerek length i index değeri ile
        aynı hale getiriyoruz
         */

        for (int i = str.length() -1 ; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println("");

        String tersMetin = " ";  // baslangic hiclik olsun
        for (int i = str.length()-1; i >=0 ; i--) {
            tersMetin +=str.charAt(i);
        }

        /*
        Ters Metin = " " + r = "r"
                     "r" + "i" ="ri"
                     "ri" + "d" = "rid"

         */

        // ters cevirilmis halini kaydedelim
        System.out.println("Terse cevrilen metin :" + tersMetin);


    }
}
