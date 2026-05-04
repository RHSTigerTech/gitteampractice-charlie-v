package Escape;

public abstract class NameStuff {
    private String name;

    public NameStuff(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
