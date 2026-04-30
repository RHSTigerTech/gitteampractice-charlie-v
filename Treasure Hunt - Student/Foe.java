public class Foe extends Entity {

    private int strength;

    /**
     * 
     * @param n name of the foe
     * @param s strength of the foe
     */
    public Foe(String n, int s) {
        super(n);
        strength = s;
    }

    public int computeBattleNumber() {
        return (int) (Math.random() * 10) + strength;
    }
}
