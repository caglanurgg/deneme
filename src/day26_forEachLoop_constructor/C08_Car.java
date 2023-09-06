package day26_forEachLoop_constructor;

public class C08_Car {


    public String toString() {
        return "Araba bilgileri ==> " +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                ", renk:'" + renk + '\'' ;
    }

    /*
        bir constructor calisirken hicbir ozelligi soylemiyorsa yani hicbir parametresi yoksa
        o zaman class'ta ne varsa ona sahip olur.
        class'taki hali neyse oyle bir objeye sahip olur
         */
    String marka = "Marka belirtilmemis";
    String model="Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk="Renk belirtilmemis";


}
