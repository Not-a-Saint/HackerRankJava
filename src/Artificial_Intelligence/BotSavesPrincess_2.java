package Artificial_Intelligence;

import java.util.Scanner;

public class BotSavesPrincess_2 {
    static final String UP = "UP";
    static final String DOWN = "DOWN";
    static final String LEFT = "LEFT";
    static final String RIGHT = "RIGHT";
    static final String EMPTY_CELL = "-";

    static final String PRINCESS = "p";
    static final String BOT = "m";


    static void displayPathtoPrincess(String[][] grid) {
        int[] princessCoordinates = findPerson(PRINCESS, grid);
        int[] botCoordinates = findPerson(BOT, grid);
        if (princessCoordinates[0] > botCoordinates[0]) {
            grid[botCoordinates[0]][botCoordinates[1]] = EMPTY_CELL;
            grid[botCoordinates[0] + 1][botCoordinates[1]] = BOT;
            System.out.println(DOWN);
        } else if (princessCoordinates[0] < botCoordinates[0]) {
            grid[botCoordinates[0]][botCoordinates[1]] = EMPTY_CELL;
            grid[botCoordinates[0] - 1][botCoordinates[1]] = BOT;
            System.out.println(UP);
        } else if (princessCoordinates[1] > botCoordinates[1]) {
            grid[botCoordinates[0]][botCoordinates[1]] = EMPTY_CELL;
            grid[botCoordinates[0]][botCoordinates[1] + 1] = BOT;
            System.out.println(RIGHT);
        } else {
            grid[botCoordinates[0]][botCoordinates[1]] = EMPTY_CELL;
            grid[botCoordinates[0]][botCoordinates[1] - 1] = BOT;
            System.out.println(LEFT);
        }
    }


    static int[] findPerson(String person, String[][] grid) {
        int[] coordinates = new int[2];
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid.length; column++) {
                if (grid[row][column].equals(person)) {
                    coordinates[0] = row;
                    coordinates[1] = column;
                    break;
                }
            }
        }
        return coordinates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        size = scanner.nextInt();
        scanner.nextLine();
        String[][] grid = new String[size][];
        for (int i = 0; i < size; i++) {
            String[] row = scanner.nextLine().split("");
            grid[i] = row;
        }
        scanner.close();
        displayPathtoPrincess(grid);
    }
}
