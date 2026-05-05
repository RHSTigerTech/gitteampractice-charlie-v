package Escape;

public abstract class Entity extends NameStuff {
    public Entity(String n) {
        super(n);
    }

    public abstract int computeBattleNumber();

}
