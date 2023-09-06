package day16_methodOlusturma_Kullanma;

public class C04_BaskaClasstanMethodKullanimi {

    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method", 1, 3);// et

        System.out.println(C03_MethodOlusturma.isimDuzenle("deniz", "CAN")); // Deniz Can

        String isimDuzenli = C03_MethodOlusturma.isimDuzenle("mustafa","kemal"); // kaydettim

        // duzenlenis ismin uzunlugunu yazdirin
        System.out.println(isimDuzenli.length()); // 13

         /*
        Void olan method'da sonucu KAYDEDEMEYIZ, sadece yazdiririz

        bize deger DÖNDÜREN method'da ise sonucu
        istersek direkt yazdirir, istersek de kaydederiz
       */

    } // main method sonu


} //  class sonu