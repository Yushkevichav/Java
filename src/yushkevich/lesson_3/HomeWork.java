package yushkevich.lesson_3;

import java.util.Scanner;
import java.util.Random;

public class HomeWork {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        guessNumb(9);
        scanner.close();
    }

    private static void guessNumb(int range) {
        int counter = 3;
        int number = random.nextInt(10);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int inputnumber = scanner.nextInt();
            if (inputnumber == number) {
                System.out.println("Вы выиграли");
                System.out.println("Сыграть еще раз? (1 - да, 0 - нет)");
                int ans = scanner.nextInt();
                if (ans == 1) {
                    continue;
                } else if (ans == 0) {
                    System.out.println("Досвидания");
                    return;
                } else {
                    System.out.println("Ошибка ввода");
                    return;
                }
            }
            counter--;
            if (inputnumber < number) {
                System.out.println("Загаданное число больше. Осталось попыток:  " + counter);
                if (counter == 0) {
                    System.out.println("Вы проиграли");
                    return;
                }
            } else {
                System.out.println("Загаданное число меньше. Осталось попыток: " + counter);
                if (counter == 0) {
                    System.out.println("Вы проиграли");
                    return;
                }
            }
        }
    }
}
