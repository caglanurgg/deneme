package library;

public class C06_Main {

    public static void main(String[] args) {
        C02_rusEdebiyati rusEdebiyati1 = new C02_rusEdebiyati("Suç ve Ceza", "Dostoyevski");
        C02_rusEdebiyati rusEdebiyati2 = new C02_rusEdebiyati("Savaş ve Barış", "Tolstoy");

        C04_ingilizEdebiyati ingilizEdebiyati1 = new C04_ingilizEdebiyati("Hamlet", "William Shakespeare");
        C04_ingilizEdebiyati ingilizEdebiyati2 = new C04_ingilizEdebiyati("Oliver Twist", "Charles Dickens");


        C03_amerikanEdebiyati amerikanEdebiyati1 = new C03_amerikanEdebiyati("The Great Gatsby", "F. Scott Fitzgerald");
        C03_amerikanEdebiyati amerikanEdebiyati2 = new C03_amerikanEdebiyati("To Kill a Mockingbird", "Harper Lee");


        C05_turkEdebiyati turkEdebiyati1 = new C05_turkEdebiyati("İstanbul Hatırası", "Ahmet Ümit");
        C05_turkEdebiyati turkEdebiyati2 = new C05_turkEdebiyati("İnce Mehmed", "Yaşar Kemal");


        // Eserleri tanıtma
        rusEdebiyati1.tanit();
        rusEdebiyati2.tanit();

        ingilizEdebiyati1.tanit();
        ingilizEdebiyati2.tanit();

        amerikanEdebiyati1.tanit();
        amerikanEdebiyati2.tanit();

        turkEdebiyati1.tanit();
        turkEdebiyati2.tanit();


    }
}


