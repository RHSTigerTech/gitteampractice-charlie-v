package Escape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        String help = "move, map, pickup, interact";
        Classroom classroom = new Classroom();

        Player charlie = new Player("Charlie", classroom);
        classroom.addPeople(charlie, 5, 7);
        // classroom.addPuzzle(10, 3, new Puzzle("question", "answer"));

        // Add the first puzzle
        // Puzzle whiteboard = new Puzzle("question", "answer", classroom);
        // classroom.addPuzzle(whiteboard, 11, 2);
        // classroom.addPuzzle(whiteboard, 11, 3);
        System.out.println(classroom);

        // Do this when moving
        while (true) {
            System.out.println("What do you want to do?");
            input = scan.next().toLowerCase();
            System.out.print("\033[H\033[2J"); // Keeps terminal tidy
            if (input.equals("move")) {
                classroom.removePeople(charlie, charlie.getRow(), charlie.getCol());
                charlie.move();
                classroom.addPeople(charlie, charlie.getRow(), charlie.getCol());
            } else if (input.equals("map")) {
            System.out.println(classroom);
            } else if (input.equals("help")) {
                System.out.println("These are the games' commands, note that they are not case sensitive: " + help);
            } else {
                System.out.println("Sorry I don't know that command. Choose from the following: " + help);
            }

            charlie.check();
        }

    }

}
