package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

    public class C06_EntrySetUpdate {

        public static void main(String[] args) {

            Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();
            System.out.println(ogrenciMap);
            /*
            {101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-K-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Cem-11-M-TM,
            106=Sevgi-Can-10-K-MF}
             */

            // Subesi H olan ogrencilerin subesini T yapin

            Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();
            // ben bir Set olusturdum.Set'im Entry'den olusuyor.
            // O Entry'lerde Integer ve String'lerden olusuyor.

            for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti
            ) {

                String value= eachEntry.getValue();
                String[] valueArr = value.split("-");

                if (valueArr[3].equalsIgnoreCase("H")){ // subesi H olanlar T olacak
                    valueArr[3] = "T";
                }

                // array'i update ettik, ortaligi toplayalim
                String yeniValue= valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

                eachEntry.setValue(yeniValue);
            }

            System.out.println(ogrenciMap);
            /*
            {101=Ali-Can-11-T-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-K-TM,
            104=Ayse-Can-10-T-MF,
            105=Sevgi-Cem-11-M-TM,
            106=Sevgi-Can-10-K-MF}
            */
        }
    }

