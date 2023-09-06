package day07_ifStatements;

import java.text.CharacterIterator;
import java.util.Scanner;
import java.util.stream.Collector;

public class C11_Question {
    public static void main(String[] args) {

        //Soru 5-Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin
        // yoksa girilen harfi yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenKarakter=scanner.next().charAt(0);

        if (Character.isLowerCase(girilenKarakter)) {
            girilenKarakter = Character.toUpperCase(girilenKarakter);
            System.out.println("Girilen harf büyük harfe dönüştürüldü: " + girilenKarakter);
        } else {
            System.out.println("Girilen harf zaten büyük harftir" + girilenKarakter);
        }

        /*
        Bu programda, kullanıcıdan bir harf girişi alınır
        ve Character.isLowerCase() yöntemi kullanılarak
        girilen karakterin küçük harf olup olmadığı kontrol edilir.
        Eğer girilen harf küçük harf ise Character.toUpperCase() yöntemi kullanılarak
        bu harf büyük harfe dönüştürülür ve sonuç ekrana yazdırılır.
        Eğer girilen harf zaten büyük harf ise sadece harf ekrana yazdırılır.
         */

    }
}
