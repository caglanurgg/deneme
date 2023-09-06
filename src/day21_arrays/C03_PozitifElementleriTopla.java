package day21_arrays;

public class C03_PozitifElementleriTopla {
    public static void main(String[] args) {

        //Soru 2- Verilen bir array'deki
        //        pozitif tamsayilari toplayip SONUCU BİZE DONDUREN bir method yaziniz

        int [] arr ={-4,5,2,0,3}; // beklenen output : pozitif elementlerin toplami 10

        System.out.println((pozitifSayilariToplama(arr)));

    } // main method sonu

    public static int pozitifSayilariToplama (int [] arr) {

        int toplam =0; // burayi unutma

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] > 0)  {
                toplam += arr [i];

            }
        }
        return toplam;
    }
} // class body'nin sonu
