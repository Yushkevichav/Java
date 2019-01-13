//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

package yushkevich.lesson_1.homework;

public class Part5_var1 {
    private static boolean d;                                   //задал глобальную переменную boolean

    public static void main(String[] args) {
        checkOne();
        if (checkOne() >= 0) {                                  //задал условие: если возвращаемые данные >= 0, то false
            d = false;
            System.out.println("Возвращено значение false");
        } else {                                                //в остальных случаях true
            d = true;
            System.out.println("Возвращено значение true");
        }
    }

    private static int checkOne() {
        int a = 1;
        return (a);
    }
}
