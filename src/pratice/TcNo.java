package pratice;

import java.util.Random;

public class TcNo { // İlk olarak, TcNo adında bir sınıf oluşturuyoruz.
                   // Bu sınıf içinde rastgele TC kimlik numaraları üreteceğiz.
   /*
TC kimlik numarasının son rakamı çift olmak zorundadır.
0 rakamı ile başlayamaz.
ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
Ayrıca; 1, 3, 5, 7 ve 9. index'teki rakamın toplamının 7 katı ile 2, 4, 6 ve 8. index'teki rakamın toplamının
9 katının toplamının birler basamağı 10. rakamı;
 1, 3, 5, 7 ve 9. rakamın toplamının
8 katının birler basamağı 11. rakamı vermektedir.
*/
    /*
   static Random rnd = new Random(); // rastgele sayılar üretmek için Random sınıfından bir nesne oluşturuyoruz.
   public static void main(String[] args) {
       tcNoUret();
   }

    private static void tcNoUret() {  // tcNoUret() Metodu Oluşturma
                                     // Bu metot, TC kimlik numarasını üretecek ve
                                    //  belirlediğiniz şartlara uygun olup olmadığını kontrol edecektir.

        int tcNo[] = new int[11];
        int tekToplam = 0, ciftToplam = 0, ilkOnToplam = 0;
       boolean kontrol = true;

       while (kontrol) { // kontrol true oldugu surece donecek
           tcNo[0] = rnd.nextInt(10) + 1; //TC kimlik numarasının ilk hanesini üretiyoruz.
                                                // Bu hane 1 ile 9 arasında bir değer almalıdır.

            for (int i = 1; i <= 8; i++) {
                tcNo[i] = rnd.nextInt(10);
                }

           for (int i = 0; i <= 8; i += 2) {
               tekToplam += tcNo[i];
            }
            for (int i = 1; i <= 7; i += 2) {
               ciftToplam += tcNo[i];
            }

            //1, 3, 5, 7 ve 9. index'teki rakamın toplamının 7 katı ile
           // 2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı
            tcNo[9] = ((tekToplam * 7) + (ciftToplam * 9)) % 10;
            // hesaplamayla, 10. hanenin değerini buluyoruz.


            for (int i = 0; i < 10; i++) {
               ilkOnToplam += tcNo[i]; // İlk 10 hanenin toplamını hesaplayarak ilkOnToplam adlı değişkende saklıyoruz.
          }
           if ((ilkOnToplam % 10) == (tekToplam * 8) % 10 && ilkOnToplam % 10 != 0 && ilkOnToplam % 2 == 0) {
               //Bu if koşulu, oluşturulan TC kimlik numarasının tüm kurallara uygun olup olmadığını kontrol eder.
               // Eğer uygunsa, döngüyü sonlandırır.
               kontrol = false;
           }
       }
        //son rakamı çift olmak zorundadır,0 ile baslayamaz,ilk 10 rakamın toplamının birler basamağı,
        // 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.

       tcNo[10] = ilkOnToplam % 10;
        for (int each : tcNo) {
        System.out.print(each);
       }
  }
*/

     static Random rnd = new Random();

    public static void main(String[] args) {
        tcNoUret();
    }

    private static void tcNoUret() {

        int tcNo[] = new int[11];
        int tekToplam = 0, ciftToplam = 0, ilkOnToplam = 0;
        boolean kontrol = true;
        while (kontrol) {
            tcNo[0] = rnd.nextInt(10) + 1;

            for (int i = 1; i <= 8; i++) {
                tcNo[i] = rnd.nextInt(10);
            }

            for (int i = 0; i <= 8; i += 2) {
                tekToplam += tcNo[i];
            }
            for (int i = 1; i <= 7; i += 2) {
                ciftToplam += tcNo[i];
            }

            //1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı
            tcNo[9] = ((tekToplam * 7) + (ciftToplam * 9)) % 10;

            for (int i = 0; i < 10; i++) {
                ilkOnToplam += tcNo[i];
            }
            if ((ilkOnToplam % 10) == (tekToplam * 8) % 10 && ilkOnToplam % 10 != 0 && ilkOnToplam % 2 == 0) {
                kontrol = false;
            }
        }
        //son rakamı çift olmak zorundadır,0 ile baslayamaz,ilk 10 rakamın toplamının birler basamağı,1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.

        tcNo[10] = ilkOnToplam % 10;
        for (int each : tcNo) {
            System.out.print(each);
        }
    }
}



