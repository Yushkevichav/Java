/**
 * Java 2. Lesson 1
 *
 * @author Andrey Yushkevich
 * version dated Feb 27, 2019
 */

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
