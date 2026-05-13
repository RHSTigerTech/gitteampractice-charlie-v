package Escape;

public class Weapon extends Item {
    private int damage;

    public Weapon(String n, String description, String rarity, int damage) {
        super(n, description, rarity);
        // super(rarity);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String toString() {
        return super.toString() + "It does " + damage + " damage.";
    }
}
