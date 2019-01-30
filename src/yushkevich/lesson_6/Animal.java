package yushkevich.lesson_6;

public abstract class Animal {

    public Animal() {
        run();
        sweem();
        jump();
    }

    public abstract void run();
    public abstract void sweem();
    public abstract void jump();

}
