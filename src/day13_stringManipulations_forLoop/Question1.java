package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir cumle alin
        //        -cumlede ev geciyorsa,"home home sweet home"yazdirin
        //        -cumlede is geciyorsa,"calismak guzeldir"
        //        -ikisini de iceriyorsa"hem ev lazim hem is"
        //        -hicbirini icermiyorsa "cok calisman lazim" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        //once ikisini de icerip icermedigine bakalim
        if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("hem ev lazim hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calisman lazim");
        }


    }

}


