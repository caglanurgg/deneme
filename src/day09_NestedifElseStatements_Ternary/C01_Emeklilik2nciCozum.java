package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C01_Emeklilik2nciCozum {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin,
        //Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir
        // Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        // veya "Emekli olmak icin ... Yıl daha calisman gerekir" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E : Erkek ,  K : Kadin");
        char cinsiyet = scanner.next().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80) {
            System.out.println("Gecersiz yas");
        } else if (yas < 60) { // kimse emekli olamaz
            if (cinsiyet == 'K') {
                System.out.println("Kadin emekli olabilmesi icin daha " + (60 - yas) + " yil  calismali");

            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmesi icin daha " + (65 - yas) + " yil  calismali");

            } else {
                System.out.println("cinsiyet hatali");
            }

        } else if (yas < 65) { // sadece kadinlar emekli olabilir

            if (cinsiyet == 'K') {
                System.out.println("Kadin emekli olabilir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmesi icin daha" + (65 - yas) + "yil daha calismali");

            } else {
                System.out.println("cinsiyet hatali");
            }

        } else { // herkes emekli olabilir
            if (cinsiyet == 'K' || cinsiyet == 'E'){
            System.out.println("emekli olabilir ");
            } else {
                System.out.println("cinsiyet hatali");
            }
        }
    }
}





