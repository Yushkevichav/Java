package yushkevich.java_2.lesson_2;

public class Convert {
    public void makeInt(StrArr s){
        int sum = 0;
        try {
            for (int i = 0; i < s.ar.length; i++) {
                if (s.ar.length != 2) {
                    throw new MyArraySizeException("StrArr must be 4x4");
                }
                for (int g = 0; g < s.ar.length; g++) {
                    if (s.ar.length != 2) {
                        throw new MyArraySizeException("StrArr must be 4x4");
                    }
                    try {
                        sum += Integer.parseInt(s.ar[i][g]);
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
