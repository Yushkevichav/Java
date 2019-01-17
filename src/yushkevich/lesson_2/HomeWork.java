/**
 * Java 1. Lesson 2
 *
 * @author Andrey Yushkevich
 * version dated Jan 16, 2019
 **/

package yushkevich.lesson_2;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeArr1()));            //Задание 1
        System.out.println(Arrays.toString(makeArr2()));            //Задание 2
        System.out.println(Arrays.toString(makeArr3()));            //Задание 3
        makeArr4();                                                 //Задание 4
    }

    //Задание 1
    private static int[] makeArr1() {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};                 //создал и проинициализровал массив
        for (int i = 0; i < arr.length; i++) {                      //задал переменную i = 0 равную индексу первого элемента, условие выполнения - i меньше длины массива, приращение i + 1 на каждом шаге итерации
            if (arr[i] == 1) {                                      //задал условие - если значение в массиве = 1, то приравниваем его к 0
                arr[i] = 0;
            } else
                arr[i] = 1;                                         //в остальных случаях приравниваем к 1 (т.е. любое число !=1 будер приравняно к 1
        }
        return arr;
    }

    //Задание 2
    private static int[] makeArr2() {
        int arr[] = new int[8];                                     //создал новый массив из 8 элементов
        for (int i = 0; i < arr.length; i++) {                      //задал переменную i = 0 равную индексу первого элемента, условие выполнения - i меньше длины массива, приращение i + 1 на каждом шаге итерации
            arr[i] = i * 3;                                         //проинициализировал значения массива (i * 3, т.е. первое значение = 0 * 3, второе 1 * 3, третье 2 * 3 и т.д.)
        }
        return arr;
    }

    //Задание 3
    private static int[] makeArr3() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};           //создал и проинициализровал массив
        for (int i = 0; i < arr.length; i++) {                       //задал переменную i = 0 равную индексу первого элемента, условие выполнения - i меньше длины массива, приращение i + 1 на каждом шаге итерации
            if (arr[i] >= 0 && arr[i] <= 6) {                        //задал условие - если значения в массиве >=0 и <= 6, то все такие значения умножаем на 2
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    //Задание 4
    private static void makeArr4() {
        int arr[][] = new int[5][5];                                 //создал двумерный массив 5х5
        for (int i = 0; i < arr.length; i++) {                       //задал первый цикл перебора для первого одномерного массива
            for (int g = 0; g < arr.length; g++) {                   //задал второй цикл перебора для второго одномерного массива
                if (i == g) {                                        //проинициализировал значения массива по диагонали слева - направо
                    arr[i][g] = 1;
                }
                System.out.print(arr[i][g] + " ");
            }
            System.out.println();
        }
    }
}
