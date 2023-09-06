package day17_methodOlusturma_methodOverloading;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // 1'den 100'e kadar olan sayilari (sinirlar dahil)
        // for loop ile hesaplayin

        int toplam=0;

        for (int i = 1; i <= 100 ; i++) {

            toplam+=i;

        }
        System.out.println("for Loop ile toplam:" + toplam); // 5050

        toplam = 0;
        int i= 1;

        while (i<=100){

            toplam += i ;

            i++; // bunu unutma
        }

        System.out.println("while loop ile toplam : " + toplam); // while loop ile toplam : 5050

    } // main method sonu

}  // class body'nin sonu
