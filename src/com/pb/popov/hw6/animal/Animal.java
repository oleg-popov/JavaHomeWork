package com.pb.popov.hw6.animal;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal() {
    }


    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoice(){
        System.out.println("шумит");
    }
    public void eat(){
        System.out.println("животное кушает" + food);
    }
    public void   sleep(){
        System.out.println("животное спит!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
