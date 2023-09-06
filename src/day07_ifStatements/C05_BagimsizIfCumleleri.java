package day07_ifStatements;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //          ucgen eskenar ise "Eskenar ucgen" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /*
        Java'da 3'lu karsilastırmalar OLMAZ
        IKILI KARSİLASTİRMALAR YAPİP
        && veya // operatorleri ile birlestirmeliyiz
         */
        if (kenar1 == kenar2 && kenar1 == kenar3 ) {
            System.out.println("Eskenar ucgen");

        }

    }
}
