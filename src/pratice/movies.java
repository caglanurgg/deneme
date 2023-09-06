package pratice;

import java.util.Scanner;

public class movies {

    /*

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("wise sinema ya hoş geldiniz\n"+
                "lütfen izlemek istediğiniz filmi seçiniz\n"+
                "\t\t1.hızlı ve öfkeli\n" +
                "\t\t2.spiderman 3\n" +
                "\t\t3.evde tek başına\n" +
                "\t\t4.görevimiz tehlike\n" +
                "\t\t5.mario");
        int film=scan.nextInt();
        if(film==1){
            System.out.println("bilet sayısı?");
            int bilet= scan.nextInt();
            System.out.println("seans seçiniz\n"+
                    "saat 12.00\n" +
                    "saat 14.00\n" +
                    "saat 19.00\n");
            double saat =scan.nextDouble();
            System.out.println("kotluk no giriniz");
            int koltuk= scan.nextInt();
            System.out.println("mısır ve içecek seçimi\n" +
                    "1.büyük boy" +
                    "2.orta boy" +
                    "3.küçük boy");
            int mısır= scan.nextInt();
            System.out.println("rezarvasyonunuz tamamlanmıştır" +
                    "film =hızlı ve öfekeli\n" +
                    "bilet sayısı :"+bilet+
                    "\n seans saati :"+saat+
                    "\n koltuk no :"+koltuk+
                    "\n mısır ve içecek boyut no"+mısır+
                    "\n bizi tercih ettiğiniz için teşekkür ederiz");

        } else if (film==2) {
            System.out.println("bilet sayısı?");
            int bilet= scan.nextInt();
            System.out.println("seans seçiniz\n"+
                    "saat 12.00\n" +
                    "saat 14.00\n" +
                    "saat 19.00\n");
            double saat =scan.nextDouble();
            System.out.println("kotluk no giriniz");
            int koltuk= scan.nextInt();
            System.out.println("mısır ve içecek seçimi\n" +
                    "1.büyük boy" +
                    "2.orta boy" +
                    "3.küçük boy");
            int mısır= scan.nextInt();
            System.out.println("rezarvasyonunuz tamamlanmıştır" +
                    "film =spiderman 3\n" +
                    "bilet sayısı :"+bilet+
                    "\n seans saati :"+saat+
                    "\n koltuk no :"+koltuk+
                    "\n mısır ve içecek boyut no"+mısır+
                    "\n bizi tercih ettiğiniz için teşekkür ederiz");
        }else if (film==3) {
            System.out.println("bilet sayısı?");
            int bilet= scan.nextInt();
            System.out.println("seans seçiniz\n"+
                    "saat 12.00\n" +
                    "saat 14.00\n" +
                    "saat 19.00\n");
            double saat =scan.nextDouble();
            System.out.println("kotluk no giriniz");
            int koltuk= scan.nextInt();
            System.out.println("mısır ve içecek seçimi\n" +
                    "1.büyük boy" +
                    "2.orta boy" +
                    "3.küçük boy");
            int mısır= scan.nextInt();
            System.out.println("rezarvasyonunuz tamamlanmıştır" +
                    "film =evde tek başına\n" +
                    "bilet sayısı :"+bilet+
                    "\n seans saati :"+saat+
                    "\n koltuk no :"+koltuk+
                    "\n mısır ve içecek boyut no"+mısır+
                    "\n bizi tercih ettiğiniz için teşekkür ederiz");
        }else if (film==4) {
            System.out.println("bilet sayısı?");
            int bilet= scan.nextInt();
            System.out.println("seans seçiniz\n"+
                    "saat 12.00\n" +
                    "saat 14.00\n" +
                    "saat 19.00\n");
            double saat =scan.nextDouble();
            System.out.println("kotluk no giriniz");
            int koltuk= scan.nextInt();
            System.out.println("mısır ve içecek seçimi\n" +
                    "1.büyük boy" +
                    "2.orta boy" +
                    "3.küçük boy");
            int mısır= scan.nextInt();
            System.out.println("rezarvasyonunuz tamamlanmıştır" +
                    "film =görevimiz tehlike\n" +
                    "bilet sayısı :"+bilet+
                    "\n seans saati :"+saat+
                    "\n koltuk no :"+koltuk+
                    "\n mısır ve içecek boyut no"+mısır+
                    "\n bizi tercih ettiğiniz için teşekkür ederiz");
        }else if (film==5) {
            System.out.println("bilet sayısı?");
            int bilet= scan.nextInt();
            System.out.println("seans seçiniz\n"+
                    "saat 12.00\n" +
                    "saat 14.00\n" +
                    "saat 19.00\n");
            double saat =scan.nextDouble();
            System.out.println("kotluk no giriniz");
            int koltuk= scan.nextInt();
            System.out.println("mısır ve içecek seçimi\n" +
                    "1.büyük boy" +
                    "2.orta boy" +
                    "3.küçük boy");
            int mısır= scan.nextInt();
            System.out.println("rezarvasyonunuz tamamlanmıştır" +
                    "film =mario\n" +
                    "bilet sayısı :"+bilet+
                    "\n seans saati :"+saat+
                    "\n koltuk no :"+koltuk+
                    "\n mısır ve içecek boyut no"+mısır+
                    "\n bizi tercih ettiğiniz için teşekkür ederiz");
        }else {
            System.out.println("yalnış sayı girdiniz");
        }


    }
}


