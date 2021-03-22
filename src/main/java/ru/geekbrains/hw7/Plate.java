package ru.geekbrains.hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public Plate() {
        this.food = 0;
    }

    public void decreaseFood(int n) {
        if (food == 0) {
            System.out.println("Миска пустая :-(");
        } else if (n > food) {
            food -= food;
        } else if (n <= food) {
            food -= n;
        }
    }

    public void addFood(int n) {
        if (n <= 0) {
            System.out.println("В миску нечего добавить");
        } else {
            food += food;
        }

    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("Еды в миске: " + food);
    }
}
