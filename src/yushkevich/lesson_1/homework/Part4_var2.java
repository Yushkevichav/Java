//задание 5
package yushkevich.lesson_1.homework;

public class Part4_var2 {
    public static void main(String[] args) {
        checkOne(1);

    }

    private static int checkOne(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        return (a);
    }
}
