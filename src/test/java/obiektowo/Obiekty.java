package obiektowo;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class Obiekty {

    public static void main(String[] args) {

        Tester maciek = new Tester();

        maciek.imię = "Maciek";
        maciek.nazwisko = "Kowalski";
        maciek.wiek = 27;
        maciek.projekt = true;

        Tester krzysiek = new Tester();
        krzysiek.projekt = false;

        System.out.println(maciek.przedstawSie());
        maciek.testuj();
        System.out.println();
        System.out.println(krzysiek.przedstawSie());
        krzysiek.pijKawe();

        Tester asia = new Tester();
        asia.imię = "Asia";
        asia.umiejetnosci.add("Java");
        asia.umiejetnosci.add("Testowanie");
        asia.wypiszUmiejetnosci();

        System.out.println(maciek.imieINazwisko());
        System.out.println();
        maciek.plec();
        asia.plec();
        //pierwszy test
        Assertions.assertThat(maciek.plec()).isEqualTo("mężczyzna");
    }
}


class Tester {

    String imię, nazwisko;
    int wiek;
    boolean projekt;
    List<String> umiejetnosci = new ArrayList<>();

    void pijKawe() {
        System.out.println(imię + " PIJE KAWĘ.");
    }

    void testuj() {
        System.out.println(imię + " PRACUJE.");
    }

    String informacjaOProjekcie() {
        if (projekt) {
            return " Obecnie mam projekt.";
        } else
            return " Aktualnie poszukuję projektu.";
    }

    String przedstawSie() {
        return "Nazywam się " + imię + " " + nazwisko + ". Mam " + wiek + " lat." + informacjaOProjekcie();
    }

    void wypiszUmiejetnosci() {

        int i = 1;

        System.out.println(imię + " umiem:");
        for (String s : umiejetnosci) {
            System.out.println(i + ". " + s);
            i++;
        }
    }

    int urodziny() {
        return wiek += 1;
    }

    String imieINazwisko() {
        return imię + " " + nazwisko;
    }

    String plec() {
        if (imię.endsWith("a")) {
            System.out.println(imię + " to kobieta.");
            return "kobieta";
        } else
            System.out.println(imię + " to mężczyzna.");
            return "mężczyzna";
    }

}


