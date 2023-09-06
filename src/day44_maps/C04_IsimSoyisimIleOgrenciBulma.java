package day44_maps;

import java.util.Map;

    public class C04_IsimSoyisimIleOgrenciBulma {

        public static void main(String[] args) {

            // ogrenci map'inde verilen isim ve soyisim'e sahip ogrencilerin
            // isim , soyisim, sinif ve subelerini yazdirin

            // ayni isimde 2 ogrenci olsaydi ikisini de yazacakti
            // ayni isimde 45 ogrenci olsaydi kırk besini de yazacakti


            Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

            MethodDeposu.isimSoyisimIleOgrenciBul(ogrenciMap,"ALI","CAN");
            //Ali Can 11 H




        }
    }

