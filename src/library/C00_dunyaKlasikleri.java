package library;

import java.util.HashMap;
import java.util.Map;

public class C00_dunyaKlasikleri {
    private String ad;
    private String yazar;

    public C00_dunyaKlasikleri(String ad, String yazar) {
        this.ad = ad;
        this.yazar = yazar;
    }

    public void tanit() {
        System.out.println("Ad: " + ad);
        System.out.println("Yazar: " + yazar);
    }
}


