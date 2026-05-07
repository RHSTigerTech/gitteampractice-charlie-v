package Escape;

public abstract class NameStuff {
    private String name;
    private String description;

    public NameStuff(String n, String d) {
        name = n;
        description = d;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return name + ". " + description;
    }
}
