package day26_forEachLoop_constructor;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Java her gecen gun daha zevkli hale geliyor";
        String harf = "a";

        String [] cumleArr = cumle.split("");

        int sayac = 0;

        for (String each : cumleArr
             ) {

            if (each.equals(harf)) { // bana getirdigi element istedigimiz harfe esitse o zaman sayacı 1 arttirdim
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Aradiginiz harf cumlede kullanilmamis");
        } else {
            System.out.println("Aradiginiz ' "+ harf + " ' harfi cumlede " + sayac + " kere kullanilmis. ");
            // Aradiginiz ' a ' harfi cumlede 5 kere kullanilmis.
        }






    } // main method sonu
} // class body'nin sonu
