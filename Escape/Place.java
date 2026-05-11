package Escape;

import java.util.ArrayList;

public class Place extends NameStuff {
    // instance variables - replace the example below with your own
    // private ArrayList<Item> items;
    private ArrayList<Entity> people;

    public Place(String name, String description) {
        super(name, description);
        // items = new ArrayList<Item>();
        people = new ArrayList<Entity>();
    }

    public boolean hasPeople(){
        return !people.isEmpty();
    }

    public void addPeople(Entity person){
        people.add(person);
    }

    public void removePeople(Entity person){
        people.remove(person);
    }

    public String getPeople(){
        String temp = "";
        for (Entity entity : people) {
            temp += entity.getName() + " ";
        }
        return temp;
    }

    // toString that lists name, entitys
    public String toString(){
        return super.toString() + getPeople() + "is there. ";
    }
}
