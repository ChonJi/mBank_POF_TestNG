package dziedziczenie;

public class Executor {

    static Warrior kamil = new Warrior();

    public static void main(String[] args) {
        System.out.println("Default hitpoints: " + kamil.getHitpoints());
        System.out.println(kamil.getClass().getSimpleName() + " hitpoints: " + kamil.warriorHitpoints());
        System.out.println("Default hitpoints: " + kamil.getMana());
        System.out.println(kamil.getClass().getSimpleName() + " hitpoints: " + kamil.warriorMana());
    }

}
