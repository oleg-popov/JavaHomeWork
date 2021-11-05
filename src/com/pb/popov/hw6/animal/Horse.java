package com.pb.popov.hw6.animal;

public class Horse extends Animal{
private int weight;
private double height;

    public Horse(String food, String location, int weight, double height) {
        super(food, location);
        this.weight = weight;
        this.height = height;
    }
    @Override
    public void makeNoice() {
        System.out.println("Лошадка говорит игого!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадка кушает " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Лошадка спит!");
    }

    @Override
    public String toString() {
        return "Horse: " + "вес = " + weight + ", рост = " + height + ", Еда = " + getFood() + ", локация = "+ getLocation();
    }
}
