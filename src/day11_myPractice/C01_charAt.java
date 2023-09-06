package day11_myPractice;

public class C01_charAt {
    public static void main(String[] args) {

        String str="Java Candir";

        // ilk harfini yazdirin
        System.out.println(str.charAt(0)); // J

        // 7.harfi yazdirin
        System.out.println(str.charAt(6)); // a

        // Bu metnin uzunlugu 11
        // son harfi yazdirin
        System.out.println(str.charAt(11-1)); // r

        // sondan 3.harfi yazdirin
        System.out.println(str.charAt(11-3));  // d

        // eger sondan basa dogru gidecek sekilde bir char isteniyorsa
        // charAt(uzunluk - sondanKacinciKarakter)


        // Metnin  uzunlugundan daha buyuk bir siradaki karakter istenirse
        // 20.karakteri yazdirin
        // System.out.println(str.charAt(20)); //StringIndexOutOfBoundsException (String'deki index sinirlarin disinda)

        // 4.harfi buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(3)); // A

        /*
         charAt()'u bize char data turunde bir sonuc verir (döndürür)
        toUpperCase() gibi method'lar String variable'lar ile calistigindan
        charAt() calistiktan sonra String Manipulation YAPİLAMAZ
        eger manipulation ihtiyaci varsa, charAt() kullanilmadan once yapilmalidir
         */

    }
}