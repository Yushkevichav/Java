//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

package yushkevich.lesson_1.homework;

public class Part6 {
    public static void main(String[] args) {
        System.out.println("Привет, " + checkOne() + "!");
    }

    private static String checkOne() {
        return ("Андрей");
    }
}
