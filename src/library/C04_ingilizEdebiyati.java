package library;
    public class C04_ingilizEdebiyati extends C00_dunyaKlasikleri {
        public C04_ingilizEdebiyati(String ad, String yazar) {
            super(ad, yazar);
        }

        @Override
        public void tanit() {
            super.tanit();
            System.out.println("Edebiyat Türü: İngiliz Edebiyatı");
        }

    /*
    yazarlar olarak
    Jane austen
    Charles Dickens
    George Orwell
     */
}
