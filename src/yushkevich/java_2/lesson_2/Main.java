/**
 * Java 2. Lesson 2
 *
 * @author Andrey Yushkevich
 * version dated March 03, 2019
 */

package yushkevich.java_2.lesson_2;

public class Main {
    public static void main(String[] args){
        StrArr correct_arr = new StrArr(new String[][]{{"1", "2"},{"6", "4"}});
        new Convert().makeInt(correct_arr);
    }
}
