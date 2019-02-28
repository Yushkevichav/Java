/**
 * Java 2. Lesson 1
 *
 * @author Andrey Yushkevich
 * version dated Feb 27, 2019
 */

package yushkevich.java_2.lesson_1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Obstacle[]{
                new Road(2),
                new Wall(2),
                new Water(2)
        });

        Team team = new Team("Dream Team", new Animal[]{
                new Cat(3, 3),
                new Dog(3, 3, 3),
                new Duck(3, 3)
        });

        course.doIt(team);  //заставить команду пройти полосу препятствий
        team.showTeam();    //показать информацию о команде
        System.out.println("---------------");
        team.showResults(team); //показать результаты прохождения
    }
}
