package com.pb.popov.hw7;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.print("Тип: Юбка (");
    }
}
