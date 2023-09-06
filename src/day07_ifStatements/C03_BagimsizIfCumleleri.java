package day07_ifStatements;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_BagimsizIfCumleleri {
    public static void main(String[] args) {

        //Soru 1-Kullanicidan bir pozitif tam sayi isteyin,
        //       sayiyi kontrol edip 5 ile bolunebiliyorsa "Sayi 5'in tam kati" yazdirin


        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi % 5 == 0) System.out.println("Sayi 5'in tam kati");






    }
}
