package yushkevich.lesson_7;

import java.util.Random;

class Cat {
    protected String name;
    protected int appetite = appetiteRandom(1, 10);
    protected boolean satiety = false;
    Random r = new Random();

    protected int appetiteRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + 1;
    }

    Cat(String name) {
        this.name = name;
    }

    void eat(Plate plate) {
        if (plate.food < appetite) {
            System.out.println("Коту не удалось поесть");
            return;
        }
        plate.dicreaseFood(appetite);
        satiety = true;
    }
}
