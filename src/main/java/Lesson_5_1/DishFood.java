package Lesson_5_1;

public class DishFood {
    private int countFood;

    public DishFood(int countFood) {
        this.countFood = countFood;
    }

    public void addFood(int food) {
        countFood += food;
    }

    public void deleteFood(int food) {
        countFood -= food;
    }

    public int getCountFood() {
        return countFood;
    }
}
