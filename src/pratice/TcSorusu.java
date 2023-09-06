package pratice;

import java.util.Random;

public class TcSorusu {
    /*
    TC kimlik numarasının son rakamı çift olmak zorundadır. 0 rakamı ile başlayamaz.
    ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
    Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile
    2, 4, 6 ve 8. rakamın toplamının 9 katının
    toplamının birler basamağı 10. rakamı;
    1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
     */

    static Random rnd = new Random();
    public static void main(String[] args) {

        int [] rakamlar = new int[11];

    } // main method sonu

    private static void tcNoUret() {

        int [] TcNo = new int[11]; // [0,0,0,0,0,0,0,0,0,0,0]
        int tekToplam = 0, ciftToplam = 0, ilkOnToplam = 0;
        boolean kontrol = true;

        while (kontrol) { // parantezin ici true ve calismaya devam ediyor

          TcNo [0] = rnd.nextInt(10) + 1; // 1-9 arası rastgele sayı

            for (int i = 1; i <= 8 ; i++) {

            }

//tcNo[0] = rnd.nextInt(1, 10)
        }
    }
 } // CLASS BODY'NIN SONU
