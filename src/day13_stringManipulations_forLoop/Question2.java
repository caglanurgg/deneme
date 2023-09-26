package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicinin belirli bir formatta verdigi
        //        String fiyatlari toplayip yazdirin
        //        input1 : "15.30 €" , input2 : "11.40€"
        //        output :  26.70 €

        // Girdileri tanimlayin
        String input1 = "15.30 €";
        String input2 = "11.40€";

        // Girdilerdeki bosluklari kaldirin ve € isaretini temizleyin
        input1 = input1.replaceAll("\\s+", "").replaceAll("€", "");
        input2 = input2.replaceAll("\\s+", "").replaceAll("€", "");

        // String'i double'a donusturun
        double fiyat1 = Double.parseDouble(input1);
        double fiyat2 = Double.parseDouble(input2);

        // Fiyatları toplayin
        double toplamFiyat = fiyat1 + fiyat2;

        // Sonucu istenen formatta yazdirin
        System.out.println(String.format("%.2f €", toplamFiyat));

        /*
        String.format kullanarak sonucu bicimlendirir ve ardindan
        System.out.println ile ekrana yazar. %.2f ile bicimlendirme yapilir
         */
    }
}