package yushkevich.lesson_6;

public class Dog extends Animal {

    protected final int maxRun = 500;
    protected int factRun;
    protected final int maxSwim = 10;
    protected int factSwim;
    protected final double maxJump = 0.5;
    protected double factJump;

    @Override
    public void run() {
        if (factRun > maxRun) {
            System.out.println("Собаки не могут так бегать");
        } else {
            System.out.println("Собака пробежала(м): " + factRun);
        }
    }

    @Override
    public void swim() {
        if (factSwim > maxSwim) {
            System.out.println("Собаки столько не плавают");
        } else {
            System.out.println("Собака проплыла: " + factSwim);
        }
    }

    @Override
    public void jump() {
        if (factJump > maxJump) {
            System.out.println("Собаки не умеют так прыгать");
        } else {
            System.out.println("Собака подпрыгнула на высоту(м):" + factJump);
        }
    }
}
