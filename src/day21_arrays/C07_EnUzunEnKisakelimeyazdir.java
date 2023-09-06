package day21_arrays;

public class C07_EnUzunEnKisakelimeyazdir {
    public static void main(String[] args) {

        //Soru 6-Verilen bir array'deki
        //       en uzun ve en kisa kelimeleri YAZDİRAN bir method olusturun

        String [] isimler = {"Resul","Omer","Mehmet","Ertugrul"} ;

        enUzunEnKisakelimeyazdir(isimler);


    }   // main method sonu

    public static void enUzunEnKisakelimeyazdir (String [] isimler)  {

        String enKisaKelime = isimler[0]; //  sadece baslangic degeri olmasi icin atandi
        String enUzunKelime =isimler [0]; //  sadece baslangic degeri olmasi icin atandi

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].length() > enUzunKelime.length())  {
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime =isimler[i];
            }
        }
        System.out.println("En uzun isim : " + enUzunKelime); // En uzun isim : Ertugrul

        System.out.println("En kısa isim : " + enKisaKelime); //  En kısa isim : Omer
    }
} // class body'nin sonu
