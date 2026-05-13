package Escape;

import java.util.ArrayList;

import java.math.*;

public class Place extends NameStuff {
    // instance variables - replace the example below with your own
    // private ArrayList<Item> items;
    private ArrayList<Entity> people;
    private ArrayList<Entity> enemies;
    private ArrayList<Puzzle> puzzles;
    private ArrayList<Item> items;

    public Place(String name, String description) {
        super(name, description);
        // items = new ArrayList<Item>();
        people = new ArrayList<Entity>();
        enemies = new ArrayList<Entity>();
        puzzles = new ArrayList<Puzzle>();
        items = new ArrayList<Item>();
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

    // public Item removeItem(Item i) {
    // return items.remove(i);
    // }

    public void removePeople(Entity person) {
        people.remove(person);
    }

    public int numPuzzles() {
        return puzzles.size();
    }

    public void showPuzzle() {
        if (puzzles.size() > 0) {
            System.out.println(this.puzzles.get(0));

            // use loop to keeep player stuck playing puzzle until they solve or quit maybe

        } else {
            System.out.println("No puzzles here.");
            // do nothing
        }
    }

    public String getPeople() {
        String temp = "";
        for (Entity entity : people) {
            temp += entity.getName() + " ";
        }
        return temp;
    }

    // toString that lists name, entitys
    public String toString() {
        String s = "";

        if (numPuzzles() > 0) {
            s += "\n" + puzzles.get(0);
        }

        return super.toString() + s + getPeople() + "is there. ";
    }

}
