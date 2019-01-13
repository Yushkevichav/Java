//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

package yushkevich.lesson_1.homework;

public class Part5_var2 {
    public static void main(String[] args) {
        checkOne(1);
    }

    private static void checkOne(int a) {
        boolean d;                                                  //задал переменную boolean
        if (a >= 0) {                                               //задал условие: если возвращаемые данные >= 0, то false
            d = false;
            System.out.println("Возвращено значение false");
        } else {                                                    //в остальных случаях true
            d = true;
            System.out.println("Возвращено значение true");
        }
    }
}
