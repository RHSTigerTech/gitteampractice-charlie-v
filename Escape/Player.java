package Escape;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Entity {
    // private ArrayList<Item> items;
    private int row, col;
    Classroom classroom;
    Scanner scan = new Scanner(System.in);
    ArrayList<Item> inventory;

    public Player(String name, Classroom c) {
        super(name, "You");
        row = 5;
        col = 7;
        classroom = c;
        inventory = new ArrayList<Item>();
    }

    public void check() {
        classroom.check(row, col);
    }

    public void move() {
        boolean valid = false;
        System.out.print("What direction do you want to move: ");
        String input = scan.next();
        input = input.toUpperCase();
        if (input.equals("W")) {
            valid = classroom.isValid(row - 1, col);
            if (valid)
                row = row - 1;
        } else if (input.equals("S")) {
            valid = classroom.isValid(row + 1, col);
            if (valid)
                row = row + 1;
        } else if (input.equals("D")) {
            valid = classroom.isValid(row, col + 1);
            if (valid)
                col = col + 1;
        } else if (input.equals("A")) {
            valid = classroom.isValid(row, col - 1);
            if (valid)
                col = col - 1;
        } else {
            valid = false;
        }
        if (!valid) {
            System.out.println("Invalid place or direction.\n");
        }
    }

    public void updatePos() {

    }

    // public String PlayerGrid(String temp){
    // int editRow = (3 * row + 1) * 161;
    // int editCol = 16 * col + 1;
    // int startEdit = editRow + editCol;
    // int endEdit = startEdit + 16;
    // temp = temp.substring(0, startEdit) + "Charlie\t|" + temp.substring(endEdit);
    // return temp;
    // }
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void addToInventory(Item i) { // player.addToInventory(CrockettsClassroom[2][4].getItem())
        inventory.add(i);
    }

    public void dropItem() {
        listInventory();
        // promt user to select number of item to drop
        System.out.println("Which item do you want to drop?");
        String input = scan.nextLine().toLowerCase();
        int positionToRemove = inventory.indexOf(input);
        if (positionToRemove >= 0) {
            inventory.remove(positionToRemove);
        } else {
            System.out.println(input + " is not in inventory to drop.");
        }
        // for (int i = 0; i < inventory.size(); i++) {
        // if (input.equalsIgnoreCase(inventory.get(i).getName())) {
        // inventory.remove(inventory.indexOf(i));
        // break;
        // }
        // }

    }

    public void listInventory() {
        // print out the player's inventory....
        for (Item items : inventory) {
            System.out.println(items + "\n");
        }
    }
}
