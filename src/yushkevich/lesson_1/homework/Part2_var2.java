//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

package yushkevich.lesson_1.homework;

public class Part2_var2 {
    public static void main(String[] args) {
        checkOne(1, 2, 3, 4);                       //вызываю метод checkOne с заданными параметрами
    }

    private static void checkOne(int a, int b, int c, int d) {
        int result = a * (b + (c / d));                           //инициализировал переменную result
        System.out.println(result);                               //вывел на консоль
    }
}
