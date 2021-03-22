package ru.geekbrains.hw7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(3);
        plate.addFood(6);

        Cat cat[] = new Cat[5];
        for (int i = 0; i < cat.length; i++) {
            cat[i] = new Cat("Котик_" + (i + 1), (int) (1 + Math.random() * 5));
        }
        for (Cat itVal : cat) {
            itVal.eat(plate);
            plate.info();
        }
    }
}
