package day44_maps;

import java.util.Map;

    public class C03_SinifListesi {

        public static void main(String[] args) {

            // ogrenci map'de sinif ve sube verdigimizde
            // o sinifta bulunan ogrenci isim ve soyisimlerini YAZDİRİN

            Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

            MethodDeposu.sinifSubedekiOgrenciListesiYazdir(ogrenciMap,11,"h");
            // 11.sinif h subesindeki ogrenci listesi
            // =================================
            // Ali Can
        }
    }

