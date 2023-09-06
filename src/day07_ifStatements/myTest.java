package day07_ifStatements;

import java.util.Scanner;

public class myTest {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karenin 4 kenar uzunlugunu alin,
        //          kare ise "Kare" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Karenin kenar uzunluklarini giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();
        double kenar4= scanner.nextDouble();

        if(kenar1 == kenar2 && kenar2 == kenar3 && kenar2 == kenar4) {
            System.out.println("Kare");
        }
    }
}
