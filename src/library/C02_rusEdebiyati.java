package library;

import java.util.HashMap;
import java.util.Map;

public class C02_rusEdebiyati extends C00_dunyaKlasikleri {
    private Map<String, String> eserler;
    public C02_rusEdebiyati(String ad, String yazar) {
        super(ad, yazar);
        eserler = new HashMap<>();
}

    public void eserEkle(String yazar, String eserAdi) {
        eserler.put(yazar, eserAdi);
    }

    public void eserleriListele() {
        System.out.println("Rus Edebiyatı Eserleri:");
        for (Map.Entry<String, String> entry : eserler.entrySet()) {
            System.out.println("Yazar: " + entry.getKey() + ", Eser: " + entry.getValue());
        }
    }
}



/*
  @Override
    public void tanit() {
        super.tanit();
        System.out.println("Edebiyat Türü: Rus Edebiyatı");
    }
 */










    /*
     public static void main(String[] args) {
        // kitap map'înde bulunan kitaplari
        // isim ve soyisimlerini sira numarali bir liste olarak yazdirin

        Map<Integer, String> rusEdebiyati = MethodDeposu.kitapMapOlustur();
        rusEdebiyati.put(103, "Dostoyevski - Karamazov Kardeşler - roman ");

        // Duplicate Map key  = Yinelenen Harita anahtarı


        System.out.println(rusEdebiyati);
        /*
        {101=Dostoyevski - Suc ve Ceza - roman ,
        102=Dostoyevski - Budala - roman ,
        103=Dostoyevski - Karamazov Kardeşler - roman ,
        104=Tolstoy - Savas ve Barıs - roman ,
        105=Tolstoy - Anna Karenina - roman ,
        106=Tolstoy - Çocukluk, İlkgençlik ve Gençlik - roman ,
        107=Maksim Gorki- Ana - roman ,
        108=Maksim Gorki- Cocuklugum - roman ,
        109=Maksim Gorki- Barabanlar - roman }

     */














