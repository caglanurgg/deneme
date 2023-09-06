package day07_ifStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
        Bagimsiz if cumleleri
        isminden de anlaşilacagi uzere
         kodun kalani ile ilgilenmez

         sadece boolean sarta odaklanir
         sartin sonucu true ise if body'si calisir
         boolean sartin sonucu false ise
         if body'si devreye girmez

         yani

          birden fazla bagimsiz if cumlesi olan bir kod calistiginda
          kac tane if body'sinin calisacagi verilen degerlere baglidir

          tum if bodyleri calisabilir
          bazilari calisabilir
          ya da hicbir if body'si calismayabilir

         */

        int a =  20 ;
        int b = 30 ;

        if(a>0){  // true
            System.out.println("a sayisi pozitif");
        }

        if(a+b>100){  // false
            System.out.println("sayilarin toplami 100'den buyuk");
        }

    if (b % 3 == 0) {  // true
        System.out.println("b 3 ile tam bolunebilen bir tamsayidir");
    }

    if (b<100){ // true
        System.out.println("b 100'den kucuk bir tamsayidir");
    }



    }
}
