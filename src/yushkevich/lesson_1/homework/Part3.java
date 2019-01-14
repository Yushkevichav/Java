//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

package yushkevich.lesson_1.homework;

public class Part3 {
    public static void main(String[] args) {
        int g = checkOne(1, 2);
        if (g >= 10 && g <= 20) {                                      //задал условие: если возвращаемые данные >= 10, но <= 20, то в интервале
            System.out.println("Число в интервале от 10 до 20");
        } else {                                                       //в остальных случаях не в интервале
            System.out.println("Число НЕ в интервале от 10 до 20");
        }
    }

    private static int checkOne(int a, int b) {
        int result = a + b;
        return result;
    }
}
