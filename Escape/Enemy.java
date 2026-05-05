package Escape;

public class Enemy extends Entity {

    private int strength;

    /**
     * 
     * @param n name of the enemy
     * @param s strength of the enemy
     */
    public Enemy(String n, int s) {
        super(n);
        strength = s;
    }

    public int computeBattleNumber() {
        return (int) (Math.random() * 10) + strength;
    }
}
