package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        //Soru 2- Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin
        //        input1 : "15.30 €" , input2 : "11.40€"
        //        output :  26.70 €

        Scanner sanner = new Scanner(System.in);
        System.out.println("Lutfen String fiyatlar giriniz");
        double fiyat1= sanner.nextDouble();
        double fiyat2= sanner.nextDouble();

        double toplamFiyat = fiyat1 + fiyat2;
        System.out.println(toplamFiyat );





    }
}
