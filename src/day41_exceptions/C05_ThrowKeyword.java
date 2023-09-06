package day41_exceptions;
public class C05_ThrowKeyword {
        public static void main(String[] args) {

            /* onemli

throws : bir method'da exception olasiligi varsa ve biz de o exception'i handle etmek
yerine sadece kodlarimizi calisir hale getirmek istiyorsak
method signature'na throws keyword ile olasi exception(lar)'i yazariz

throw  : method icinde istedigimiz bir satirda exception olusturmak icin kullanilir

         */

            int sayi = 11;

            // sayi cift ise ilk 3 satiri pas gecin

            try {
                if (sayi % 2 == 0){  // 11 % 2 ==0 false o zaman if body'si devreye girmiyor
                    throw new RuntimeException();
                }
                System.out.println("kod satiri 1"); // burdan calismaya devam ediyor
                System.out.println("kod satiri 2"); // burdan calismaya devam ediyor
                System.out.println("kod satiri 3"); // burdan calismaya devam ediyor

            }catch(RuntimeException e){ // eger RuntimeException e yakalarsan  burdan devam et
                System.out.println("Sayi cift oldugu icin ilk 3 kod satiri atlandi");
                // try body'sinde bir exception olusmadi o zaman  catch blogu calismayacak
            }

            System.out.println("kod satiri 4"); // burdan calismaya devam edecek
            System.out.println("kod satiri 5"); // burdan calismaya devam edecek

            /*
           kod satiri 1
           kod satiri 2
           kod satiri 3
           kod satiri 4
           kod satiri 5  int sayi = 11; ornegi icin

             */
        }
    }

    /*
      int sayi = 10; ornegi icin

            // sayi cift ise ilk 3 satiri pas gecin

            try {
                if (sayi % 2 == 0){  // 10 % 2 ==0 true o zaman if body'si devreye girer
                    throw new RuntimeException(); bu satir calisir
                }
                System.out.println("kod satiri 1"); // burdan calismaya devam ediyor (ignore eder)
                System.out.println("kod satiri 2"); // burdan calismaya devam ediyor  (ignore eder)
                System.out.println("kod satiri 3"); // burdan calismaya devam ediyor  (ignore eder)

            }catch(RuntimeException e){ // eger RuntimeException e yakalarsan  burdan devam et
                System.out.println("Sayi cift oldugu icin ilk 3 kod satiri atlandi"); // bunu yazdirir

            }

            System.out.println("kod satiri 4"); // burdan calismaya devam edecek
            System.out.println("kod satiri 5"); // burdan calismaya devam edecek

            // Sayi cift oldugu icin ilk 3 kod satiri atlandi
            // "kod satiri 4"
            // "kod satiri 5"

     */

