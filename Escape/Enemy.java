package Escape;

public class Enemy extends Entity {

    private int strength;
    private String move;

    /**
     * 
     * @param n name of the enemy
     * @param s strength of the enemy
     */
    public Enemy(String n, String description, String move, int s) {
        super(n, description);
        this.move = move;
        strength = s;
    }

    public int computeBattleNumber() {
        if(Math.random() >= 0.5){ //determines whether to add or subtract
            return strength + ((int) (Math.random() * 5)); 
        }
        else{
            return strength - ((int) (Math.random() * 5)) ;
        }
    }
}
