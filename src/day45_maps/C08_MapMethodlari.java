package day45_maps;

import java.util.HashMap;
import java.util.Map;

    public class C08_MapMethodlari {
        public static void main(String[] args) {

            Map<String,Integer> harfler = new HashMap<>();

            harfler.put("K",25);
            harfler.put("L",10);
            harfler.put("T",5);
            harfler.put("Z",50);
            harfler.put("A",15);

            System.out.println(harfler); // {A=15, T=5, Z=50, K=25, L=10}

            System.out.println(harfler.putIfAbsent("L", 30)); // 10
            //putIfAbsent yoksa ekle demek
            System.out.println(harfler); //{A=15, T=5, Z=50, K=25, L=10}

            // Q1) T'nin value'sunu 2 katina cikaralim

            // once T'nin var olan degerini almamiz lazim
            int value = harfler.get("T"); // 5

            harfler.put("T", 2*value);
            System.out.println(harfler); // {A=15, T=10, Z=50, K=25, L=10}

            // Q2) Z'nin degerini 20 artir

            harfler.compute("Z",(k,v)-> v+20); // compute hesapla
            System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=10}

            // Q3) L'nin degerini 3 katinin 5 fazlasi yapin

            harfler.compute("L", (a,b) -> 3*b +5 );
            // L a ve b den olusur (a = key ,b = value)  3*10+5
            System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=35}

            // Q4) map'de M yoksa degeri 50 olarak map'e ekleyin

            // harfler.putIfAbsent("M",50); bu da olur
            harfler.computeIfAbsent("M",v -> 50); // bu da olur

            System.out.println(harfler); // {A=15, T=10, Z=70, K=25, L=35, M=50}

            // Q5) T harfi varsa value'sunu bir artirin

            harfler.computeIfPresent("T" , (k,v) -> v+1);
            System.out.println(harfler); // {A=15, T=11, Z=70, K=25, L=35, M=50}
        }
    }
