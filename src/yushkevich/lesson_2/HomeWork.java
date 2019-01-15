package yushkevich.lesson_2;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeArr1())); //Задание 1
    }

    //Задание 1
    private static int[] makeArr1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }
}
