package pratice;

public class Q39 {
    public static void main(String[] args) {
         /*
        Soru-39)
 Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların
 toplamını DÖNDÜREN BİR METHOD YAZIN ve ardından sonucu main methodda yazdırın.
        Örn:
        girdi : {1,2,3,4,5,6,7,8}
        çıkış: 36
 ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
    */

        int [] arr = {1,2,3,4,5,6,7,8} ;
        int sonuc=arrayParametre( arr) ;

        System.out.println("Cıkıs : " + sonuc);

    } // main method sonu

// Dizideki tüm elemanların toplamını hesaplayan method

    public static int arrayParametre (int [] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplam += arr[i]; // Her elemanı toplama ekle
            }
        }
        return toplam;
    }
        } // class body'nin sonu
