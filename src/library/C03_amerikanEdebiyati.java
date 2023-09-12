package library;

public class C03_amerikanEdebiyati extends C00_dunyaKlasikleri {

    public C03_amerikanEdebiyati(String ad, String yazar) {
        super(ad, yazar);
    }


    @Override
    public void tanit() {
        super.tanit();
        System.out.println("Edebiyat Türü: Amerikan Edebiyatı");
    }
}



