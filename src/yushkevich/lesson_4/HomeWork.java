package yushkevich.lesson_4;

import java.util.Random;
import java.util.Scanner;

class HomeWork {

    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new HomeWork().game();
    }

    void game() {
        initMap();
        random = new Random();
        scanner = new Scanner(System.in);
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        printMap();
        System.out.println("GAME OVER");
    }

    void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    boolean checkWin(char dt) {
        boolean diag1 = true;
        boolean diag2 = true;
        for (int i = 0; i < map.length; i++) {
            boolean all_row_dt = true;
            boolean all_col_dt = true;
            if (map[i][i] != dt) {
                diag1 = false;
            }
            if (map[i][map.length - 1 - i] != dt) {
                diag2 = false;
            }
            for (int g = 0; g < map.length; g++) {
                if (map[i][g] != dt) {
                    all_row_dt = false;
                }
                if (map[g][i] != dt) {
                    all_col_dt = false;
                }
            }
            if (all_row_dt || all_col_dt) return true;
        }
        if (diag1 || diag2) return true;
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY; // by DSerov
    }
}
