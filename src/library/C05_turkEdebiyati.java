package library;
    public class C05_turkEdebiyati extends C00_dunyaKlasikleri {
        public C05_turkEdebiyati(String ad, String yazar) {
            super(ad, yazar);
        }

        @Override
        public void tanit() {
            super.tanit();
            System.out.println("Edebiyat Türü: Türk Edebiyatı");
        }
    }



