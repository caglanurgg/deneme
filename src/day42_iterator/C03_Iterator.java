package day42_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

    public class C03_Iterator {
        public static void main(String[] args) {

            List<Integer> sayilar = new ArrayList<>();

            sayilar.add(5);
            sayilar.add(23);
            sayilar.add(2);
            sayilar.add(13);
            sayilar.add(1);

            // index KULLANMADAN tum elementleri 2 artirin

            ListIterator lit = sayilar.listIterator(); // ListIterator daha fazla method bulundurmakta

            System.out.println(sayilar); // [5, 23, 2, 13, 1]

            while (lit.hasNext()){

                Integer sayi = (Integer) lit.next();

                lit.set(sayi + 2); // eski degerin iki fazlasi
            }

            System.out.println(sayilar); // [7, 25, 4, 15, 3]

            // iterator KULLANARAK, listenin elementlerini sondan basa dogru yazdirin
        /*
           ** Iterator veya ListIterator ile calisirken
            Iterator'i en son nerede biraktik sorusu cok onemlidir **

            bu soru icin konusursak
            sayilari 2 artirmak icin biz tek tek ilerleyip
            iterator'i listenin sonuna goturduk
         */

            while(lit.hasPrevious()){  // senden once adam var mı'ya bakiyoruz

                Integer sayi = (Integer) lit.previous(); // bu satiri unutma
                System.out.print(sayi + " ");
            }

        }
    }

