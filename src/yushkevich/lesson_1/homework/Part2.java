//задание 3
//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

package yushkevich.lesson_1.homework;

public class Part2 {
    public static void main(String[] args) {
        checkOne(1, 2, 3, 4);                         //вызываю checkOne и передаю значения переменных
    }

    private static int checkOne(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        System.out.println(result);
        return (result);                                           //возвращаю значение переменной result в main
    }
}
