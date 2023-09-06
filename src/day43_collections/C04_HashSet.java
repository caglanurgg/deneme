package day43_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

    public class C04_HashSet {

        public static void main(String[] args) {
            //Soru :  Bir HashSet ve TreeSet olusturun.
            //        Bir loop ile bu set’lere element ekleyip SURELERİ karsilastirin.


            HashSet<Integer> hashSet = new HashSet<>();
            // Bir HashSet ve TreeSet olusturun.
            TreeSet<Integer> treeSet = new TreeSet<>();

            Random rnd = new Random(); // Random class'i

            // ONCE hashSet yaptik
            int hasBas = LocalTime.now().getNano(); // baslangic

            for (int i = 1; i <=100000 ; i++) {

                hashSet.add(rnd.nextInt(1000)); // 1000'e kadar sayi versin
            }
            int hasBit = LocalTime.now().getNano(); // bitis

            System.out.println("Hash set suresi : " +(hasBit-hasBas));
            //System.out.println(hashSet);

            ////***********////


            // SONRA treeSet yaptik
            int treeBas= LocalTime.now().getNano();
            for (int i = 1; i <=100000 ; i++) {

                treeSet.add(rnd.nextInt(1000));
            }
            int treeBit = LocalTime.now().getNano();
            System.out.println("Tree set suresi : " +(treeBit-treeBas));
            //System.out.println(treeSet);
        }
    }

    /*
    Hash teknigi girdi ne olursa olsun belirlenen yapidaki bir output uretme sistemidir.

örnek :
    9877 -> 2007 -> 1057 sayi ne olursa olsun birler basamagina gore siniflandir.

    1. alternatif 2037 yi 7.siradan tek tek aramak
    2. alternatif son 2 basamagina bakmak boylece 37.satira bakar
       2037 7.satirda degilse 37,satirdadir diyebilmek (hafizada bulmayi kolaylastirmak icin)

     **Hash Collision gerceklestiginde cozum icin 2 yol vardir
       A) LinkedList kullanmak
       B) Formulle belirlenen yeni bir hash kod uretmek

       HashSet;
       1- Hash mekanizmasindan dolayi hizlidir

       2-Set oldugu icin index yapisi yoktur,siralama yapmaz.Elementleri yazdirdigimizda
       herhangi bir sirada gelebilir.

       3-Set oldugu icin bir degeri birden fazla girmenize(dublication) izin vermez.
       Ayni elementi bir daha girerseniz eskisini silip ayni olan yeni degeri ekler.

       4-Element olarak null degeri kabul eder
       ancak set oldugu icin birden fazla null ekleyemezsiniz

       5-Index yapisini kullanmadigindan tum elementlere erismek icin for-each loop,
       degistirmek icin ise iterator kullanilabilir.


     */
