/**
 * Java 1. Lesson 3
 *
 * @author Andrey Yushkevich
 * version dated Jan 19, 2019
 **/

package yushkevich.lesson_3;

import java.util.Scanner;
import java.util.Random;

public class HomeWork {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int range = 9;                                                               //задал переменную, которую можно использовать в рандом + объявлении игры

    public static void main(String[] args) {
        guessNumb();
        scanner.close();                                                                        //закрыл сканер при выходе из метода
    }

    //задание 1
    private static void guessNumb() {
        int counter = 3;                                                                        //задал счетчик, который в дальнейшем будет счетчиком количества попыток
        int number = random.nextInt(range + 1);                                          //задал рандомное число от 0 до 9
        while (true) {                                                                          //создал цикл, который выполняется пока условие истина
            counter--;                                                                          //с каждым входом в цикл колиичество попыток -1
            System.out.println("Угадайте число от 0 до " + range);
            int inputnumber = scanner.nextInt();                                                //задал переменную, которая принимает значение из консоли
            if (inputnumber == number) {                                                        //задал условие 1 (введенное число = загаданному)
                System.out.println("Вы выиграли");
                wantRepeat();                                                                   //вызов метода, предлагающего сыграть повторно
                break;                                                                          //выход из цикла, при выборе выхода из игры в методе wantRepeat
            } else if (inputnumber < number) {                                                  //задал условие 2 (введенное значение < загаданного)
                System.out.println("Загаданное число больше. Осталось попыток:  " + counter);   //сообщение, которое сообщает о количестве оставшихся попыток после неправильного ответа
            } else {                                                                            //задал условие 3 (во всех остальных случаях)
                System.out.println("Загаданное число меньше. Осталось попыток: " + counter);    //сообщение, которое сообщает о количестве оставшихся попыток после неправильного ответа
            }
            if (counter == 0) {                                                                 //если счетчик = 0, то вызываем метод, предлагающий сыграть заново
                wantRepeat();
                break;                                                                          //выход из цикла, при выборе выхода из игры в методе wantRepeat
            }
        }
    }

    private static void wantRepeat() {
        System.out.println("Сыграть еще раз? (1 - да, 0 - нет)");
        int ans = scanner.nextInt();                                                            //задал переменную, которая принимает значение из консоли
        if (ans == 1) {                                                                         //задал условие, если 1 - то запускаем игру заново
            guessNumb();
        } else if (ans == 0) {                                                                  //задал условие, если 0 - выходим из цикла
            System.out.println("Всего доброго");
        } else {                                                                                //задал условие, если любое другое значение - просим повторить ввод
            System.out.println("Повторите ввод");
            wantRepeat();
        }
    }
}

