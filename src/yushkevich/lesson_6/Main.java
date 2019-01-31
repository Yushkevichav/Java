package yushkevich.lesson_6;

public class Main {

    Cat cat = new Cat();
    Dog dog = new Dog();

    public static void main(String[] args) {
        new Main().runCat(250);
        new Main().swimCat(1);
        new Main().jumpCat(5);
        new Main().runDog(550);
        new Main().swimDog(15);
        new Main().jumpDog(5);
    }

    void runCat(int a) {
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            cat.factRun = a;
            cat.run();
        }
    }

    void swimCat(int a) {
        boolean check = false;
        if (a == 0) {
            check = true;
        } else {
            check = false;
        }
        cat.factSwim = check;
        cat.swim();
    }

    void jumpCat(int a) {
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            cat.factJump = a;
            cat.jump();
        }
    }

    void runDog(int a) {
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.factRun = a;
            dog.run();
        }
    }

    void swimDog(int a) {
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.factSwim = a;
            dog.swim();
        }
    }

    void jumpDog(int a) {
        if (a < 0) {
            System.out.println("Ошибка");
        } else {
            dog.factJump = a;
            dog.jump();
        }
    }
}
