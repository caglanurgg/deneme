package library;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MethodDeposu {

    public static Map<Integer,String> kitapMapOlustur(){

        Map<Integer,String> rusEdebiyati = new HashMap<>();

        rusEdebiyati.put(101,"Dostoyevski - Suc ve Ceza - roman ");
        rusEdebiyati.put(102, "Dostoyevski - Budala - roman ");

        rusEdebiyati.put(104, "Tolstoy - Savas ve Barıs - roman ");
        rusEdebiyati.put(105, "Tolstoy - Anna Karenina - roman ");
        rusEdebiyati.put(106 , "Tolstoy - Çocukluk, İlkgençlik ve Gençlik - roman ");

        rusEdebiyati.put(107, "Maksim Gorki- Ana - roman ");
        rusEdebiyati.put(108, "Maksim Gorki- Cocuklugum - roman ");
        rusEdebiyati.put(109, "Maksim Gorki- Barabanlar - roman ");


        return rusEdebiyati;

    }

    public static void isimSoyisimListesiYazdir(Map<Integer,String> kitapMap){

        Collection<String> valueCollection = kitapMap.values();
        System.out.println("Sira No Yazar KitapAdi KitapTuru");
        System.out.println("=======================");
        int siraNo= 1;

        for (String eachValue: valueCollection  // "Ali-Can-11-H-MF"
        ) {

            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
            System.out.println(siraNo+" -   "+valueArr[0] + " " + valueArr[1]);
            siraNo++;
        }
    }

}
