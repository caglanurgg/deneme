package day35_inheritance;

public class DHastane {


    DHastane(){ // 5.adım
        // burda extends keyword olmadigi icin artık calisabiliriz diyecek
        System.out.println("Parametresiz hastane constructor'i calisti"); // 6.adım
    } // 7 .adım

    DHastane(String a){
        System.out.println("String Parametreli hastane constructor'i calisti");
    }

    DHastane(int a){
        System.out.println("int Parametreli hastane constructor'i calisti");
    }
}
