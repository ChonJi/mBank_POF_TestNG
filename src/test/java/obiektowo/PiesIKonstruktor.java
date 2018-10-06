package obiektowo;

public class PiesIKonstruktor {

    public static void main(String[] args) {
        Pies azor = new Pies();
        azor.czyGlodny = true;
        azor.sprawdzStanPsa();
    }
}

class Pies {

    String imie;
    boolean czyGlodny, szczesliwy;

    Pies() {
        imie = "Rex";
        System.out.println("Wywołałem konstruktor psa.");
        sprawdzStanPsa();
    }

    void merdajOgonem() {
        System.out.println(imie + " merda ogonem!!!");
    }

    void jedz() {
        System.out.println(imie + " je!!!");
    }

    void szczekaj() {
        System.out.println(imie + " szczeka!!!");
    }

    void sprawdzStanPsa() {

        if (czyGlodny) {
            jedz();
        } else if (!czyGlodny && szczesliwy) {
            merdajOgonem();
        } else {
            szczekaj();
        }
    }


}
