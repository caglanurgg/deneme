package day07_ifStatements;

import java.util.Scanner;

public class C09_Question {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise "Emekli olabilirsin" yazdirin,
        //           yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");

    } else {
            System.out.println("yas - =65; == emekli olmasi icin calismasi gereken yil");
        }
    }
    }

