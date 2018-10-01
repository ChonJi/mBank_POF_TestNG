package core;

import static java.lang.System.out;

public class GdzieMieszkam {

    private static final String mianownik = "Polska";
    private static final String miejscownik = mianownik.substring(0, 4) + "ce";

    private static void sing(final String mianownik, final String miejscownik) {
        final String a = " mieszkam w ";
        final String b = " mieszkam tu tu tu!!!";

        out.println(mianownik + a + miejscownik + a + miejscownik + b);
    }

    public static void main(String[] args) {
        sing(mianownik, miejscownik);
    }

}
