package yushkevich.java_2.lesson_1.HomeWork;

public class Human implements Swim, Jump, Run {

    protected int canSwimDistance;
    protected int jumpHeight;
    protected int canRunDistance;
    protected boolean onDistance = true;
    protected String name;

    public boolean setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
        return onDistance;
    }

    public Human(int canSwimDistance, int jumpHeight, int canRunDistance, String name) {
        this.canSwimDistance = canSwimDistance;
        this.jumpHeight = jumpHeight;
        this.canRunDistance = canRunDistance;
        this.name = name;
    }


    @Override
    public void swim(int canSwimDistance) {
        if (this.canSwimDistance < canSwimDistance) {
            setOnDistance(false);
        }
    }

    @Override
    public void doJump(int jumpHeight) {
        if (this.jumpHeight < jumpHeight) {
            setOnDistance(false);
        }
    }

    @Override
    public void run(int canRunDistance) {
        if (this.canRunDistance < canRunDistance) {
            setOnDistance(false);
        }
    }

}
