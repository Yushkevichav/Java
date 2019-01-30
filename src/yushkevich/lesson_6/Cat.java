package yushkevich.lesson_6;

public class Cat extends Animal {

    final private int maxRun = 200;
    public int factRun;

    public Cat() {
    }

    @Override
    public void run() {
        if (factRun > maxRun) {
            System.out.println("Кот не может так бегать");
        }
    }

    @Override
    public void swim() {
    }

    @Override
    public void jump() {
    }
}
