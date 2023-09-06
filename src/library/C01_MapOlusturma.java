package library;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_MapOlusturma {

    //private static String rusEdebiyati;

    public static void main(String[] args) {

        Map<Integer,String> rusEdebiyati = new HashMap<>();

        rusEdebiyati.put(101,"Dostoyevski - Suc ve Ceza - roman ");
        rusEdebiyati.put(102, "Dostoyevski - Budala - roman ");

        rusEdebiyati.put(104, "Tolstoy - Savas ve Barıs - roman ");
        rusEdebiyati.put(105, "Tolstoy - Anna Karenina - roman ");
        rusEdebiyati.put(106 , "Tolstoy - Çocukluk, İlkgençlik ve Gençlik - roman ");

        rusEdebiyati.put(107, "Maksim Gorki- Ana - roman ");
        rusEdebiyati.put(108, "Maksim Gorki- Cocuklugum - roman ");
        rusEdebiyati.put(109, "Maksim Gorki- Barabanlar - roman ");

        System.out.println(rusEdebiyati);
       /*
        {101=Dostoyevski - Suc ve Ceza - roman ,
        102=Dostoyevski - Budala - roman ,
        103=Dostoyevski - Karamazov Kardeşler - roman ,** bu olmuyor
        104=Tolstoy - Savas ve Barıs - roman ,
        105=Tolstoy - Anna Karenina - roman ,
        106=Tolstoy - Çocukluk, İlkgençlik ve Gençlik - roman ,
        107=Maksim Gorki- Ana - roman ,
        108=Maksim Gorki- Cocuklugum - roman ,
        109=Maksim Gorki- Barabanlar - roman }
         */



       System.out.println(rusEdebiyati.keySet()); //[rusEdebiyati]


        System.out.println(rusEdebiyati.values()); // [Maksim Gorki- Barabanlar - roman ]
    }
}
