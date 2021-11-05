package com.pb.popov.hw6;

import com.pb.popov.hw6.animal.Animal;
import com.pb.popov.hw6.animal.Cat;
import com.pb.popov.hw6.animal.Dog;
import com.pb.popov.hw6.animal.Horse;
import com.pb.popov.hw6.veterinarian.Veterinarian;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Veterinarian veterinarian = new Veterinarian();
        Animal dog = new Dog("косточка", "будка", "Бобик");
        Animal cat = new Cat("сметана", "дом", "серый", "сфинкс");
        Animal horse = new Horse("овёс", "поле", 200, 1.75);
        Animal[] animals = new Animal[]{dog, cat, horse};

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
        System.out.println();

        dog.eat();
        dog.sleep();
        dog.makeNoice();
        System.out.println();

        cat.eat();
        cat.sleep();
        cat.makeNoice();
        System.out.println();

        horse.eat();
        horse.sleep();
        horse.makeNoice();
    }
}
