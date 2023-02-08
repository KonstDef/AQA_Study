package HomeWork2_XO;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    //main method
    public static void main(String[] args) {
        //variables
        String listener;                        //keeps input (required for breaking game from sequence)
        int[][] gameField = new int[3][3];      //keeps game field

        String[] names = new String[2];         //keeps players name
        int[] scores = new int[2];              //keeps scores

        System.out.println("Welcome to Tic-tac-toe!");
        //name creation
        createNames(names);

        //game loop
        do {
            //menu
            do {
                menuOutput(scores, names);             //prints menu
                listener = menuInput();               //takes menu input

                if (listener.equals("X")) {
                    switchPlayers(names, scores);
                } else if (listener.equals("C")) {
                    createNames(names);
                }
            } while (!listener.equals("go")&&!listener.equals("E"));

            fillField(gameField);               //fills field with 0 | in case of new game

            //game loop
            for (int player = 1; !listener.equals("Z") && !listener.equals("E"); ) {
                //interaction with players
                do {
                    printField(gameField);                    //prints field
                    turnOutput(player, names);                //prints info for player
                    listener = turnInput(player, gameField);  //takes input

                    if (listener.equals("R")) listener = askAgreement(-player, names); //ask restart agreement
                } while (listener.equals("failed"));

                //check if win made by giving up
                if (listener.equals("G")) {
                    giveUp(player, scores, names);
                    listener = "Z";
                }

                //game logic
                if (checkWin(gameField)) {               //checks if anyone won
                    printWin(player, scores, names);     //shows congrats message and raises score for current player. There is no case 2nd player can win in 1st player turn.
                    listener = "Z";                      //exits game field loop, so players can decide new round.
                } else if (checkDraw(gameField)) {
                    printDraw();
                    listener = "Z";                      //exits game field loop, so players can decide new round.
                }

                //players switch
                if (player == 1) {
                    player = -1;                         //if no one won yet, changes player 1 to 2
                } else {
                    player = 1;                          //changes player 2 to 1
                }
            }
        } while (!listener.equals("E"));
    }

    //output methods
    public static void printFail() {
        System.out.print("\nPlease reenter!\n\n\n");    //message

        try {
            Thread.sleep(1000);                //try|catch is required
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }                                               //sleep will give players time to read message
    }//prints message if input was with error

    public static void menuOutput(int[] score, String[] names) {
        System.out.print("\n\n");
        System.out.printf("%s:%d\tX|O\t%s:%d\n", names[0], score[0], names[1], score[1]);
        System.out.print("[1] starts round, [X] switches players, [C] changes names, [E] exits game.\n\nYour choice: ");
    }//prints menu

    public static void turnOutput(int i, String[] names) {
        char p = i == 1 ? 'X' : 'O'; //if i sign is 1, then it is Player 1, otherwise 2 (this case is described in book p.122)
        String name = i == 1 ? names[0] : names[1];

        System.out.printf("%s's turn to put [%s]!\n\n", name, p);
        System.out.println("[A1] format to make turn, [G] to give up, [R] restarts game from menu, [E] exits game.");
        System.out.print("Enter your choice : ");
    }//prints message for current player

    public static void printWin(int i, int[] score, String[] names) {
        String name = " ";

        switch (i) {
            case 1:
                score[0]++;
                name = names[0];
                break;
            case -1:
                score[1]++;
                name = names[1];
                break;
        }//score++

        System.out.printf("\n\n\n\n%s won, congratulations!\n", name);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }//prints win message and adds score

    public static void printField(int[][] field) {
        char s;
        System.out.println(" \t-*-\t-*-\t-*-");
        System.out.println(" \t A \t B \t C ");         //x axis map tags

        for (int i = 0; i < field.length; i++) {
            System.out.print(i + 1);                    //y axis map tags in friendly for user 1,2,3 manner
            for (int j = 0; j < field[i].length; j++) { //finds which player mark is in cell, then fills s with X or O mark (or blank space)
                switch (field[i][j]) {
                    case 1:
                        s = 'X';
                        break;
                    case -1:
                        s = 'O';
                        break;
                    default:
                        s = ' ';
                        break;
                }
                System.out.printf("\t[%s]", s);
                if (j == field[i].length - 1) System.out.println(); //adds next line mark after the end of row
            }
        }
    }//prints current field

    public static void giveUp(int i, int[] scores, String[] names) {
        int player = i == 1 ? 0 : 1;

        System.out.printf("%s gives up!", names[player]);
        printWin(-i, scores, names);
    }//if any player decides to give up

    public static void printDraw(){
        System.out.println("\n\n\n\nDraw!"); //shows Draw! message. No scores raised

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //input methods
    public static String menuInput() {
        Scanner scanner = new Scanner(System.in);
        String input;

        //input
        input = String.valueOf(scanner.next().charAt(0)); // gets 1 char

        switch (input.toUpperCase()) {
            case "1":
                System.out.print("\n\n\n\n\n\n");         //required to divide menu from game field
                return "go";
            case "E":
                return input.toUpperCase();               //for player to exit the game
            case "X":
                return "X";
            case "C":
                return "C";
            default:
                //case failed
                printFail();
                return "failed";
        }
    }//ask menu input

    public static String turnInput(int i, int[][] field) {
        Scanner scanner = new Scanner(System.in);
        String input;

        int[] cell = new int[]{-1, -1}; //keep data entered to check if turn is possible
        int reverted = 0;               //case user will write in reverted format

        //input
        input = scanner.nextLine();

        switch (input.toUpperCase().charAt(0)) {
            case 'A':
                cell[1] = 0;            //because A,B,C are "column" values, they will represent second index.
                break;
            case 'B':
                cell[1] = 1;
                break;
            case 'C':
                cell[1] = 2;
                break;
            case '1':
                cell[0] = 0;            //because 1,2,3 are "row" values, they will represent first index.
                reverted++;             //not right case
                break;
            case '2':
                cell[0] = 1;
                reverted++;
                break;
            case '3':
                cell[0] = 2;
                reverted++;
                break;
            case 'E':
                return "E";
            case 'R':
                return "R";
            case 'G':
                return "G";
            default:
                printFail();
                return "failed";        //required in case if user enters single wrong value for example "V"
        }

        try {
            switch (input.toUpperCase().charAt(1)) {
                case 'A':
                    cell[1] = 0;
                    reverted++;           //not right case
                    break;
                case 'B':
                    cell[1] = 1;
                    reverted++;
                    break;
                case 'C':
                    cell[1] = 2;
                    reverted++;
                    break;
                case '1':
                    cell[0] = 0;
                    break;
                case '2':
                    cell[0] = 1;
                    break;
                case '3':
                    cell[0] = 2;
                    break;
                default:
                    printFail();
                    return "failed";
            }
        } catch (StringIndexOutOfBoundsException e) {
            printFail();
            return "failed";
        }

        if (reverted == 1 || !checkTurn(cell, field)) { //it is wrong if only one value is reverted, "11"
            printFail();
        } else {
            field[cell[0]][cell[1]] = i;
            return "go";
        }
        return "failed";
    }//processes input and checks its possibility

    public static void setName(String[] names, int i) {
        Scanner scanner = new Scanner(System.in);
        String phd;
        boolean check;

        do {
            System.out.printf("Enter name for Player %d: ", i + 1);
            phd = scanner.nextLine();

            check = (phd.lastIndexOf('/') == -1) && (phd.lastIndexOf('\\') == -1) && (phd.lastIndexOf('\"') == -1) &&
                    (phd.lastIndexOf('\'') == -1) && (phd.lastIndexOf('%') == -1);
            if (!check) System.out.println("\nPlease reenter! Character / \\ \" ' % are illegal.\n");
        } while (!check);

        names[i] = phd;
    }//sets name for players

    public static String askAgreement(int i, String[] names) {
        Scanner scanner = new Scanner(System.in);

        int player = i == 1 ? 0 : 1;

        System.out.printf("%s agrees? [Y] - to confirm restart from menu: ", names[player]);
        String input = scanner.nextLine();

        if (input.toUpperCase().charAt(0) == 'Y') return "Z";

        return "failed";
    }

    //game logic methods
    public static void switchPlayers(String[] names, int[] scores) {
        String[] phdNames = new String[]{names[1], names[0]};
        int[] phdScores = new int[]{scores[1], scores[0]};


        for (int i = 0; i < phdScores.length; i++) {
            names[i] = phdNames[i];
            scores[i] = phdScores[i];
        }
    }//switches players

    public static void fillField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], 0);   //autofill from IDEA
        }
    }//fills field with blank

    public static boolean checkTurn(int[] cell, int[][] field) {
        int fieldCell = field[cell[0]][cell[1]];    //gets value of asked cell

        return fieldCell == 0;                      //checks if value means it is empty
    }//checks if cell is available to be entered

    public static boolean checkWin(int[][] field) {
        int check;

        for (int i = 0; i < field.length; i++) {

            for (int j = 0; j < field[i].length; j++) {
                if (i > 0 && i < field.length - 1) {                                 //gets only "middle" cell in y-axis
                    check = field[i - 1][j] + field[i][j] + field[i + 1][j];         //checks if both cells near "middle" cell are same
                    if (check == 3 || check == -3) return true;
                }
                if (j > 0 && j < field[i].length - 1) {                              //gets only "middle" cell in x-axis
                    check = field[i][j - 1] + field[i][j] + field[i][j + 1];
                    if (check == 3 || check == -3) return true;
                }
                if ((j > 0 && j < field[i].length - 1) && (i > 0 && i < field.length - 1)) {//gets only cells in center of field
                    check = field[i - 1][j - 1] + field[i][j] + field[i + 1][j + 1]; //gets top left to bottom right
                    if (check == 3 || check == -3) return true;

                    check = field[i + 1][j - 1] + field[i][j] + field[i - 1][j + 1]; //gets bottom left to top right
                    if (check == 3 || check == -3) return true;
                }
            }

        }
        return false;
    }//check if anyone won

    public static boolean checkDraw(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 0) return false; //if at least one value is blank, then it means that game continues
            }
        }
        return true;
    }//check if there is draw

    public static void createNames(String[] names){
        do {
            setName(names, 0);
            setName(names, 1);
            if (names[0].equals(names[1])) System.out.println("Your names are equal!!! Create new!");
        } while (names[0].equals(names[1]));
    }

}