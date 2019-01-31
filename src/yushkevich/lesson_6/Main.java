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
        new Main().runCat(250);              //заставить кота бегать с задаными параметрами
        new Main().swimCat(1);               //заставить кота плавать с задаными параметрами
        new Main().jumpCat(5);               //заставить кота прыгать с задаными параметрами
        new Main().runDog(550);              //заставить собаку бегать с задаными параметрами
        new Main().swimDog(15);              //заставить собаку плавать с задаными параметрами
        new Main().jumpDog(5);               //заставить собаку прыгать с задаными параметрами
    }

    void runCat(int a) {                        //вызов бега кота
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            cat.factRun = a;
            cat.run();
        }
    }

    void swimCat(int a) {                       //вызов плавания кота
        boolean check = false;
        if (a == 0) {
            check = true;
        } else {
            check = false;
        }
        cat.factSwim = check;
        cat.swim();
    }

    void jumpCat(int a) {                       //вызов прыжка кота
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            cat.factJump = a;
            cat.jump();
        }
    }

    void runDog(int a) {                        //вызов бега собаки
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.factRun = a;
            dog.run();
        }
    }

    void swimDog(int a) {                       //вызов плавания собаки
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.factSwim = a;
            dog.swim();
        }
    }

    void jumpDog(int a) {                       //вызов прыжка собаки
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.factJump = a;
            dog.jump();
        }
    }
}
