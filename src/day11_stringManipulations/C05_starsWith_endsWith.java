package day11_stringManipulations;

public class C05_starsWith_endsWith {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        // str Java ile mi basliyor?
        System.out.println(str.startsWith("Java")); // true

        // str J ile mi basliyor?
        System.out.println(str.startsWith("J")); // true

        // str Ja ile mi basliyor?
        System.out.println(str.startsWith("Ja")); // true

        // str "Java cok guzel" ile mi basliyor?
        System.out.println(str.startsWith("Java cok guzel")); // true

        System.out.println(str.startsWith("")); // true

      // 5.indexten sonrasi c ile mi baslar?
        System.out.println(str.startsWith("c",5)); // true

        // 6.indexden sonrası ok ile mi baslar?
        System.out.println(str.startsWith("ok",6)); // true

        // "Java cok guzel";

        // str guzel ile mi bitiyor?
        System.out.println(str.startsWith("guzel")); // true

        // str el ile mi bitiyor?
        System.out.println(str.startsWith("el")); // true

        // str "" ile mi bitiyor?
        System.out.println(str.startsWith(""));  // true

        System.out.println(str.startsWith(" ")); // false


















    }













}
