/**
 * Java 1. Lesson 6
 *
 * @author Andrey Yushkevich
 * version dated Jan 31, 2019
 **/

package yushkevich.lesson_6;

public class Cat extends Animal {

    private final int maxRun = 200;                                           //неизменяемая переменная = максимальная длина забега
    private int factRun;                                                      //фактическая длина бега
    private final boolean maxSwim = true;                                     //неизменяемая булева переменная, т.к. наш кот не умеет плавать - выболняет роль чекера заплыва
    private boolean factSwim;                                                 //фактическая длина заплыва
    private final int maxJump = 2;                                            //неизменяемая переменная = максимальная высота прыжка
    private int factJump;                                                     //фактическая высота прыжка

    public void setFactRun(int factRun){
        this.factRun = factRun;
    }

    public int getFactRun(){
        return factRun;
    }

    public void setFactSwim(boolean factSwim){
        this.factSwim = factSwim;
    }

    public boolean getFactSwim(){
        return factSwim;
    }

    public void setFactJump(int factJump){
        this.factJump = factJump;
    }

    public int getFactJump(){
        return factJump;
    }

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
