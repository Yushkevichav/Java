/**
 * Java 2. Lesson 1
 *
 * @author Andrey Yushkevich
 * version dated Feb 28, 2019
 */

package yushkevich.java_2.lesson_1;

public class Team {

    protected String name;  //имя команды

    protected Animal[] animals; //создан новый массив животных-участников

    public Team(String name, Animal[] animals) {
        this.name = name;
        this.animals = animals; //массив передан в конструктор
    }

    public void showResults(Team team) {    //метод, показывающий результаты прохождения полосы препятствий
        for (Animal al2 : animals) {
            System.out.println(al2.getName() + " on distance: " + al2.isOnDistance());
        }
    }

    public void showTeam() {    //метод, показывающий информацию о команде
        System.out.println("Название команды: " + name);
        for (Animal al3 : animals) {
            System.out.println("Участник: " + al3.name);
        }
    }
}
