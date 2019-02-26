package yushkevich.java_2.lesson_1.HomeWork;

public class Team {

    protected String name;
    Human[] countTeam;

    public Team(String name, Human[] countTeam) {
        this.name = name;
        this.countTeam = new Human[]{
                new Human(1, 2, 3, "Aa"),
                new Human(2, 3, 4, "Bb"),
                new Human(3, 4, 5, "Cc"),
                new Human(4, 5, 6, "Dd"),
        };
        this.countTeam = countTeam;
    }

    public void teamInfo() {
        System.out.println("Имя команды: " + name);
        System.out.println(countTeam[0].name);
    }
}
