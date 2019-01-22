/**
 * Java 1. Lesson 5
 *
 * @author Andrey Yushkevich
 * version dated Jan 22, 2019
 **/

package yushkevich.lesson_5;

public class Worker {
    protected String name;
    protected String position;
    protected String email;
    protected String phone;
    protected double salary;
    protected int age;

    protected Worker(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
}