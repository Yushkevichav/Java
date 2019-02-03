package yushkevich.lesson_7;

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10);
        Plate plate = new Plate(5);
        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);
    }
}

