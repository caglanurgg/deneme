package day41_exceptions;

public class finallyKeyword {

    /*
    finally blogu try blogu ile calisir
finally blogu her durumda calisir, kullanim amaci bir exception olussa da,
mutlaka yapilmasi gereken data base connection'inin durdurulmasi gibi gorevlerin
yapilacagindan emin olmaktir

    try blogunun olma sebebi sen bunu bir dene problemle karsilasirsan sunu yap
    demek gibidir

try catch  olabilir
try finally olabilir
try catch catch catch finally olabilir
sadece try finally olabilir

FileNotFoundException nedir?
Programimizda bir dosyayi okumaya calisiyorken dosya bulunamazsa olusur.
IOException'in subclass'idir.

IOException nedir?
Programimizda bir file'a input/output yapiliyorsa ve
program calisirken bir problem cikarsa olusur.
Checked exceptiondir ve kod yazilirken mutlaka  handle edilmelidir.

not: parent ustte child altta olamaz

ERRORS : Java'nin bas edemedigi sorunlardir.Onceden ongorulemezler.RunTime'da olusurlar
         yani Unchecked'dirler. Error olustugunda program durdurulur,exception gibi handle
         edilemediginden data kayiplari olmasinin onune gecilemez.

         final - finally{} - finalize ()

         FİNAL KEYWORD
         final variable : degeri degistirilmeyecek variable
         final method : Override edilemeyecek method
         final class : Inherit edilemeyecek class

         FİNALİZE()
         Garbage collection mekanizmasinda gorev alir.Garbage collector'den once calisarak
         kullanilmayan ve yok edilmesi gereken variable'lari isaretler.
         Garbage collector isaretlenmeyen objeleri toplamaz.

         FİNALLY{}
         Finally blogu try ile birlikte kullanilabilir.
         try blogu tek basina calismaz catch ve/veya finally blogu ile calismak zorundadir.
         finally blogu try-catch'e eklenirse her ihtimalle calisir.
         Sistem kapanmadan kritik onemdeki islemleri yapmak icin kullanilir.


     */
}
