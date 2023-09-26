package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        //SORU 6- Kullanicidan alinan bir String alin,String'in uzunlugu cift sayi ise tam ortasina :)
        //        ekleyin
        //        String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();
        int uzunluk = metin.length();

        if (uzunluk % 2 == 0) {
            int ortaIndex = uzunluk / 2;
            String yeniString = metin.substring(0,ortaIndex) + " :)" + metin.substring(ortaIndex);
            System.out.println("Sonuc: " + yeniString);
        } else {
            int ortaIndex = uzunluk / 2;
            String yeniString = metin.substring(0, ortaIndex) + " :( " + metin.substring(ortaIndex + 1);
            System.out.println("Sonuc: " + yeniString);
        }

    }
}
