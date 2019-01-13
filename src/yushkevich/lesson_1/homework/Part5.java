//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

package yushkevich.lesson_1.homework;

public class Part5 {
    private static boolean d;
    public static void main(String[] args) {
        checkOne();
        if (checkOne() >= 0) {
            d = false;
            System.out.println("Возвращено значение false");
        } else {
            d = true;
            System.out.println("Возвращено значение true");
        }
    }

    private static int checkOne() {
        int a = 1;
        return (a);
    }
}
