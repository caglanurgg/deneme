package day11_myPractice;

public class C04_Contains {
    public static void main(String[] args) {

       String str = "Java gun gectikce guzellesiyor";

       // str Java iceriyor mu?

        System.out.println(str.contains("Java")); // true

        System.out.println(str.contains("JAVA"));  // false

        // str a icerir mi?
        System.out.println(str.contains("a"));   // true




    }

}
