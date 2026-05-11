package Escape;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Entity{
    //private ArrayList<Item> items;
    private int row, col;
    Classroom classroom;
    Scanner scan = new Scanner(System.in);

    public Player(String name, Classroom c) {
        super(name, "You");
        row = 5;
        col = 7;
        classroom = c;
        // items = new ArrayList<Item>();
    }

    // public String showInventory() {
    // for ()
    // }

    public void check(){
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

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}
