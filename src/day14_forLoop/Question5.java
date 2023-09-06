package day14_forLoop;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20'den kucuk sayi alip,bu sayinin faktoriyel degerini hesaplayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir sayi giriniz");
        int sayi= scanner.nextInt();

        int carpim =1;

        for (int i = 1; i <= sayi ; i++) {

            carpim *=i;
        }
        System.out.println("girilen sayi olan :" + sayi + "! =" + carpim);

    }
}
