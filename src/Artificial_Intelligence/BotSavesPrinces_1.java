package Artificial_Intelligence;

import java.util.Scanner;

public class BotSavesPrinces_1 {

    public static void main(String[] args) {
        Game game = new Game();
        game.displayPathtoPrincess();
    }
}

class Game {
    static final String UP = "UP";
    static final String DOWN = "DOWN";
    static final String LEFT = "LEFT";
    static final String RIGHT = "RIGHT";

    static final char EMPTY_CELL = '-';
    static final char PRINCESS = 'p';
    static final char BOT = 'm';

    private char[][] grid;
    private Bot bot;
    private Princess princess;

    public Game() {
        createBoard();
    }

    private void createBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grid size"); // better comment this line for site version
        int size = scanner.nextInt();
        System.out.println("Enter map"); // better comment this line for site version
        scanner.nextLine();
        grid = new char[size][];
        for (int row = 0; row < size; row++) {
            char[] inputLine = scanner.nextLine().trim().toCharArray();
            for (int column = 0; column < size; column++) {

                if (inputLine[column] == PRINCESS) {
                    princess = new Princess(row, column);
                }

                if (inputLine[column] == BOT) {
                    bot = new Bot(row, column);
                }
            }
            grid[row] = inputLine;
        }
    }

    public void displayPathtoPrincess() {
        while (princess.getRow() != bot.getRow() ||
                princess.getColumn() != bot.getColumn()) {

            if (princess.getRow() > bot.getRow()) {
                grid[bot.getRow()][bot.getColumn()] = EMPTY_CELL;
                bot.move(bot.getRow() + 1, bot.getColumn());
                grid[bot.getRow()][bot.getColumn()] = BOT;
                System.out.println(DOWN);
            } else if (princess.getRow() < bot.getRow()) {
                grid[bot.getRow()][bot.getColumn()] = EMPTY_CELL;
                bot.move(bot.getRow() - 1, bot.getColumn());
                grid[bot.getRow()][bot.getColumn()] = BOT;
                System.out.println(UP);
            } else if (princess.getColumn() > bot.getColumn()) {
                grid[bot.getRow()][bot.getColumn()] = EMPTY_CELL;
                bot.move(bot.getRow(), bot.getColumn() + 1);
                grid[bot.getRow()][bot.getColumn()] = BOT;
                System.out.println(RIGHT);
            } else {
                grid[bot.getRow()][bot.getColumn()] = EMPTY_CELL;
                bot.move(bot.getRow(), bot.getColumn() - 1);
                grid[bot.getRow()][bot.getColumn()] = BOT;
                System.out.println(LEFT);
            }
        }
    }

    abstract class Person {
        private int row;
        private int column;


        public Person(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public void move(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }

    class Princess extends Person {
        public Princess(int row, int column) {
            super(row, column);
        }
    }

    class Bot extends Person {
        public Bot(int row, int column) {
            super(row, column);
        }
    }
}