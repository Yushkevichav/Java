/**
 * Java 2. Lesson 2
 *
 * @author Andrey Yushkevich
 * version dated March 03, 2019
 */

package yushkevich.java_2.lesson_2;

public class Convert {

    protected int size_x = 4;
    protected int size_y = 4;

    public void makeInt(String[][] arr) {

        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr.length != size_x) {
                    throw new MyArraySizeException("StrArr must be " + size_x + "x" + size_y);
                }
                for (int g = 0; g < arr.length; g++) {
                    if (arr.length != size_y) {
                        throw new MyArraySizeException("StrArr must be " + size_x + "x" + size_y);
                    }
                    try {
                        sum += Integer.parseInt(arr[i][g]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, g);
                    }
                }
            }
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
