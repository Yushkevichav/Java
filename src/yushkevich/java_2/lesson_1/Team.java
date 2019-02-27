package yushkevich.java_2.lesson_1;

public class Team {
    protected String name;

    Animal[] animals;

    public Team(String name){
        this.name = name;
        animals = new Animal[]{
                new Cat(5, 3),
                new Dog(5, 10, 2),
                new Duck(3, 10),
                new Duck(4, 8)
        };
    }

    public void showResults(){
        System.out.println();
    }

    public void showResultsTeam(){
        System.out.println("Первый участник: " + animals[0].name);
        System.out.println("Первый участник: " + animals[1].name);
        System.out.println("Первый участник: " + animals[2].name);
        System.out.println("Первый участник: " + animals[3].name);
    }
}
