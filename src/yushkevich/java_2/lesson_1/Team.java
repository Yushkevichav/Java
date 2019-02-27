package yushkevich.java_2.lesson_1;

public class Team {
    protected String name;
    public Team(String name){
        this.name = name;
        Animal[] animals = {
                new Cat(5, 3),
                new Dog(5, 10, 2),
                new Duck(3, 10)
        };
    }

    public void showResults(){

    }

    public void showResultsTeam(){

    }
}
