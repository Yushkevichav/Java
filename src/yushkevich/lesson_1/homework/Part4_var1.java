//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

package yushkevich.lesson_1.homework;

import java.util.Scanner;                               //реализовал при помощи сканера

public class Part4_var1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        checkOne();                                     //вызываю метод checkOne без параметров
    }

    private static void checkOne() {
        Scanner check = new Scanner(System.in);         //создал объект сканер
        int number = check.nextInt();                   //задал переменную int, равную вводимым данным с консоли
        if (number >= 0) {                              //задал условие: если number >= 0, то выводим "Число положительное"
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");   //задал условие: во всех остальных случаях выводим "Число отрицательное"
        }
        check.close();                                   //закрыл сканер
    }
}
