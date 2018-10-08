package dupa;

public class Main {

    private static int dupa;

    public static void main(String[] args) {

        TestRozszerzająca test = new TestRozszerzająca(dupa).setDupa();
        System.out.println(test.getDupa());
    }

}
