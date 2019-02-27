package yushkevich.java_2.lesson_1;

public class Team {
    protected String name;

    protected Animal[] animals;

    public Team(String name) {
        this.name = name;
        animals = new Animal[]{
                new Cat(1, 1),
                new Dog(1, 1, 1),
                new Duck(1, 1),
        };
    }

    public void showResults(Team team) {
        for (Animal al2 : animals) {
            System.out.println(al2.getName() + " on distance: " + al2.isOnDistance());
        }
    }

    public void showTeam() {
        System.out.println("Название команды: " + name);
        for (Animal al3 : animals) {
            System.out.println("Участник: " + al3.name);
        }
    }
}
