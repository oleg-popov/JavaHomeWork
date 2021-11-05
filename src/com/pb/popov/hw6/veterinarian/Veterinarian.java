package com.pb.popov.hw6.veterinarian;

import com.pb.popov.hw6.animal.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Veterinarian {

    public Object treatAnimal(Animal animal) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class clazz = Class.forName("com.pb.popov.hw6.veterinarian.Veterinarian");
        Constructor constructor = clazz.getConstructor(new Class[]{});
        Object o = constructor.newInstance();
        System.out.println(Arrays.toString(new Animal[]{animal}));
        return o;
    }
    //       System.out.println(animal.getFood() + " " + animal.getLocation());
}
