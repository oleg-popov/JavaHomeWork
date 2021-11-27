package com.pb.popov.hw10;

public class Main {
    public static void main(String[] args)  {
        NumBox<Float> numBox = new NumBox(5);
        numBox.add(1.0f);
        numBox.add(2.0f);
        numBox.add(3.3f);
        numBox.add(4.0f);
        numBox.add(5.0f);
       // numBox.add(5.0f);
        System.out.println("---------------");
        System.out.println(numBox.get(3) + "  Число по индексу");
        System.out.println("---------------");
        System.out.println(numBox.length() + "  элементов в массиве");
        System.out.println("---------------");
        System.out.println(numBox.avarage() + "  Среднее арифметическое");
        System.out.println("---------------");
        System.out.println(numBox.sum() + "  Сумма всех элементов");
        System.out.println("---------------");
        System.out.println(numBox.max() + "  Максимальный элемент");
        System.out.println("---------------");
        System.out.println();
        NumBox<Integer> numBox2 = new NumBox(5);
        numBox2.add(1);
        numBox2.add(2);
        numBox2.add(3);
        numBox2.add(4);
        numBox2.add(5);
        System.out.println("---------------");
        System.out.println(numBox2.get(3) + "  Число по индексу");
        System.out.println("---------------");
        System.out.println(numBox2.length() + "  элементов в массиве");
        System.out.println("---------------");
        System.out.println(numBox2.avarage() + "  Среднее арифметическое");
        System.out.println("---------------");
        System.out.println(numBox2.sum() + "  Сумма всех элементов");
        System.out.println("---------------");
        System.out.println(numBox2.max() + "  Максимальный элемент");
        System.out.println("---------------");
    }
}
