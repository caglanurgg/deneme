package day11_stringManipulations;

public class C07_IndexOf {
    public static void main(String[] args) {

        String str="Ali topu at, at ali at";

        // Ali'nin index'i nedir 0
        System.out.println(str.indexOf("Ali"));

        // at'in index'i nedir? 9
        System.out.println(str.indexOf("at"));
        //satırı, "at" dizesinin ilk geçtiği indeksi bulur ve bu indeksi ekrana yazdırır


        // op'un index'i nedir? 5
        System.out.println(str.indexOf("op"));

        System.out.println(str.indexOf("a",10)); // 13
        //10.karakterden sonra "a" karakterini ilk bulduğu indeksi döndürür.


        System.out.println(str.indexOf("yusuf")); // -1
        //  Eğer sonuç -1 ise, aradığınız karakter veya dizeyi içermeyen bir durumla
        //  karşı karşıya olduğunuzu anlayabilirsiniz.




    }
}
