package yushkevich.java_2.lesson_2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int g){
        super("Error in: " + i + "; " + g);
    }
}
