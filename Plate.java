public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("тарелка: " + food);
    }

    public void decreaseFood(int amount) {
        if (food >= amount) { // Уменьшаем количество еды в тарелке, если есть достаточно еды
            food -= amount;
        } else {
            System.out.println("Недостаточно еды в тарелке");
        }
    }

    public void addFood(int amount) {
        food += amount; // Метод для добавления еды в тарелку
    }

    public int getFood() {
        return food;
    }
}
