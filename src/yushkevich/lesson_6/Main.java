package yushkevich.lesson_6;

public class Main {

    Cat cat = new Cat();

    public static void main(String[] args) {
        new Main().runCat(200);
        new Main().swimCat(1);
        new Main().jumpCat(200);

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
}
