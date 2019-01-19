package yushkevich.lesson_3;

import java.util.Scanner;
import java.util.Random;

public class HomeWork {

    private static Scanner scanner = new Scanner(System.in);                                   //импорт сканера
    private static Random random = new Random();                                               //импорт рандома

    public static void main(String[] args) {
        guessNumb(9);                                                                    //передаю значение 9 в метод
        scanner.close();                                                                        //закрыл сканер при выходе из метода
    }

    //задание 1
    private static void guessNumb(int range) {                                                  //создал метод с входным параметром int
        int counter = 3;                                                                        //задал счетчик, который в дальнейшем будет считать количество попыток
        int number = random.nextInt(10);                                                 //задал рандомное число от 0 до 9
        while (true) {                                                                          //создал цикл, который выполняется пока условие истина
            counter--;                                                                          //с каждым входом в цикл колиичество попыток -1
            System.out.println("Угадайте число от 0 до " + range);                              //сообщение, которое берет значение, передаваемое в метод
            int inputnumber = scanner.nextInt();                                                //задапеременную, которая принимает значение из консоли
            if (inputnumber == number) {                                                        //задал условие 1
                System.out.println("Вы выиграли");
            }
            if (inputnumber < number) {                                                         //задал условие 2
                System.out.println("Загаданное число больше. Осталось попыток:  " + counter);   //сообщение, которое сообщает о количестве оставшихся попыток после неправильного ответа
            } else {
                System.out.println("Загаданное число меньше. Осталось попыток: " + counter);    //сообщение, которое сообщает о количестве оставшихся попыток после неправильного ответа
            }
            if (counter == 0) {                                                                 //задал условие, если значение счетчика опыстилось до 0, то предлагаем заново войти в цикл или выйти из него
                System.out.println("Сыграть еще раз? (1 - да, 0 - нет)");
                int ans = scanner.nextInt();
                if (ans == 1) {                                                                 //задал условие, если 1 - то звново входим в цикл
                    counter = 3;                                                                //сбрасываем значение счетчика на 3
                    continue;
                } else if (ans == 0) {                                                          //если 0 - выходим из цикла
                    System.out.println("Досвидания");
                    return;
                } else {                                                                        //если любое другое значение - выходим из цикла
                    System.out.println("Ошибка ввода");
                    return;
                }
            }
        }
    }
}
