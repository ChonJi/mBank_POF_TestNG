package dziedziczenie;

public class Warrior extends Character {

    Warrior() {
        System.out.println("Konstruktor Warrior");
    }

    public double warriorHitpoints() {
        return (double) hitpoints * 1.50;
    }

    public double warriorMana() {
        return (double) mana * 0.50;
    }

}
