//задание 6
//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

package yushkevich.lesson_1.homework;

public class Part5 {
    public static void main(String[] args) {
        checkOne(-5);
    }

    private static int checkOne(int a) {
        boolean d;
        if (a >= 0) {
            d = false;
            System.out.println("Возвращено значение false");
        } else {
            d = true;
            System.out.println("Возвращено значение true");
        }
        return (a);
    }
}
