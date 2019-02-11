//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

package yushkevich.java_1.lesson_1.homework;

public class Part2 {
    public static void main(String[] args) {
        System.out.println(checkOne(1, 2, 3, 4));                                   //вызываю метод checkOne с заданными параметрами
    }

    private static double checkOne(double a, double b, double c, double d) {
        if (d == 0) {
            System.out.println("Делить на 0 нельзя");
        }
        return a * (b + (c / d));
    }
}
