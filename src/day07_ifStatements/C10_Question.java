package day07_ifStatements;

import java.util.Scanner;

public class C10_Question {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);

        /*
        Bu programda, Scanner sınıfı kullanılarak kullanıcıdan bir giriş alınır.
        Character.isUpperCase() yöntemi kullanılarak girilen karakterin
        büyük harf olup olmadığı kontrol edilir.
        Eğer girilen karakter büyük harf ise ilgili mesaj yazdırılır,
        aksi takdirde farklı bir mesaj yazdırılır.
         */

        if (Character.isUpperCase(karakter)) {
            System.out.println("Girilen karakter büyük harftir.");
        } else {
            System.out.println("Girilen karakter büyük harf değildir.");
        }
    }
}







