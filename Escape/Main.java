package Escape;

public class Main {

    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        Player Charlie = new Player("Charlie", classroom);
        classroom.addPeople(Charlie, 5, 7);

        System.out.println(classroom);

        Enemy test = new Enemy("test", "???", 999);
        classroom.randomEnemySpawn(test, classroom);

    }

}
