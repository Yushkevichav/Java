package yushkevich.lesson_7;

class Plate {
    protected int food;

    Plate(int food) {
        this.food = food;
    }

    void dicreaseFood(int food) {
        this.food -= food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }

    public int addFood() {         //добавляем 20 еды, если в тарелке закончилась еда
        return food += 10;
    }
}
