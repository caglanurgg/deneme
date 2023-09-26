package day13_stringManipulations_forLoop;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r.";

        str=str.replace("1","");

        System.out.println(str); //  Ja4va 8C9a2n5dir.

        /*
        target : hedef
        replacement : yenisiyle degistirme
        digit : hane,basamak
        */

        // sayilarin tamamini degistirmek istersek
        // replace() yeterli olmaz

        // java da sayilar,ozel karakterler,alfabetik karakterlerin
        // tumuyle islem yapmak isterseniz
        // replaceAll(istenenGrup,yeniDeger)

        // ornegin butun sayilarin yerine "" atamak icin

        str=str.replaceAll("\\d","");
        System.out.println(str); //Java Candir.

        /*
        regex : a regular expression(duzenli bir ifade)

        \\s : space                             \\S : space olmayan her sey
        \\s+ : yan yana birden fazla space      \\D : digit olmayan her sey
        \\d : digits                           \\W : harf,rakam veya _ olmayan her sey
        \\w: harf,rakam veya _
         */














    }
}
