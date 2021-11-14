package com.pb.popov.hw7;

public  class Tshirt extends Clothes implements ManClothes,WomenClothes{
    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.print("Тип: Мужская футболка (");
    }

    @Override
    public void dressWomen() {
        System.out.print("Тип: Женская футболка (");
    }

}
