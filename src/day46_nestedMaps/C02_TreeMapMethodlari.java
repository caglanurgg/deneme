package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

    public class C02_TreeMapMethodlari {

        public static void main(String[] args) {

            TreeMap<String,Integer> harfler = new TreeMap<>();
            //** data turunu parent classtan secerseniz bu parentin ortak olarak
            // butun child'larinda olan ozelliklerini gorursunuz.
            // ***11.satirda data turu TreeMap - constructor TreeMap oldugu icin
            // artik TreeMap'e ozel olan METHODLARI DA gorebilirsiniz.

            harfler.put("K",25);
            harfler.put("L",10);
            harfler.put("T",5);
            harfler.put("Z",50);
            harfler.put("A",15);
            // **** TreeMap siralidir.
            System.out.println(harfler); // {A=15, K=25, L=10, T=5, Z=50}

            // SIMDI TREE MAP'E OZEL METHODLARA BAKACAGIZ.

            System.out.println(harfler.tailMap("L")); // {L=10, T=5, Z=50} baslangic dahil
            System.out.println(harfler.tailMap("C")); // {K=25, L=10, T=5, Z=50}


            System.out.println(harfler.tailMap("L", false));  // {T=5, Z=50} L'yi dahil etmez
            System.out.println(harfler.tailMap("C",false));   // {K=25, L=10, T=5, Z=50}

            System.out.println(harfler.headMap("T")); // {A=15, K=25, L=10}
            System.out.println(harfler.headMap("M")); // {A=15, K=25, L=10}

            System.out.println(harfler.headMap("T",true)); // {A=15, K=25, L=10, T=5} T'den once
            System.out.println(harfler.headMap("M",true)); // {A=15, K=25, L=10}


            // {A=15, K=25, L=10, T=5, Z=50}
            System.out.println(harfler.ceilingKey("K")); // K buyuk esit
            System.out.println(harfler.ceilingKey("N")); // T
            System.out.println(harfler.ceilingKey("U")); // Z u'ya esit veya buyuk olani

            System.out.println(harfler.higherKey("K"));
            // L buyuk K'dan buyuk olanlar arasindaki en kucugu

            System.out.println(harfler.higherKey("N")); // T
            System.out.println(harfler.higherKey("U")); // Z

            System.out.println(harfler.ceilingEntry("K")); //  K=25
            System.out.println(harfler.higherEntry("K"));  //  L=10


            // {A=15, K=25, L=10, T=5, Z=50}

            System.out.println(harfler.floorKey("K")); // K  kucuk esit
            System.out.println(harfler.floorKey("M"));
            // L M'ye esit veya kucuk olanlar arasindaki en buyuk


            System.out.println(harfler.lowerKey("K"));
            // A kucuk K'dan kucuk olanlar arasindaki en buyuk olani
            System.out.println(harfler.lowerKey("M")); // L


            // {A=15, K=25, L=10, T=5, Z=50}
            System.out.println(harfler.pollFirstEntry()); // A=15 delil olarak getirdi
            System.out.println(harfler); // {K=25, L=10, T=5, Z=50}

            System.out.println(harfler.pollLastEntry()); // Z=50 delil olarak getirdi
            System.out.println(harfler); // {K=25, L=10, T=5}

            System.out.println(harfler.descendingKeySet()); // [T, L, K]
            System.out.println(harfler.descendingMap()); // {T=5, L=10, K=25}

            // harfler = harfler.descendingMap(); bu TreeMap olmaktan cikti

        }
    }

