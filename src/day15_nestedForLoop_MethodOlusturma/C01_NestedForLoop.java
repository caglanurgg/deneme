package day15_nestedForLoop_MethodOlusturma;

public class C01_NestedForLoop {
    public static void main(String[] args) {

        /*
        nested for döngüsü içe içe döngü demektir

        Asagidaki tabloyu konsolda yazdirin

        1 2 3 4
        2 4 6 8
        3 6 9 12

        eger yazilacak sekil dikdortgen bicimindeyse
        ic ice for loop ile yapabiliriz
         */

        for (int i = 1; i <= 4 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 1; i <= 4 ; i++) {
            System.out.print(i*2 + " ");
        }

        System.out.println("");

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*3 + " ");
        }

        System.out.println("=================");

        for (int j = 1; j <=3 ; j++) {

            for (int i = 1; i <= 4 ; i++) {
                System.out.print(i *j + "  ");
            }
            System.out.println("");
        }



    }
}
