package obiektowo;

public class WstępTypyDanych {

     /*
        Typy całkowite:
             byte - 8 bit - od -128 do 127
             short - 16 bit od -32,768 do 32,767
             int - 32 bity - od -2 ^ 31 do 2 ^31 -1
             long - 64 bit - od -2^ 63 do 2^63 - 1

        Znakowe:
             char - 2 bajtowy
             String - ciąg znaków

        Zmienne zmiennoprzecinkowe
            float - 32 bity - 1,4 * 10 ^ -45 do 3,4  * 10 ^ 138
            double - 64 bity - od 4,9 * 10 ^ -324 do 1,8 * 10 ^ 308

        boolean - typ przechowujący wartości prawda/fałsz. Prawda reprezentowana jest przez wartość true. Fałsz to false
            boolean -> true || false

        */


    public static void main(String[] args) {

        String imie = "";
        String nazwisko = "";
        long a = 12412412124121554L;
        int b = 6;
        long c;
        short liczba = 127;
        float pojedynczejPrecyzji = 1.27f;
        double podwojnejPrecyzji = 1.27;

        c = a + b;


        System.out.println(liczba);


        char znak = 'g';

        float liczba2 = 4.57f;
        double liczba3 = 56.6121424;

        System.out.println("Imię: " + imie + ", nazwisko: " + nazwisko);
        System.out.println(liczba3);


    }


}
