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
        row = 0;
        col = 0;
        classroom = c;
        // items = new ArrayList<Item>();
    }

    // public String showInventory() {
    // for ()
    // }

    public void move(String direction) {
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

    public void updatePos(){
    }

    // public String PlayerGrid(String temp){
    //     int editRow = (3 * row + 1) * 161;
    //     int editCol = 16 * col + 1;
    //     int startEdit = editRow + editCol;
    //     int endEdit = startEdit + 16;
    //     temp = temp.substring(0, startEdit) + "Charlie\t|" + temp.substring(endEdit);
    //     return temp;
    // }
}
