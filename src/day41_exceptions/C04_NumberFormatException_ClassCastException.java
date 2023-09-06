package day41_exceptions;

import java.util.Arrays;
    public class C04_NumberFormatException_ClassCastException {

        public static void main(String[] args) {

            String str = "java icin bulunan sonuc sayisi : 4567, listelenen sonuc sayisi : 25";

            // sonuc sayisinin 1000'den fazla oldugunu test edin

            String[] kelimeler = str.split(" ");
            // [java, icin, bulunan, sonuc, sayisi, :, 4567,, listelenen, sonuc, sayisi, :, 25]

            String sonucSayisiStr = kelimeler[6]; // "4567,"
            // int sonucSayisiInt = Integer.parseInt(sonucSayisiStr); // NumberFormatException
            // "4567," sonundaki virgulu sayiya cceviremedigi icin olmadi

            sonucSayisiStr = sonucSayisiStr.replaceAll("\\D","");
            // sayi olmayan her seyi yok et demis olduk
            int sonucSayisiInt = Integer.parseInt(sonucSayisiStr);

            System.out.println(sonucSayisiInt); // 4567

            String str2 = "Java";
            // Integer sayi = str2; java bunu kabul etmez ben senden Integer bekliyorum sen bana string veriyorsun

            Object obj = str2 ; // obje String'in parent'i oldugundan sorun cikmaz
            Integer sayi = (Integer) obj; // Integer object'nin child'i oldugu icin cast edilebilir
            // ClassCastException
            System.out.println(sayi);
        }
    }

