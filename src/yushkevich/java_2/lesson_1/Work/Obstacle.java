package yushkevich.java_2.lesson_1.Work;

public abstract class Obstacle {
    protected final int size;

    protected Obstacle(int size) {
        this.size = size;
    }


    public abstract void doIt(Animal a);
}
