/**
 * Java 1. Lesson 6
 *
 * @author Andrey Yushkevich
 * version dated Jan 31, 2019
 **/

package yushkevich.lesson_6;

public class Cat extends Animal {

    protected final int maxRun = 200;                                           //неизменяемая переменная = максимальная длина забега
    protected int factRun;                                                      //фактическая длина бега
    protected final boolean maxSwim = true;                                     //неизменяемая булева переменная, т.к. наш кот не умеет плавать - выболняет роль чекера заплыва
    protected boolean factSwim;                                                 //фактическая длина заплыва
    protected final int maxJump = 2;                                            //неизменяемая переменная = максимальная высота прыжка
    protected int factJump;                                                     //фактическая высота прыжка

    @Override
    public void run() {                                                         //переопределенный метод, проверяет бег
        if (factRun > maxRun) {                                                 //если фактическая длина бега > максимальной
            System.out.println("Коты не могут так бегать");
        } else {                                                                //в остальных случаях
            System.out.println("Кот пробежал(м): " + factRun);
        }
    }

    @Override
    public void swim() {                                                        //переопределенный метод, проверяет плавание
        if (factSwim == maxSwim) {                                              //если фактический результат true (
            System.out.println("Этот кот не умеет плавать");
        } else {                                                                //если кот все же поплыл
            System.out.println("Очень странный кот. Говорил не умеет плавать");
        }
    }

    @Override
    public void jump() {                                                        //переопределенный метод, проверяет прыжок
        if (factJump > maxJump) {
            System.out.println("Коты не умеют так прыгать");                    //если фактическая высота прыжка > максимальной
        } else {
            System.out.println("Кот подпрыгнул на высоту(м):" + factJump);      //в остальных случаях
        }
    }
}
