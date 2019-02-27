/**
 * Java 2. Lesson 1
 *
 * @author Andrey Yushkevich
 * version dated Feb 27, 2019
 */

package yushkevich.java_2.lesson_1;

public class Course {

    protected Obstacle[] obstacles; //создан массив препятствий

    public Course() {
        obstacles = new Obstacle[]{new Road(8), new Water(3), new Wall(3)}; //массив проинициализирован препятствиями
    }

    public void doIt(Team s) {  //метод, заставляющий команду проходить полосу препятствий
        for (Obstacle ob : obstacles) {
            for (Animal al2 : s.animals) {
                ob.doIt(al2);
            }
        }
    }
}

