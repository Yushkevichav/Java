//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

package yushkevich.lesson_1.homework;

public class Part6_var2 {
    public static void main(String[] args) {
        checkOne("Андрей");                      //вызываю метод checkOne с заданными параметрами
    }

    private static void checkOne(String a) {
        System.out.println("Привет, " + a + "!");   //вывожу на консоль
    }
}
