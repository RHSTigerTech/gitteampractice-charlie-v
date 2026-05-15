package Escape;

public class Weapon extends Item {
    private int damage;
    private String move;

    public Weapon(String n, String description, String rarity, String move, int damage) {
        super(n, description, rarity);
        // super(rarity);
        this.damage = damage;
        this.move = move;
    }

    public String getMove(){
        return move;
    }

    public int getDamage() {
        if(Math.random() >= 0.5){ //determines whether to add or subtract
            return damage + ((int) (Math.random() * 5)); 
        }
        else{
            return damage - ((int) (Math.random() * 5));
        }
    }

    public String toString() {
        return super.toString() + ". Has the move:" + move + ". It does " + damage + " damage.";
    }
}
