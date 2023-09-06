package day35_inheritance;

public class EMuhasebe extends DHastane{

    EMuhasebe(){  // 4.adım buraya gelecek
        // bu class'da da extends var
        // ilk satirda constructor call var mı diye kontrol edecek
        // olmadigi icinde super constructor call vardir diyecek
        System.out.println("Parametresiz Muhasebe constructor'i calisti");
    }

    EMuhasebe(String str){  // super constructor
        System.out.println("String Parametreli Muhasebe constructor'i calisti");
    }

    EMuhasebe(int a){
        this("Yusuf"); // gorunur bir conastructor var
        System.out.println("int Parametreli Muhasebe constructor'i calisti");
    }
}
