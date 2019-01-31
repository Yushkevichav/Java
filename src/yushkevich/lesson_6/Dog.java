/**
 * Java 1. Lesson 6
 *
 * @author Andrey Yushkevich
 * version dated Jan 31, 2019
 **/

package yushkevich.lesson_6;

public class Dog extends Animal {

    protected final int maxRun = 500;                                           //неизменяемая переменная = максимальная длина забега
    protected int factRun;                                                      //фактическая длина бега
    protected final int maxSwim = 10;                                           //неизменяемая переменная = максимальная длина заплыва
    protected int factSwim;                                                     //фактическая длина заплыва
    protected final double maxJump = 0.5;                                       //неизменяемая переменная = максимальная высота прыжка
    protected double factJump;                                                  //фактическая высота прыжка

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
            System.out.println("Собака проплыла: " + factSwim);
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
