/**
 * Java 1. Lesson 7
 *
 * @author Andrey Yushkevich
 * version dated Feb 03, 2019
 **/

package yushkevich.lesson_7;

class Plate {
    protected int food;

    Plate(int food) {
        this.food = food;
        if (food <= 0) addFood();
    }

    void dicreaseFood(int _food) {
        this.food -= _food;
        if (food <= 0) {
            System.out.println("Кот не поел, добавим еды в тарелку");
            addFood();
        }
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }

    public int addFood() {         //добавляем еды, если в тарелке она закончилась
        return food += 10;
    }
}
