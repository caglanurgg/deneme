package day14_forLoop;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        //Soru 10(interview)- Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin.

        Scanner  scanner =new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin= scanner.nextLine();

        for (int i =metin.length()-1 ; i >=0 ; i--) {
            System.out.print(metin.charAt(i));  //rolyat
        }

        System.out.println("");

        String tersMetin ="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);
        }

        System.out.println("Terse cevrilen metin :" + tersMetin); //Terse cevrilen metin :rolyat











    } // main method sonu
}
