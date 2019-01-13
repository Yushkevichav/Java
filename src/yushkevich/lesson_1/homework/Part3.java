//задание 4
//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

package yushkevich.lesson_1.homework;

public class Part3 {
    public static void main(String[] args) {
        checkOne(1, 2);                                         //вызываю checkOne и передаю значения переменных
    }

    private static int checkOne(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            System.out.println("Число в интервале от 10 до 20");
        } else {
            System.out.println("Число НЕ в интервале от 10 до 20");
        }
        return (result);                                                //возвращаю значение переменной result в main
    }
}
