//задание 3
package yushkevich.lesson_1.homework;

public class Part2 {
    public static void main(String[] args) {
        checkOne(1, 2, 3, 4);
    }

    private static int checkOne(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        System.out.println(result);
        return (result);
    }
}
