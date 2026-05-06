package Escape;

public class Item extends NameStuff {
    private String rarity;
    private String description;

    public Item(String n, String rarity, String description) {
        super(n);
        this.rarity = rarity;
        this.description = description;
    }

    public String toString() {
        return "This is a " + super.toString() + ", which is " + rarity + ". " + description;
    }

}
