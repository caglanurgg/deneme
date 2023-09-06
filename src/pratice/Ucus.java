package pratice;

import java.util.Scanner;

public class Ucus {
    /*
  A şehrinden uçmak isteyen bir kişi B şehrine 500km
  C şehrine  700km  D şehrine  900 km mesafededir.
  km birim fiyati : 0.10$
  12 yasindan kucukse toplam fiyat %50 indirim
  12 ve 24 yas arasindaysa 10%
  65 yasindan buyukse 30%
  gidis donus alirsa 20%
  bu kosullara gore yolcudan gideceği mesafeyi isteyip
  ucak biletini hesaplayan program
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = "";
        boolean isValidCity = false;
        int flightType;
        boolean isValidFlightType = false;
        double discountMultiplier = 1.0;
        int age;
        boolean isValidAge = false;

        do {
            System.out.println("Java airlines'a hoş geldiniz!");
            System.out.print("(B | C | D) Lütfen uçmak istediğiniz şehri giriniz: ");
            city = scan.next().toLowerCase();

            if (city.equals("b") || city.equals("c") || city.equals("d")) {
                isValidCity = true;
            } else {
                System.out.println("Geçerli bir şehir giriniz.");
            }
        } while (!isValidCity); // isvalid deger true olunca dongüden cikti.

        System.out.println("Uçuşunuz için teşekkür ederiz! Şehir: " + city);

        do {
            System.out.print("Uçuşunuzun\nTek yönlü için '0', çift yönlü için '1' i tuşlayınız: ");
            flightType = scan.nextInt();

            if (flightType == 0 || flightType == 1) {
                isValidFlightType = true;
            } else {
                System.out.println("Geçerli bir uçuş tipi seçiniz.");
            }
        } while (!isValidFlightType);
        System.out.println("Uçuş Tipi: " + (flightType == 0 ? "Tek Yön" : "Çift Yön"));

        do {
            System.out.print("Lütfen yaşınızı giriniz: ");
            age = scan.nextInt();

            if (age <= 0) {
                System.out.println("Lütfen geçerli bir yaş giriniz! (Bebekler uçuşumuza kabul edilmez)");
            } else {
                isValidAge = true;

                if (age < 12) {
                    discountMultiplier = 0.5;
                } else if (age >= 12 && age <= 24) {
                    discountMultiplier = 0.9;
                } else if (age > 65) {
                    discountMultiplier = 0.7;
                }
            }
        } while (!isValidAge);

        double price = calculatePrice(city, flightType, discountMultiplier);
        System.out.println("Girdiğiniz bilgilere göre biletinizin tutarı: " + price + "$");
    }

    public static double calculatePrice(String city, int flightType,  double discountMultiplier) {
        double basePrice = 0;

        if (city.equals("b")) {
            basePrice = 0.10 * 500;
        } else if (city.equals("c")) {
            basePrice = 0.10 * 700;
        } else if (city.equals("d")) {
            basePrice = 0.10 * 900;
        }


        double totalPrice=0;

        if (flightType == 1) {
            totalPrice = (basePrice * discountMultiplier) * 0.8;
        } else if (flightType == 0) {
            totalPrice = basePrice * discountMultiplier;
        }


        return totalPrice;
    }
}
