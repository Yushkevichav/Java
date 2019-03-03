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
            StrArr correct_arr = new StrArr(new String[][]{
                    {"1", "2", "4", "9"},
                    {"6", "4", "5", "7"},
                    {"4", "4", "5", "7"},
                    {"5", "4", "3", "9"}
            });
            new Convert().makeInt(correct_arr);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("StrArr must be 4x4");
        }
    }
}
