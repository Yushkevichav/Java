/**
 * Java 1. Lesson 6
 *
 * @author Andrey Yushkevich
 * version dated Jan 31, 2019
 **/

package yushkevich.lesson_6;

public class Main {

    Cat cat = new Cat();                        //новый объект Кот
    Dog dog = new Dog();                        //новый объект Собака

    public static void main(String[] args) {
        new Main().runCat(200);              //заставить кота бегать с задаными параметрами
        new Main().swimCat(1);               //заставить кота плавать с задаными параметрами
        new Main().jumpCat(1);               //заставить кота прыгать с задаными параметрами
        new Main().runDog(350);              //заставить собаку бегать с задаными параметрами
        new Main().swimDog(5);               //заставить собаку плавать с задаными параметрами
        new Main().jumpDog(0.1);             //заставить собаку прыгать с задаными параметрами
    }

    void runCat(int a) {                        //вызов бега кота
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            cat.setFactRun(a);
            cat.run();
        }
    }

    void swimCat(int a) {                       //вызов плавания кота
        boolean check;
        if (a <= 0) {
            check = true;
        } else {
            check = false;
        }
        cat.setFactSwim(check);
        cat.swim();
    }

    void jumpCat(int a) {                       //вызов прыжка кота
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            cat.setFactJump(a);
            cat.jump();
        }
    }

    void runDog(int a) {                        //вызов бега собаки
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.setFactRun(a);
            dog.run();
        }
    }

    void swimDog(int a) {                       //вызов плавания собаки
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.setFactSwim(a);
            dog.swim();
        }
    }

    void jumpDog(double a) {                    //вызов прыжка собаки
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.setFactJump(a);
            dog.jump();
        }
    }
}
