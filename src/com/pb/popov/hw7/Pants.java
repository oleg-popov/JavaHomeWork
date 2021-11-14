package com.pb.popov.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes{
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressMan() {
        System.out.print("Тип: Мужские штаны (");
    }

    @Override
    public void dressWomen() {
        System.out.print("Тип: Женские штаны (");
    }
}
