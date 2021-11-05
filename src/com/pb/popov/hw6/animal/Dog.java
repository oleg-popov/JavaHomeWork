package com.pb.popov.hw6.animal;

import java.util.Objects;

public class Dog extends Animal {
    private String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void makeNoice() {
        System.out.println("Dog гавкает!");
    }

    @Override
    public void eat() {
        System.out.println("Dog кушает " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Dog спит!");
    }

    @Override
    public String toString() {
        return "Dog: " + "Имя = " + name + ", " + "Еда = " + getFood() +", " + "Проживает = " + getLocation() ;
    }
}
