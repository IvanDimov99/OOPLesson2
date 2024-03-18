public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Барсик", 5), new Cat("Мурзик", 10) };
        Plate plate = new Plate(15);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " Сыт: " + cat.isSatiety());
        }

        plate.info();
    }
}