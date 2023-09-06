package day23_multiDimensionalArrays;

public class C03_ArraydekiEnBuyukEnKucukSayilariyazdirma {
    public static void main(String[] args) {

        // verilen 2 katli int bir array'deki
        // en buyuk ve en kucuk sayiyi bulup YAZDİRAN  bir method olusturun

        int[][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,34}};

        enBuyukEnKucukYazdir(arr);

    } // main method sonu

    public static void  enBuyukEnKucukYazdir (int [][]arr) {

        int enKucukSayi = arr[0][0];
        int enBuyukSayi = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                // arr[i][j]

                if (arr[i][j] < enKucukSayi) {
                    enKucukSayi = arr[i][j];
                }

                if (arr[i][j] > enBuyukSayi) {
                    enBuyukSayi = arr[i][j];
                }
            }
        }
        System.out.println("En kucuk sayi : " + enKucukSayi); // En kucuk sayi : 1

        System.out.println("En buyuk sayi : " + enBuyukSayi); // En buyuk sayi : 34
    }



}  // class body'nin sonu
