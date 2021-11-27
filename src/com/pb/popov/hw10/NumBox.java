package com.pb.popov.hw10;

public class NumBox<T extends Number> {
    private int size;
    private T[] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    void add(T num) {
        if (size >= numbers.length) {
            try {
                throw new Exception("Массив переполнен!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(numbers[size++] = num);
    }

    public T get(int index) {

        return numbers[index];
    }

    public int length() {
        return numbers.length;
    }

    public double avarage() {
        double n = 0;
        for (T number : numbers) {
            n += number.doubleValue();
        }
        return n / 2;
    }

    public double sum() {
        double n = 0;
        for (T number : numbers) {
            n += number.doubleValue();
        }
        return n;
    }

    public T max() {
        T t = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i].doubleValue() < numbers[i + 1].doubleValue()) {
                t = numbers[i + 1];
            }
        }
        return t;
    }
}
