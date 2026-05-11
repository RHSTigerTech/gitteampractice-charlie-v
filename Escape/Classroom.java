package Escape;

public class Classroom {
        private Place[][] CrockettsClassroom;

        // private Player p;

        public Classroom() {
                // this.p = p;
                int row = 12;
                int col = 10;
                CrockettsClassroom = new Place[row][col];

                CrockettsClassroom[0][0] = new Place("Backdoor", "Leads to the back room, full of finch robots.");

                CrockettsClassroom[0][3] = new Place("Whiteboard",
                                "A huge whiteboard in the back of the classroom, never used by Mr. Crockett during class.");
                CrockettsClassroom[0][4] = new Place("Whiteboard",
                                "A huge whiteboard in the back of the classroom, never used by Mr. Crockett during class.");
                CrockettsClassroom[0][5] = new Place("Whiteboard",
                                "A huge whiteboard in the back of the classroom, never used by Mr. Crockett during class.");
                CrockettsClassroom[0][6] = new Place("Whiteboard",
                                "A huge whiteboard in the back of the classroom, never used by Mr. Crockett during class.");

                CrockettsClassroom[0][8] = new Place("Closet",
                                "A closet in the back of the class. I wonder what's inside it.");
                CrockettsClassroom[0][9] = new Place("Boxes",
                                "Bunch of boxes and mechanical parts on a desk. Looks like it's some kids's robotics projects.");
                CrockettsClassroom[0][9] = new Place("Boxes",
                                "Bunch of boxes and mechanical parts on a desk. Looks like it's some kids's robotics projects.");

                CrockettsClassroom[1][0] = new Place("Empty top desk",
                                "An empty desk facing the backdoor. How engaging.");
                CrockettsClassroom[1][1] = new Place("Empty top desk",
                                "An empty desk facing the back of the classroom. How engaging.");
                CrockettsClassroom[1][2] = new Place("Empty top desk",
                                "An empty desk facing the back of the classroom. How engaging.");
                CrockettsClassroom[1][3] = new Place("Empty top desk",
                                "An empty desk facing the back of the classroom. How engaging.");
                CrockettsClassroom[1][9] = new Place("TA desk",
                                "An empty desk where the Teacher Assistant usually sits.");

                CrockettsClassroom[2][6] = new Place("TV", "A TV that Mr. Crockett uses while teaching.");
                CrockettsClassroom[2][7] = new Place("TV", "A TV that Mr. Crockett uses while teaching.");

                CrockettsClassroom[2][9] = new Place("Steve head",
                                "A desk with a Steve Head sitting on it. Where did this come from?");

                CrockettsClassroom[3][0] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[3][1] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[3][2] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[3][3] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[3][9] = new Place("Empty bottom desk",
                                "An empty desk that is sat right next to the door.");

                CrockettsClassroom[4][9] = new Place("Door",
                                "The door that is used the most to get in and out of class.");

                CrockettsClassroom[5][0] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[5][1] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[5][2] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[5][3] = new Place("Empty top desk", "An empty desk.");

                CrockettsClassroom[5][6] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[5][7] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[5][8] = new Place("Charlie V's desk", "Charlie V's desk.");
                CrockettsClassroom[5][9] = new Place("Empty top desk", "An empty desk.");

                CrockettsClassroom[6][9] = new Place("Empty right desk", "An empty desk.");

                CrockettsClassroom[7][0] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[7][1] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[7][2] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[7][3] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[7][9] = new Place("Empty right desk", "An empty desk.");

                CrockettsClassroom[8][0] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[8][1] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[8][2] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[8][3] = new Place("Empty top desk", "An empty desk.");
                CrockettsClassroom[8][9] = new Place("Empty right desk", "An empty desk.");

                CrockettsClassroom[9][6] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[9][7] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[9][8] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[9][9] = new Place("Printer", "A printer, used to print things.");

                CrockettsClassroom[10][0] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[10][1] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[10][2] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[10][3] = new Place("Empty bottom desk", "An empty desk.");
                CrockettsClassroom[10][9] = new Place("Door",
                                "The door that is next to Mr. Crockett's desk, how convenient for him.");

                CrockettsClassroom[11][0] = new Place("Shelf",
                                "A shelf filled with board games and other random stuff.");

                CrockettsClassroom[11][2] = new Place("Whiteboard",
                                "This whiteboard is on wheels, Mr. Crockett uses this one the most.");
                CrockettsClassroom[11][3] = new Place("Whiteboard",
                                "This whiteboard is on wheels, Mr. Crockett uses this one the most.");

                CrockettsClassroom[11][4] = new Place("Projector",
                                "A projector that is usually used during video notes.");
                CrockettsClassroom[11][5] = new Place("Projector",
                                "A projector that is usually used during video notes.");

                CrockettsClassroom[11][7] = new Place("Teacher's Desk",
                                "Mr. Crockett's desk, he has a pretty cool setup.");
                CrockettsClassroom[11][8] = new Place("Teacher's Desk",
                                "The other side of his desk, with a extra monitor.");
                CrockettsClassroom[11][9] = new Place("Closet",
                                "A closet next to Mr. Crockett's desk. I wonder what's inside it.");

                for (int r = 0; r < CrockettsClassroom.length; r++) {
                        for (int c = 0; c < CrockettsClassroom[r].length; c++) {
                                if (CrockettsClassroom[r][c] == null) {
                                        CrockettsClassroom[r][c] = new Place("", "");
                                }
                        }
                }
        }

