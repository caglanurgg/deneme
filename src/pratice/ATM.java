package pratice;

import java.util.Scanner;

public class ATM {   // ATM adında bir sınıf tanımladık.
                      // Bu sınıf, banka işlemleri için gerekli bilgileri ve işlemleri yönetecek.
    /*
Kullanicidan giriş için kart numarasi ve şifresini isteyin,
eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
sifre değiştirme ve cikis islemleri olacaktır.

Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
eger değilse menü ekranina geri donsun.

Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra,
sifre değişiklik işlemini yapmali
     */

    //Sınıfın içinde cardNumber, password ve balance adında üyeler (fields) tanımladık. Bunlar, kullanıcı giriş bilgileri ve bakiye bilgisini tutacak.
    // kısmında ise constructor'ı tanımladık. Bu construct

    String kartNo="1212121212121212"; // 16 basamak
    String sifre;
    double bakiye;

    public  ATM () {  // kısmında ise constructor'ı tanımladık. Bu constructor,
                     // sınıf örneği oluşturulurken kullanıcıdan alınan giriş bilgilerini
                    // ve başlangıç bakiyesini alacak.
        Scanner scanner =new Scanner(System.in);
        baslangicDegerleri();
    }

    public void baslangicDegerleri () {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen kart numaranizi giriniz");
            int kartNo = scanner.nextInt();
            scanner.nextLine(); // Boşluğu okumak için

            System.out.println("lutfen sifrenizi giriniz");
            String sifre = scanner.nextLine();
            scanner.nextLine(); // Boşluğu okumak için

            if (girisiDogrula(kartNo, sifre )) {
                System.out.println("Giriş başarılı.\n");
                menuyuGoster();
                int girmeDenemesi = scanner.nextInt();
                scanner.nextLine();

                switch (girmeDenemesi) {
                    case 1:
                        bakiyeSorgula();
                        break;
                    case 2:
                        paraYatir();
                        break;
                    case 3:
                        paraCekme();
                        break;
                    case 4:
                        paraGonder();
                        break;
                    case 5:
                        sifreDegistir();
                        break;
                    case 6:
                        System.out.println("Çıkış yapılıyor...");
                        return;
                    default:
                        System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                }
            } else {
                System.out.println("Hatalı kart numarası veya şifre. Lütfen tekrar deneyin.");
            }
        }

    }

    private boolean girisiDogrula(int girilenKartNo, String girilenSifre) {
        return false;
    }

    private void menuyuGoster() {
        System.out.println("***** MENU *****");
        System.out.println("1. Bakiye Sorgula");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Para Çekme");
        System.out.println("4. Para Gönderme");
        System.out.println("5. Şifre Değiştirme");
        System.out.println("6. Çıkış");
        System.out.print("Yapmak istediğiniz işlemi seçin: ");
    }

    /*
    private erişim belirleyicisi, bir metodun sadece sınıf içinde erişilebilir olmasını sağlar
    ve dışarıdan erişimi sınırlar. Bu, encapsulation prensibine uygun bir yaklaşımdır ve
    sınıf içi detayların dışarıya sızmasını engeller.

    public erişim belirleyicisi, bir metodun her yerden erişilebilir olmasını sağlar.
    Ancak bu, metodun kullanımını daha dikkatli bir şekilde yönetmeyi gerektirir
     */

    private void bakiyeSorgula() {
        System.out.println("Mevcut Bakiye: " + bakiye + " TL");
    }

    private void paraYatir() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yatırmak istediğiniz miktarı girin: ");
        double paraYatirmaTutari = scanner.nextDouble();
        scanner.nextLine(); // Boşluğu okumak için
        bakiye += paraYatirmaTutari ; // Kullanıcıdan yatırılacak miktarı alır ve hesaba ekler.
        System.out.println( paraYatirmaTutari + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
    }

    private void paraCekme() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Çekmek istediğiniz miktarı girin: ");
        double paraCekmeTutari = scanner.nextDouble();
        scanner.nextLine();  // Boşluğu okumak için
        if (paraCekmeTutari > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } else {
            bakiye -= paraCekmeTutari;
            System.out.println(paraCekmeTutari + " TL çekildi. Yeni bakiye: " + bakiye + " TL");
        }
    }

    private void paraGonder () {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Göndermek istediğiniz IBAN'ı girin: ");
        String iban = scanner.nextLine();
        scanner.nextLine();  // Boşluğu okumak için

        if (iban.startsWith("TR") && iban.length() == 26) {
            System.out.println("Para gönderme işlemi başarılı!");
        }else {
            System.out.println("Geçersiz IBAN formatı. İşlem iptal edildi.");
        }
    }

    private void sifreDegistir () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mevcut sifrenizi giriniz");
        String mevcutSifre = scanner.nextLine();

        if (mevcutSifre.equals(sifre)) {
        System.out.println("Lutfen yeni sifrenizi giriniz");
        String yeniSifre = scanner.nextLine();

        System.out.print("Yeni şifrenizi tekrar girin: ");
        String yeniSifreOnayi = scanner.nextLine();

        if (yeniSifre.equals(yeniSifreOnayi)) {
            mevcutSifre = yeniSifre;
            System.out.println("Şifre değiştirme işlemi başarılı!");
        } else {
            System.out.println("Yeni şifreler uyuşmuyor. İşlem iptal edildi.");
        }
    } else  {
            System.out.println("Mevcut şifre yanlış. İşlem iptal edildi.");
        }
    }

    public static void main(String[] args) {
        ATM bank = new ATM();
    }
        } // class body sonu


