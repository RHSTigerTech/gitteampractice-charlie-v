package Escape;

public class Item extends NameStuff {
    private String rarity;

    public Item(String n, String description, String rarity) {
        super(n, description);
        this.rarity = rarity;
    }

    public String toString() {
        return "This is a " + super.toString() + " It is " + rarity + " rarity. ";
    }

}
