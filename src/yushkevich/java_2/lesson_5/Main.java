/**
 * Java 2. Lesson 5
 *
 * @author Andrey Yushkevich
 * version dated March 14, 2019
 */

package yushkevich.java_2.lesson_5;

public class Main {
    public static void main(String[] args) {
        new ArraysPartOne().runOneThread();
        new ArraysPartOne().runTwoThreads();
        new ArraysPartTwo().runOneThread();
        new ArraysPartTwo().runTwoThreads();
    }
}
