//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

package yushkevich.lesson_1.homework;

import java.util.Scanner;                                //реализовал при помощи сканера

public class Part4_var1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int g = checkOne();
        if (g >= 0) {                                    //задал условие: если g >= 0, то выводим "Число положительное"
            System.out.println("Число положительное");
        } else {                                         //задал условие: во всех остальных случаях выводим "Число отрицательное"
            System.out.println("Число отрицательное");
        }
    }

    private static int checkOne() {
        Scanner check = new Scanner(System.in);          //создал объект сканер
        int number = check.nextInt();                    //задал переменную int, равную вводимым данным с консоли
        return number;
    }
}
