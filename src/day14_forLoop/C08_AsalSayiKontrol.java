package day14_forLoop;

import java.util.Scanner;

public class C08_AsalSayiKontrol {
    public static void main(String[] args) {

        //Soru 11-  Kullanicidan pozitif bir tamsayi  isteyip,sayinin asal sayi
        //          olup olmadigini kontrol edin ve sonucu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen asal sayi kontrolu icin pozitif bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        boolean flag=true;

        for (int i = 2; i < girilenSayi ; i++) {

            if (girilenSayi %  i == 0 ) {
                System.out.println("asal sayi degil" );
                flag=false;
                break;
            }
        }

        if(flag){
            System.out.println("girilen sayi asal sayi");
        }




    }
}
