package dupa;

public class TestRodzic {

    protected int dupa;

    public TestRodzic(int dupa) {
        this.dupa = dupa;
    }

    public int getDupa() {
        return dupa;
    }

    public TestRozszerzająca setDupa() {
        this.dupa = 20;
        return new TestRozszerzająca(dupa);
    }

}
