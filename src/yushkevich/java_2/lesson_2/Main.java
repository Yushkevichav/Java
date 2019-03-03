/**
 * Java 2. Lesson 2
 *
 * @author Andrey Yushkevich
 * version dated March 03, 2019
 */

package yushkevich.java_2.lesson_2;

public class Main {
    public static void main(String[] args) {
        try {
            String arr[][] = new String[][]{
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
            };
            new StringToInt().makeInt(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("String array must be " + new StringToInt().size_x + "x" + new StringToInt().size_y);
        }
    }
}
