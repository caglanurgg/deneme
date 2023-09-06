package day42_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class C02_Iterator {

        public static void main(String[] args) {

            List<Integer> sayilar = new ArrayList<>();

            sayilar.add(5);
            sayilar.add(23);
            sayilar.add(2);
            sayilar.add(13);
            sayilar.add(1);

            // index kullanmadan 10'dan buyuk olan elementleri silin


            Iterator itr = sayilar.iterator();

            while (itr.hasNext()){ // itr.hasNext demek ey itr yaninda eleman var mi

                // true diye loop body'si calisti
                Integer sayi = (Integer) itr.next();
                if (sayi>10){
                    itr.remove();
                }
            } // basa gelecek ilk 5 sonra 23 sonra 2 sonra 13 sonra 1

            System.out.println(sayilar); // [5, 2, 1]


            sayilar = new ArrayList<>();

            sayilar.add(15);
            sayilar.add(23);
            sayilar.add(24);
            sayilar.add(13);
            sayilar.add(11);

            // ************************

            // for loop kullanarak 10'dan buyuk sayilari silin

            for (int i = 0; i < sayilar.size() ; i++){ // silindigi icin uzunlugu kisaliyor

                if (sayilar.get(i)>10){
                    sayilar.remove(i); // silindigi icin uzunlugu kisaliyor
                }
            }

            System.out.println(sayilar); // [23, 13]

        }
    }

