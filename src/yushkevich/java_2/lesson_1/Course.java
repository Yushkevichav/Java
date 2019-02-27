package yushkevich.java_2.lesson_1;

public class Course {

    protected Obstacle[] obstacles;

    public Course() {
        obstacles = new Obstacle[]{new Road(8), new Water(3), new Wall(3)};
    }

    public void doIt(Team s) {
        for (Obstacle ob : obstacles) {
            for (Animal al2 : s.animals) {
                ob.doIt(al2);
            }
        }
    }
}

