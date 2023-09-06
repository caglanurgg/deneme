package pratice;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
    /*
    2. SORU
    Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
    Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar
    tarafından kullanılmış olan şifreleme tekniğidir.
    Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
    Düz metindeki her harfin, alfabeden belirli bir sayı ileride
    konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
    // aaa ---> ddd --->3 birim kaydırılmış hali
    //java ----> kbwb --->1 birim kaydırılmış hali

    */

        Scanner scanner=  new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen kaydirmak istediginiz miktari giriniz");
        int kaydirmaMiktari = scanner.nextInt();

        String sifreliMetin = sezarSifreleme(metin, kaydirmaMiktari);
        System.out.println("Şifreli metin: " + sifreliMetin);


            } // main method sonu

    public static String sezarSifreleme (String metin , int kaydirmaMiktari) {

        String sifreliMetin = ""; // bos bir deger atadim ki sonradan olusturulan  degerleri ona atayabileyim


        for (int i = 0; i < metin.length(); i++) {
            char sifreKarakter = metin.charAt(i);
            // tum karakterleri 0'dan baslayarak her seferinde sifreli karakter degerine atiyor

            if (Character.isLetter(sifreKarakter)) { // harf mi diye kontrol ediyoruz
                char baslangic = Character.isUpperCase(sifreKarakter) ? 'B' : 'b'; // burasi da if else yapisi
                sifreKarakter = (char) ((sifreKarakter - baslangic + kaydirmaMiktari) % 26 + baslangic);

                /*
                 Diyelim ki karakter değişkeni 'a' harfini temsil ediyor ve kaydirmaMiktari değişkeni 3.

                1. Başlangıçta: karakter = 'a', baslangic = 'a', kaydirmaMiktari = 3.

                2. İşlem adımları:

                 karakter - baslangic : 'a' - 'a' = 0
                 karakter - baslangic + kaydirmaMiktari: 0 + 3 = 3
                 karakter - baslangic + kaydirmaMiktari) % 26: 3 % 26 = 3
                 (karakter - baslangic + kaydirmaMiktari) % 26 + baslangic: 3 + 'a' = 'd'

                 3. Sonuç: karakter şimdi 'd' harfini temsil ediyor.
                 Yani 'a' harfi, Sezar Şifrelemesi ile 3 birim kaydırıldığında 'd' harfine dönüşüyor.
                 */

            }

            sifreliMetin += sifreKarakter; // Şifrelenmiş karakteri String olarak birleştirin
        }

        return sifreliMetin;


    }
    

    } // class body'nin sonu
