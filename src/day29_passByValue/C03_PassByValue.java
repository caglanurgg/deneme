package day29_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        int sayi = 10;

            /*
            verilen sayiyi asagidaki kriterlere gore degistiren
            bir method olusturun
            - eger sayi cift ise 2 katina cikarin
            - eger sayi tek ise 5 ekleyin
             */

        System.out.println("method call'dan once sayi : " + sayi);
        // method call'dan once sayİ : 10

        sayi = sayiyiDegistir(sayi);

        System.out.println("metohd call'dan sonra sayi : " + sayi);
        // metohd call'dan sonra sayi : 20

        /*
        diger method'da yapilan degisiklik main method'da kalici hale getirilmis oldu
         */

    } // main method sonu
    public static int sayiyiDegistir (int sayi) {

        if (sayi %  2 == 0) {
            return 2*sayi;
        } else {
            return sayi+5;
        }
    }
}
