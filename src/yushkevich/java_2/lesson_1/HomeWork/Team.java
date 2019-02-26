package yushkevich.java_2.lesson_1.HomeWork;

public class Team {

    protected String name;

    public Team(String name) {
        this.name = name;
        Human[] countTeam = {
                new Human(1, 2, 3, "Aa"),
                new Human(2, 3, 4, "Bb"),
                new Human(3, 4, 5, "Cc"),
                new Human(4, 5, 6, "Dd"),
        };
    }

    public void teamInfo() {
        System.out.println("Имя команды: " + name);
    }
}
