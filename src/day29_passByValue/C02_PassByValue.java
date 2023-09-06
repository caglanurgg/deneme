package day29_passByValue;

public class C02_PassByValue {
    public static void main(String[] args) {

        int sayi = 10;

        // int sayi = 20; Variable 'sayi' is already defined in the scope
        // String sayi = "40"; Variable 'sayi' is already defined in the scope
        //javada bir scope'da ayni isimle ikinci bir variable olusturmaniza izin vermez

        System.out.println(sayi);
        method1(5);
        method2(7);

    } // main method disi

    public static void method1(int sayi){ // buradaki sayi method1'in

        System.out.println("Method1 deki sayi : "+sayi);
        sayi = 20;
        System.out.println("Method1 de degistirilen sayi : "+sayi);
    }
    public static void method2 (int suha){

        System.out.println("method 2'deki suha ismindeki sayi : " + suha);
        // System.out.println(sayi);
    }



}
