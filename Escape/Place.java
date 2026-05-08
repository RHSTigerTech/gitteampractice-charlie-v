package Escape;

import java.util.ArrayList;

import java.math.*;

public class Place extends NameStuff {
    // instance variables - replace the example below with your own
    // private ArrayList<Item> items;
    private ArrayList<Entity> people;
    private ArrayList<Entity> enemies;

    public Place(String name, String description) {
        super(name, description);
        // items = new ArrayList<Item>();
        people = new ArrayList<Entity>();
        enemies = new ArrayList<Entity>();
    }

    public Place(String puzzleName, String description, Puzzle p) {
        super(puzzleName, description);
    }

    public boolean hasPeople() {
        return !people.isEmpty();
    }

    public void addPeople(Entity person) {
        people.add(person);
    }

    public void addEnemy(Enemy enemySpawned) {
        enemies.add(enemySpawned);
    }

    public String getPeople() {
        String temp = "";
        for (Entity entity : people) {
            temp += entity + ", ";
        }
        return temp;
    }

    // toString that lists name, entitys

}
