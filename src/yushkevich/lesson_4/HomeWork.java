/**
 * Java 1. Lesson 4
 *
 * @author Andrey Yushkevich
 * version dated Jan 24, 2019
 **/

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
        boolean diag1 = true;                               //задал булеву переменную, которая будет использоваться для проверки основной диагонали
        boolean diag2 = true;                               //задал булеву переменную, которая будет использоваться для проверки побочной диагонали
        for (int i = 0; i < map.length; i++) {              //зачал счетчик первого массива
            boolean all_row_dt = true;                      //задал будеву переменную, которая будет использоваться для проверки всех строк
            boolean all_col_dt = true;                      //задал будеву переменную, которая будет использоваться для проверки всех столбцов
            if (map[i][i] != dt) {                          /* цикл на проверку основной диагонали (проверка diag1 вынесена за цикл,
                                                              т.к. если оставить ее в цикле - то при вводе любого значения будет возвращаться true).
                                                              Если индекс массива != dt, то присваиваем diag1 = false
                                                            */
                diag1 = false;
            }
            if (map[i][map.length - 1 - i] != dt) {         /* цикл на проверку побочной диагонали (проверка diag2 вынесена за цикл,
                                                              т.к. если оставить ее в цикле - то при вводе любого значения будет возвращаться true).
                                                              Если индекс массива != dt, то присваиваем diag2 = false
                                                            */
                diag2 = false;
            }
            for (int g = 0; g < map.length; g++) {          //задал счетчик второго массива
                if (map[i][g] != dt) {                      //проходимся по строке
                    all_row_dt = false;                     //если хотя бы 1 значение в строке != dt - возвращаем false
                }
                if (map[g][i] != dt) {                      //проходимся по столбцу
                    all_col_dt = false;                     //если хотя бы 1 значение в столбце != dt - возвращаем false
                }
            }
            if (all_row_dt || all_col_dt) return true;      //если all_row_dt или all_col_dt = true - возвращаем true
        }
        if (diag1 || diag2) return true;                    //если diag1 или diag2 = true - возвращаем true
        return false;                                       //во всех остальных случаях возвращаем false
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
