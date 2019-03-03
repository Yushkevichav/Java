package yushkevich.java_2.lesson_2;

public class Convert {
    public void makeInt(StrArr s) {
        if (s.ar.length != 4) {
            throw new MyArraySizeException("StrArr must be 4x4");
        }
        try {
            for (String i[] : s.ar) {
                for (String g[] : s.ar) {
                }
            }
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
