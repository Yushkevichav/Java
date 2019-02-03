package yushkevich.lesson_7;

class Main {
    public static void main(String[] args) {
        new Main().masCat();
    }

    void masCat() {
        Cat cat = new Cat("Barsik");
        Plate plate = new Plate(5);
        System.out.println("Еды в тарелке: " + plate);
        cat.eat(plate);
        System.out.println("Еды осталось: " + plate);
        System.out.printf("Кот сыт: " + cat.satiety);
    }
}

