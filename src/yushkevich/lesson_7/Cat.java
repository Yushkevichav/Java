package yushkevich.lesson_7;

import java.util.Random;

class Cat {
    protected String name;                                  //имя кота
    protected int appetite = appetiteRandom(1, 10);           //рандом аппетит для каждого кота (от 1 до 10)
    protected boolean satiety = false;                      //сытость

    private int appetiteRandom(int min, int max) {          //метод для генерации аппетита кота
        Random r = new Random();
        return r.nextInt(max - min) + 1;
    }

    public Cat(String name) {                               //описание кота
        this.name = name;
    }

    void eat(Plate plate) {                                 //метод, заставляющий кота есть
        if (plate.food < appetite) {                        //если еды в тарелке меньше, чем аппетит кота, то коту поесть не удалось
            System.out.println("Коту не удалось поесть, добавим еды");
            plate.addFood();                                //и добавляем еды котам
        } else plate.dicreaseFood(appetite);                //в остальных случаях кот ест
        satiety = true;                                     //после еды сытость = true
    }
}
