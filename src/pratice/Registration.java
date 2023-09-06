package pratice;

import java.util.ArrayList;

//import static org.graalvm.compiler.options.OptionType.User;

public class Registration {
    /*
       Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
     şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;
1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)

2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
ekleyerek Kullanıcıdan user ismini alarak ArrayList'e ekleyin ve bu list'ireturn edin.

3- Registration(Kayıt) classı na aynı zamanda kendine verilen
ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.
     */

    public static void main(String[] args) {

        ArrayList registerList = new ArrayList<>();
        registerList = register();
        System.out.println("Register List: " + registerList);
        isTheyHappy(registerList);
    }

    public static ArrayList register() {

        ArrayList<String> list = new ArrayList<>();
        //list = User.getUser();

        return list;
    }

    public static void isTheyHappy(ArrayList<String> list) {
        String seconds = "";
        for (String each : list) {
            int indexOfSpace = each.indexOf(" ");
            String name = each.substring(0, indexOfSpace);
            seconds = each.substring(each.length() - 2);
            int intSec = Integer.parseInt(seconds);
            if (intSec >= 0 && intSec <= 10) {
                System.out.println("*** CONGRATULATIONS " + name.toUpperCase() + "! ***" +
                        " \n\tYOU ARE A HAPPY USER :)");
            }
        }
    }
}
