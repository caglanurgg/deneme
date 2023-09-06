package day08_IfElseIfStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {

    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin
        //Sayi 3'e bolunebiliyorsa 3'un kati
        //Sayi 5'e bolunebiliyorsa 5'in kati
        // ikisine birden bolunuyorsa super sayi yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        if(girilenSayi % 3 ==  0 && girilenSayi % 5 == 0) {
            System.out.println("super sayi");
        } else if (girilenSayi % 3 ==  0) {
            System.out.println("3'un kati");
        } else if(girilenSayi % 5 ==  0)  {
            System.out.println("5'in kati");
        }


    }
}
