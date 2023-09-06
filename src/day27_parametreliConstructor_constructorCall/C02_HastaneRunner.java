package day27_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {

        C01_Hastane personel1 = new C01_Hastane();
        /*
        bu satiri yazdiginizda Java der ki C01_Hastane class'indan bir tane obje olustur.
        C01_Hastane class'ina gider bu class'ta boyle bir constructor var mi diye kontrol eder.
        bu constructor'da varsa bir tane obje olusturur
         */

        System.out.println(personel1.personelIsmi); // isim atanmadi
        System.out.println(personel1.personelTelefonu); // tel atanmadi
        System.out.println(personel1.hastaneAdi); // Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu); // 03122456754

        personel1.personelTelefonu = "5552342323";
        personel1.personelIsmi = "Mertkan";


        C01_Hastane personel2 = new C01_Hastane(); // bu satirda obje olusturuluyor

        System.out.println(personel2.personelIsmi); // isim atanmadi
        System.out.println(personel2.personelTelefonu); // tel atanmadi
        /*
        hangi class'dan obje calistiriyorsaniz hangi class'dan obje olusturuyorsaniz
        hangi class'in constractor'i calisiyorsa o constractor kendi class'ındaki instance variable'larin
        birer kopyasini olusturur ve objeye yapistirir
         */

    }
}