        public boolean isValid(int r, int c) {
                System.out.println("** in grid is valid " + r + " " + c);
                return (r >= 0 && r < CrockettsClassroom.length && c >= 0 && c < CrockettsClassroom[0].length);
        }

        public void addPeople(Entity person, int row, int col) {
                CrockettsClassroom[row][col].addPeople(person);
        }

        public void removePeople(Entity person, int row, int col) {

                CrockettsClassroom[row][col].removePeople(person);
        }

        // public String toString() {
        // String temp = "";
        // for (int i = 0; i < CrockettsClassroom[0].length; i++) {
        // temp += "----------------";
        // }

        /**
         * A method that spawns in a random enemy, takes in 2 parameters: The enemy that
         * is going to be spawned, and the place it spawns in.
         * 
         * @param enemySpawned The enemy that is going to be spawned.
         * @param c            The place where the enemy will spawn. (Not the spot, just
         *                     the general place.)
         */
        public void randomEnemySpawn(Enemy enemySpawned, Classroom c) {
                int randomRow = ((int) (Math.random()) * 12);
                int randomCol = ((int) (Math.random()) * 10);
                if (CrockettsClassroom[randomRow][randomCol] == null) {
                        CrockettsClassroom[randomRow][randomCol].addEnemy(enemySpawned);
                }
        }

        public String toString() {
                String temp = "";
                for (int i = 0; i < CrockettsClassroom[0].length; i++) {
                        temp += "----------------";
                }
                temp += "\n|";
                for (int row = 0; row < CrockettsClassroom.length; row++) {
                        for (int col = 0; col < CrockettsClassroom[row].length; col++) {
                                // border
                                // place.toString()
                                if (CrockettsClassroom[row][col] != null) {
                                        if (CrockettsClassroom[row][col].getName().length() >= 7) {
                                                temp += CrockettsClassroom[row][col].getName() + "\t|";
                                        } else {
                                                temp += CrockettsClassroom[row][col].getName() + "\t\t|";
                                        }
                                } else {
                                        temp += "\t\t|";
                                }
                        }
                        temp += "\n|";
                        for (int col = 0; col < CrockettsClassroom[0].length; col++) {
                                // if charlie's pos == row and col here print charlie
                                if (CrockettsClassroom[row][col] != null) {
                                        if (CrockettsClassroom[row][col].hasPeople()) {
                                                temp += CrockettsClassroom[row][col].getPeople() + "\t|";
                                        } else {
                                                temp += "\t\t|";
                                        }
                                }

                        }
                        temp += "\n";
                        for (int i = 0; i < CrockettsClassroom[0].length; i++) {
                                temp += "----------------";
                        }
                        temp += "-\n|";
                }
                return temp.substring(0, temp.length() - 1);
        }

        public Place getPlace(int r, int c) {
                return CrockettsClassroom[r][c];
        }
}
