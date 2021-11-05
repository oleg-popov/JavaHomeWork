package com.pb.popov.hw6.animal;

public class Cat extends Animal{
private String color;
private String type;

    public String getType() {
        return type;
    }

    public Cat(String food, String location, String color, String type) {
        super(food, location);
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void makeNoice() {
        System.out.println("Cat мяукает!");
    }

    @Override
    public void eat() {
        System.out.println("Cat кушает " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Cat спит!");
    }

    @Override
    public String toString() {
        return "Cat: "+ "порода = " + type  + ", Цвет = " + color + ", " + "Еда = " + getFood() +", " + "Проживает = " + getLocation();
    }
}
