package day08_IfElseIfStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        // Soru 4-Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter= scanner.next().charAt(0);
        // Kullanici ne kadar uzun kelime ve kelimeler girse de ilk karakteri alir

        if (girilenKarakter >= 'A'&& girilenKarakter <=  'Z') {
            System.out.println("Girilen karakter buyuk harf");
        } else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

    }
}
