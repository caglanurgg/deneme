package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan satir  sayisi olarak bir rakam alin
        ve asagıdaki gibi bir sekil olusturun

        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *

        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz");
        int satir = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) { // satirlar icin

            for (int j = 1; j <= i ; j++) { // sutunlar icin
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
