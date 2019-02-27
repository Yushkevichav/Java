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
        Team team = new Team("Dream team");
        course.doIt(team);  //заставить команду пройти полосу препятствий
        team.showTeam();    //показать информацию о команде
        System.out.println("---------------");
        team.showResults(team); //показать результаты прохождения
    }
}
