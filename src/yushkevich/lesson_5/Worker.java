package yushkevich.lesson_5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public static void main(String[] args) {
    }

    private Worker(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    private static void description() {
        Worker workersArr[] = new Worker[5];
        workersArr[0] = new Worker("Test1", "Test1", "Test1", "89991112231", 10500.50, 23);
        workersArr[1] = new Worker("Test2", "Test2", "Test2", "89991112232", 20500.50, 33);
        workersArr[2] = new Worker("Test3", "Test3", "Test3", "89991112233", 30500.50, 43);
        workersArr[3] = new Worker("Test4", "Test4", "Test4", "89991112234", 40500.50, 53);
        workersArr[4] = new Worker("Test5", "Test5", "Test5", "89991112235", 50500.50, 63);

        for (int i = 0; i < workersArr.length; i++) {
        }
    }
}


