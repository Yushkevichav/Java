package yushkevich.java_2.lesson_1.Work;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(5, 3),
                new Dog(5, 10, 2),
                new Duck(3, 10)
        };

        Obstacle[] obstacles = {new Road(8), new Water(3), new Wall(3)};

        for (Obstacle ob : obstacles) {
            for (Animal al2 : animals) {
                ob.doIt(al2);
            }
        }


        for (Animal al2 : animals) {
            System.out.println(al2.getName() + " on distance " + al2.isOnDistance());
        }

    }

}
