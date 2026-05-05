package Escape;

public class Classroom {
    private Place[][] CrockettsClassroom;

    public Classroom() {
        int row = 12;
        int col = 10;
        CrockettsClassroom = new Place[row][col];

        CrockettsClassroom[0][0]
    }

    public boolean isValid(int r, int c) {
        System.out.println("** in grid is valid " + r + " " + c);
        return (r >= 0 && r < CrockettsClassroom.length && c >= 0 && c < CrockettsClassroom[0].length);
    }
}
