package yushkevich.java_2.lesson_1.Work;

public class Duck extends Animal implements Swim {
    int canSwimDistance;

    public Duck(int canRunDistance, int canSwimDistance) {
        super(canRunDistance, "duck");
        this.canSwimDistance = canSwimDistance;

    }

    @Override
    public void swim(int distance) {
        if (this.canSwimDistance < distance) {
            setOnDistance(false);
        }
    }
}
