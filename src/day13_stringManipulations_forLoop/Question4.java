package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // SORU 4-Kullanicidan  bir  sifre isteyip,asagidaki sartlari kontrol edin ve
        //       kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
        //       "sifre basariyla kaydedildi" yazdirin
        //       -ilk harf kucuk harf olmali
        //       -son karakter rakam olmali
        //       - sifre bosluk icermemeli
        //      - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();

        // flag yontemini kullanalim
        // flag'i basta true yapalim, her uygun olmayan durumda false degeri atayalim
        boolean flag = true;

        // sartlar birbirinden bagimsiz oldugundan bagimsiz  if cumleleri kullanalim

        //       -ilk harf kucuk harf olmali
        char ilkHarf =sifre.charAt(0);
        char sonKarakter=sifre.charAt(sifre.length()-1) ;

        if (!(ilkHarf>='a'&&  ilkHarf <='z')) {
            System.out.println("ilk karakter kucuk harf  olmali");
            flag = false; // onceden true olan flag degisti
        }

         if (!(sonKarakter>='0' &&  sonKarakter<='9')) {
             System.out.println("son karakter rakam olmali");
             flag = false;
         }

            //sifre bosluk icermemeli
         if (sifre.contains(" ")) {
                 System.out.println("sifre bosluk icermemeli");
                 flag = false;
             }

             //uzunlugu en az 10 karakter olmali
        if(!(sifre.length() >= 10)) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag = false;
        }

         if (flag){
            System.out.println("sifre basariyla kaydedildi");

        }

         /*
         not:
         flag'in olayı tum sartlarin saglandigini kontrol etmis oluruz
          */

        /*
        cozumu ders 13 videosunda izle
         */
    }
}









