/**
 * Java 2. Lesson 2
 *
 * @author Andrey Yushkevich
 * version dated March 03, 2019
 */

package yushkevich.java_2.lesson_2;

import yushkevich.java_2.lesson_2.Exceptions.ArrayDataException;
import yushkevich.java_2.lesson_2.Exceptions.ArraySizeException;

public class StringToInt {

    protected int size_x = 4;
    protected int size_y = 4;

    public void makeInt(String[][] arr) {

        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr.length != size_x) {
                    throw new ArraySizeException("String array must be " + size_x + "x" + size_y);
                }
                for (int g = 0; g < arr.length; g++) {
                    if (arr.length != size_y) {
                        throw new ArraySizeException("String array must be " + size_x + "x" + size_y);
                    }
                    try {
                        sum += Integer.parseInt(arr[i][g]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException(i, g);
                    }
                }
            }
            System.out.println(sum);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
