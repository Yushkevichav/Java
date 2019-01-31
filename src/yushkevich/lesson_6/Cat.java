package yushkevich.lesson_6;

public class Cat extends Animal {

    protected final int maxRun = 200;
    protected int factRun;
    protected final boolean maxSwim = true;
    protected boolean factSwim;
    protected final int maxJump = 2;
    protected int factJump;

    @Override
    public void run() {
        if (factRun > maxRun) {
            System.out.println("Коты не могут так бегать");
        } else {
            System.out.println("Кот пробежал(м): " + factRun);
        }
    }

    @Override
    public void swim() {
        if (factSwim == maxSwim) {
            System.out.println("Этот кот не умеет плавать");
        } else {
            System.out.println("Очень странный кот");
        }
    }

    @Override
    public void jump() {
        if (factJump > maxJump) {
            System.out.println("Коты не умеют так прыгать");
        } else {
            System.out.println("Кот подпрыгнул на высоту(м):" + factJump);
        }
    }
}
