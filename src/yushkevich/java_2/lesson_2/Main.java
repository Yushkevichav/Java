package yushkevich.java_2.lesson_2;

public class Main {
    public static void main(String[] args) {
        StrArr correct_arr = new StrArr(new String[][]{{"1", "2"},{"3", "4"}, {"2", "3"}, {"7","4"}});
        new Convert().makeInt(correct_arr);
    }
}
