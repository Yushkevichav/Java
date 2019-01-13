//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

package yushkevich.lesson_1.homework;

public class Part3_var2 {
    public static void main(String[] args) {
        checkOne(1, 2);
    }

    private static void checkOne(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {                            //задал условие: если возвращаемые данные >= 10, но <= 20, то в интервале
            System.out.println("Число в интервале от 10 до 20");
        } else {                                                       //в остальных случаях не в интервале
            System.out.println("Число НЕ в интервале от 10 до 20");
        }
    }
}
