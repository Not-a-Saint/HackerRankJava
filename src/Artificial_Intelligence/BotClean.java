package Artificial_Intelligence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BotClean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter bot position: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

//        System.out.println("Scan environment...");
        scanner.nextLine();
        char[][] environment = new char[Map.SIZE][];
        for (int i = 0; i < Map.SIZE; i++) {
            environment[i] = scanner.nextLine().toCharArray();
        }
        Bot bot = new Bot(row, column, environment);
        while (!bot.map.dirtyPlaces.isEmpty()) {
            bot.next_move();
            bot.map.printMap();
        }

    }
}

class Dirt {
    int row;
    int column;

    public Dirt(int row, int column) {
        this.row = row;
        this.column = column;
    }
}

class Map {
    static final String UP = "UP";
    static final String DOWN = "DOWN";
    static final String LEFT = "LEFT";
    static final String RIGHT = "RIGHT";

    public static final char CLEAR = '-';
    public static final char DIRTY = 'd';
    public static final char BOT = 'b';
    public static final int SIZE = 5;
    char[][] view;
    List<Dirt> dirtyPlaces;

    public Map(char[][] environment) {
        view = environment;
        dirtyPlaces = new ArrayList<>();
        findDirtyCells();
    }

    void findDirtyCells() {
        for (int row = 0; row < view.length; row++) {
            for (int column = 0; column < view.length; column++) {
                if (view[row][column] == DIRTY) {
                    dirtyPlaces.add(new Dirt(row, column));
                }
            }
        }
    }

    void printMap() {
        for (char[] row : view) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}

class Bot {
    public Map map;
    private int botRow;
    private int botColumn;

    public Bot(int row, int column, char[][] environment) {
        botRow = row;
        botColumn = column;
        map = new Map(environment);
    }

    private int findClosestDirt() {
        int dirtIndex = 0;
        int closest = Map.SIZE * Map.SIZE; // Max amount of cells in the map

        for (Dirt dirt : map.dirtyPlaces) {
            //Calculate cells amount(distance) from bot to dirt
            int distance = Math.abs(botRow - dirt.row) + Math.abs(botColumn - dirt.column);
            if (distance < closest) {
                closest = distance;
                dirtIndex = map.dirtyPlaces.indexOf(dirt);
            }
        }
        return dirtIndex;
    }

    void next_move() {
        int closestDirtIndex = findClosestDirt();
        Dirt closestDirt = map.dirtyPlaces.get(closestDirtIndex);

        if (closestDirt.row > botRow) {
            map.view[botRow][botColumn] = Map.CLEAR;
            botRow++;
            map.view[botRow][botColumn] = Map.BOT;
            System.out.println(Map.DOWN);
        } else if (closestDirt.row < botRow) {
            map.view[botRow][botColumn] = Map.CLEAR;
            botRow--;
            map.view[botRow][botColumn] = Map.BOT;
            System.out.println(Map.UP);
        } else if (closestDirt.column > botColumn) {
            map.view[botRow][botColumn] = Map.CLEAR;
            botColumn++;
            map.view[botRow][botColumn] = Map.BOT;
            System.out.println(Map.RIGHT);
        } else {
            map.view[botRow][botColumn] = Map.CLEAR;
            botColumn--;
            map.view[botRow][botColumn] = Map.BOT;
            System.out.println(Map.LEFT);
        }

        if (closestDirt.row == botRow && closestDirt.column == botColumn) {
            map.dirtyPlaces.remove(closestDirtIndex);
        }
    }
}