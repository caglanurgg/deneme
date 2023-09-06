package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan 2 rakam alin
        ilk rakami satir
        ikinci rakam sutun olmak uzere asagıdaki sekli cizdirin

        * * * * *
        * * * * *
        * * * * *
        * * * * *

         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Olusturulacak seklin satir sayisini giriniz");
        int satir= scanner.nextInt();

        System.out.println("Olusturulacak seklin sutun sayisini giriniz");
        int sutun= scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satirlari kontrol eder

            for (int j = 1; j <=sutun ; j++) { // sutunlari kontrol eder

                System.out.print("*  ");
            }
            System.out.println("");
        }



    }
}
