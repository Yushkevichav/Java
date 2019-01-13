//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

package yushkevich.lesson_1.homework;

public class Part2_var1 {
    public static void main(String[] args) {
        System.out.println(checkOne());             //Вызываю на консоль метод checkOne
    }

    private static int checkOne() {
        int a = 1, b = 2, c = 3, d = 4,
                result = a * (b + (c / d));         //инициализировал переменные
        return (result);                            //возвращаю значение переменной result в main
    }
}