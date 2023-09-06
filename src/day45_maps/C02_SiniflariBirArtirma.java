package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

    public class C02_SiniflariBirArtirma {

        public static void main(String[] args) {

            // ogrenci map'inde yil sonu duzenlemesi yapalim
            // 9,10,11.siniftaki ogrencilerin siniflarini 1 artirin
            // 12.siniftaki ogrenciler icin sinif bilgisi olarak mezun yazin

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

            ogrenciMap = MethodDeposu.yilSonuSinifArtir(ogrenciMap);

            System.out.println(ogrenciMap);
            /*
            {101=Ali-Can-12-H-MF,
            102=Veli-Cem-11-K-TM,
            103=Ali-Cem-12-K-TM,
            104=Ayse-Can-11-H-MF,
            105=Sevgi-Cem-12-M-TM,
            106=Sevgi-Can-11-K-MF}
             */


        }
    }

