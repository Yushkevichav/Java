package yushkevich.java_2.lesson_1;

public class Human implements Swim, Jump, Run {

    private int canSwimDistance;
    private int jumpHeight;
    private int canRunDistance;
    private boolean onDistance = true;

    public boolean setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
        return onDistance;
    }

    public Human(int canSwimDistance, int jumpHeight, int canRunDistance) {
        this.canSwimDistance = canSwimDistance;
        this.jumpHeight = jumpHeight;
        this.canRunDistance = canRunDistance;
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
