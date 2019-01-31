package yushkevich.lesson_6;

public class Main {

    Cat cat = new Cat();

    public static void main(String[] args) {
        new Main().runCat();
    }

    void runCat() {
        cat.factRun = 250;
        cat.run();
    }
}
