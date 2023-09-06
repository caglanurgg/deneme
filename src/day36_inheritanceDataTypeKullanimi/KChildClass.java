package day36_inheritanceDataTypeKullanimi;

public class KChildClass extends JParentClass{

    public void method1(){
        System.out.println("Child class method1");
    }

    @Override // JParent class'indaki method2'yi silersem altı kırmızı olur
    public void method2() {
        super.method2(); // EGER her iki method'u birden calistirmak istersek
                         //child class'daki overriding method'a super.method2(); ekleyebiliriz
    }


    /*

    @Override notasyonu overriden method ile overriding method'u birbirine baglar
    eger overriden method silinirse CTE verir.

    Kullanmak zorunda degiliz
    ama iki method'u bagimli yapmak istiyorsak kullanilabilir

    overriding method varken
    overridden method calismaz

    EGER her iki method'u birden calistirmak istersek
    child class'daki overriding method'a
    super.method2(); ekleyebiliriz
     */
}
