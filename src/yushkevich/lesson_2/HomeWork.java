/**
 * Java 1. Lesson 2
 *
 * @author Andrey Yushkevich
 * version dated Jan 15, 2019
 **/

package yushkevich.lesson_2;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeArr1())); //Задание 1
        System.out.println(Arrays.toString(makeArr2())); //Задание 2
        //System.out.println(Arrays.toString(makeArr3())); //Задание 2
    }

    //Задание 1
    private static int[] makeArr1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        return arr;
    }

    //Задание 2
    private static int[] makeArr2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        return arr;
    }
}
