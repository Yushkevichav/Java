package yushkevich.java_2.lesson_1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Team team = new Team("Efd");
        course.doIt(team);
        team.showTeam();
        System.out.println("---------------");
        team.showResults(team);
    }
}
