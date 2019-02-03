package yushkevich.lesson_7;

class Cat {
    private String name;
    private int appetite;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate) {
        plate.dicreaseFood(appetite);
    }
}
