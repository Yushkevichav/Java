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
}
