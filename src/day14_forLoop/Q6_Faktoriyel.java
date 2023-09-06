package day14_forLoop;

import java.util.Scanner;

public class Q6_Faktoriyel {
    public static void main(String[] args) {

        // Soru 6-Kullanicidan 20'den kucuk bir sayi alip,bu sayinin faktoriyel degerini hesaplayin.
        //        Konsolda faktoriyel hesabinin yapilisini da yazdirin.
        //        Or. 6!=6*5*4*3*2*1 = 720

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

      int carpim = 1;

        for (int i = 1; i <= sayi; i++) {

            carpim *= i;
        }
        System.out.println("girilen sayi olan:" + sayi+"! =" + carpim );

    }
}



