package ru.geekbrains.hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite && !satiety) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println("Котик (^˵◕ω◕˵^) " + name + " съел из миски " + appetite);
        } else if (satiety) {
            System.out.println("Котик (^˵◕ω◕˵^) " + name + " сытый");
        } else if (p.getFood() < appetite) {
            System.out.println("Котик (^˵◕ω◕˵^) " + name + " не желает есть так мало.");
        }
    }

}
