/**
 * Java 1. Lesson 6
 *
 * @author Andrey Yushkevich
 * version dated Jan 31, 2019
 **/

package yushkevich.lesson_6;

public class Dog extends Animal {

    private final int maxRun = 500;                                           //неизменяемая переменная = максимальная длина забега
    private int factRun;                                                      //фактическая длина бега
    private final int maxSwim = 10;                                           //неизменяемая переменная = максимальная длина заплыва
    private int factSwim;                                                     //фактическая длина заплыва
    private final double maxJump = 0.5;                                       //неизменяемая переменная = максимальная высота прыжка
    private double factJump;                                                  //фактическая высота прыжка

    public void setFactRun(int factRun){
        this.factRun = factRun;
    }

    public int getFactRun(){
        return factRun;
    }

    public void setFactSwim(int factSwim){
        this.factSwim = factSwim;
    }

    public int getFactSwim(){
        return factSwim;
    }

    public void setFactJump(double factJump){
        this.factJump = factJump;
    }

    public double getFactJump(){
        return factJump;
    }

    @Override
    public void run() {                                                         //переопределенный метод, проверяет бег
        if (factRun > maxRun) {                                                 //если фактическая длина бега > максимальной
            System.out.println("Собаки не могут так бегать");
        } else {                                                                //в остальных случаях
            System.out.println("Собака пробежала(м): " + factRun);
        }
    }

    @Override
    public void swim() {
        if (factSwim > maxSwim) {                                               //если фактическая длина заплыва > максимальной
            System.out.println("Собаки столько не плавают");
        } else {                                                                //в остальных случаях
            System.out.println("Собака проплыла(м): " + factSwim);
        }
    }

    @Override
    public void jump() {
        if (factJump > maxJump) {                                               //если фактическая высота прыжка > максимальной
            System.out.println("Собаки не умеют так прыгать");
        } else {                                                                //в остальных случаях
            System.out.println("Собака подпрыгнула на высоту(м):" + factJump);
        }
    }
}
