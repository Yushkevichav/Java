/**
 * Java 2. Lesson 2
 *
 * @author Andrey Yushkevich
 * version dated March 03, 2019
 */

package yushkevich.java_2.lesson_2.Exceptions;

public class ArraySizeException extends RuntimeException {
    public ArraySizeException(String message){
        super(message);
    }
}
