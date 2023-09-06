package day15_nestedForLoop_MethodOlusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        int satir=5;
        int sutun=7;

        // dikdortgen bicimde, satir ve sutun numaralarini yazdiralim

        for (int i = 1; i <=satir ; i++) {  //satir

            for (int j = 1; j <=sutun; j++) {  //sutun

                System.out.print(i + ","  +j + "   ");
            }
            System.out.println(" ");
        }

        /*
        1,1   1,2   1,3   1,4   1,5   1,6   1,7
        2,1   2,2   2,3   2,4   2,5   2,6   2,7
        3,1   3,2   3,3   3,4   3,5   3,6   3,7
        4,1   4,2   4,3   4,4   4,5   4,6   4,7
        5,1   5,2   5,3   5,4   5,5   5,6   5,7
         */


        // ucgen icin satir ve  sutun numaralarini yazdiralim

        for (int i = 1; i <=satir ; i++) { // satir

            for (int j = 1; j <=i ; j++) {  // sutun

                System.out.print(i + "," + j + "   ");
            }
            System.out.println(" ");
        }

        /*
        1,1
        2,1   2,2
        3,1   3,2   3,3
        4,1   4,2   4,3   4,4
        5,1   5,2   5,3   5,4   5,5

         */
    }
}
