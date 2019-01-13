//задание 3
package yushkevich.lesson_1.homework;

public class Part2 {
    public static void main(String[] args) {
        checkOne(1, 2, 3, 4);                      //вызвал метод checkOne
    }

    private static int checkOne(int a, int b, int c, int d) {      //создал метод checkOne
        int result = a * (b + (c / d));  //инициализировал переменную result
        System.out.println(result);      //вывел на консоль переменную result
        return (result);                 //вернул в main результат вычисления result
    }
}
