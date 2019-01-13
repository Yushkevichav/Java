//задание 4
package yushkevich.lesson_1.homework;

public class Part3 {
    public static void main(String[] args) {
        checkOne(1, 2);
    }

    private static int checkOne(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            System.out.println("Число в интервале от 10 до 20");
        } else {
            System.out.println("Число НЕ в интервале от 10 до 20");
        }
        return (result);
    }
}
