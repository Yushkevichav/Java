package yushkevich.java_2.lesson_1;

public class Animal implements Run {

    protected String name;
    private int canRunDistance;

    private boolean onDistance = true;

    public boolean isOnDistance() {
        return onDistance;
    }


    public Animal setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
        return this;
    }


    public Animal(int canRunDistance, String name) {
        this.canRunDistance = canRunDistance;
        this.name = name;
    }


    @Override
    public void run(int dist) {
        if (this.canRunDistance < dist) {
            this.onDistance = false;
        }
    }

    public String getName() {
        return name;
    }


}
