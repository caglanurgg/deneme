package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C02_GirilenSayilariToplama {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // girilen sayilarin toplami 500'u gecerse
        // bu kadar sayi yeter, girilen sayilarin toplami .... oldu yazdirin
        // girilen sayi adedi 10 veya daha yuksek olursa
        // 10'dan fazla sayi giremezsin, girilen sayilarin toplami .... oldu yazdirin
        // ve islemi bitirin

        Scanner scanner; //  deger atamiyorum while'in icinde atayacagım
        int sayac= 0;
        int toplam= 0;
        int sayi;

        while(sayac <= 10 && toplam < 500 ) { // while loop'un ici true oldukca calismaya devam edecek

            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere sayi girin");
            sayi = scanner.nextInt();

            toplam +=sayi;
            sayac ++;
        /*
        && operatorunu kullanma nedenimiz f && t  durumunda false verir ve loop biter
        bu ihtimali de düsünmemiz gerekiyor
         */
        }

        // while  loop bitti ise sartlardan biri saglanmadi

        if (sayac >= 10) {
            System.out.println("10'dan fazla sayi giremezsin,girilen sayilarin toplami " + toplam +" oldu");
        }
        if (toplam > 500) {
            System.out.println("bu kadar sayi yeter,girilen sayilarin toplami " + toplam + " oldu");
        }


    } // main method sonu
}  // class body'nin sonu
