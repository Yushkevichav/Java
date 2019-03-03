package yushkevich.java_2.lesson_2;

public class StrArr {

    public String[][] ar;

    public StrArr(String ar[][]) {
        this.ar = ar;
    }

    public void makeInt(StrArr s) {
        if (ar.length != 4) {
            throw new MyArraySizeException("StrArr must be 4x4");
        }
        try {
            for (String i[] : ar) {
                for (String g[] : ar) {
                }
            }
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}