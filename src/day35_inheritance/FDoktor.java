package day35_inheritance;

public class FDoktor extends EMuhasebe {

    FDoktor(){
        super(3);  // gorunur bir constructor call var
        System.out.println("Parametresiz Doktor constructor'i calisti");
    }

    FDoktor(String str){
        // 3.adım calistirmadan once bu classta extends keyword oldugu icin kontrol edecek.
        // gorunur olarak cons.call yok o zaman gorunmeyen super(); vardir
        // parents class'a git parametresiz constructor'ı bul
        System.out.println("String Parametreli Doktor constructor'i calisti");
    }

    FDoktor(int sayi){
        this();
        System.out.println("Int Parametreli Doktor constructor'i calisti");
    }


    public static void main(String[] args) { // 1. adım

        FDoktor doktor1 = new FDoktor("Java"); // 2.adım

        FDoktor doktor2 = new FDoktor();

        FDoktor doktor3 = new FDoktor(5);

    } // main method sonu

}
