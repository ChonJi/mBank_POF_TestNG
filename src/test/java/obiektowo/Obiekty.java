package obiektowo;

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
    }


    static class Tester {

        String imię, nazwisko;
        int wiek;
        boolean projekt;
        List<String> umiejetnosci = new ArrayList<>();

        void pijKawe() {
            System.out.println(imię + " PIJĘ KAWĘ.");
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

    }


}
