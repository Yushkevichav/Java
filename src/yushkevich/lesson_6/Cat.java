package yushkevich.lesson_6;

public class Cat extends Animal {

    private final int maxRun = 200;
    private int factRun;
    private final boolean maxSwim = true;
    private boolean factSwim;
    private final int maxJump = 2;
    private int factJump;

    private void setFactRun() {
        this.factRun = factRun;
    }

    public int getFactRun(){
        return factRun;
    }

    private void setFactSwim() {
        this.factSwim = factSwim;
    }

    public boolean getFactSwim(){
        return factSwim;
    }

    private void setFactJump() {
        this.factJump = factJump;
    }

    public int getFactJump(){
        return factJump;
    }

    @Override
    public void run() {
        if (factRun > maxRun) {
            System.out.println("Кот не может так бегать");
        }else {
            System.out.println("Кот побежал");
        }
    }

    @Override
    public void swim() {
        if (factSwim != maxSwim) {
            System.out.println("Этот кот не умеет плавать");
        }else {
            System.out.println("Очень странный кот");
        }
    }

    @Override
    public void jump() {
        if (factJump > maxJump) {
            System.out.println("Кот не может так прыгать");
        }else {
            System.out.println("Кот прыгнул");
        }
    }

    public Cat () {
        this.factRun = factRun;
        this.factSwim = factSwim;
        this.factJump = factJump;
    }
}
