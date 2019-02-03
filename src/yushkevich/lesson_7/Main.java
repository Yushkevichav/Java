package yushkevich.lesson_7;

class Main {
    public static void main(String[] args) {
        new Main().masCat();
    }

    void masCat() {
        Plate plate = new Plate(10);
        Cat catArr[] = new Cat[5];
        catArr[0] = new Cat("Антоний");
        catArr[1] = new Cat("Патрокл");
        catArr[2] = new Cat("Поликарп");
        catArr[3] = new Cat("Афиноген");
        catArr[4] = new Cat("Аврелий");
        for (int i = 0; i < catArr.length; i++) {
            System.out.println("Еды в тарелке: " + plate);
            catArr[i].eat(plate);
            System.out.println("Еды осталось: " + plate);
            System.out.println("Кот по имени "
                    + catArr[i].name + " сыт:" + " - "
                    + catArr[i].satiety + "\n");
        }
    }
}

