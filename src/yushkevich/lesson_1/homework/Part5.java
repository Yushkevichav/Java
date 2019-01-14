//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

package yushkevich.lesson_1.homework;

public class Part5 {
    public static void main(String[] args) {
        System.out.println(checkOne(1));
    }

    private static boolean checkOne(int a) {
        if (a >= 0) {                                               //задал условие: если возвращаемые данные >= 0, то false
            return true;
        } else {                                                    //в остальных случаях true
            return false;
        }
    }
}
