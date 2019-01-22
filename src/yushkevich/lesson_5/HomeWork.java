/**
 * Java 1. Lesson 5
 *
 * @author Andrey Yushkevich
 * version dated Jan 22, 2019
 **/

package yushkevich.lesson_5;

public class HomeWork {

    public static void main(String[] args) {
        new HomeWork().description();
    }

    void description() {
        Worker workersArr[] = new Worker[5];
        workersArr[0] = new Worker("Test1", "Test1", "Test1", "89991112231", 10500.50, 23);
        workersArr[1] = new Worker("Test2", "Test2", "Test2", "89991112232", 20500.50, 33);
        workersArr[2] = new Worker("Test3", "Test3", "Test3", "89991112233", 30500.50, 43);
        workersArr[3] = new Worker("Test4", "Test4", "Test4", "89991112234", 40500.50, 53);
        workersArr[4] = new Worker("Test5", "Test5", "Test5", "89991112235", 50500.50, 63);

        for (int i = 0; i < workersArr.length; i++) {
            if (workersArr[i].age > 40) {
                System.out.println("ФИО: " + workersArr[i].name + ", "
                        + "Должность: " + workersArr[i].position + ", "
                        + "Почта: " + workersArr[i].email + ", "
                        + "Телефон: " + workersArr[i].phone + ", "
                        + "ЗП: " + workersArr[i].salary + ", "
                        + "Возраст: " + workersArr[i].age);
            }
        }
    }
}

