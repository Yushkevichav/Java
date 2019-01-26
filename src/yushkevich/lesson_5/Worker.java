/**
 * Java 1. Lesson 5
 *
 * @author Andrey Yushkevich
 * version dated Jan 26, 2019
 **/

package yushkevich.lesson_5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Worker(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    private void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    private void setPosition(String position) {
        if (position != null) {
            this.position = position;
        }
    }

    public String getPosition() {
        return position;
    }

    private void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    private void setPhone(String phone) {
        if (phone != null) {
            this.phone = phone;
        }
    }

    public String getPhone() {
        return phone;
    }

    private void setSalary(double salary) {
        if (salary < 5000) {
            System.out.printf("Держать рабов - не хорошо!");
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    private void setAge(int age) {
        if (age <= 14) {
            System.out.printf("Ты используешь детский труд!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}