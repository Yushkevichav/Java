package yushkevich.lesson_6;

public abstract class Animal {

    public Animal() {
        run();
        swim();
        jump();
    }

    public abstract void run();

    public abstract void swim();

    public abstract void jump();

}
