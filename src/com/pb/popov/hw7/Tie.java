package com.pb.popov.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    public Tie() {
    }

    @Override
    public void dressMan() {
//        System.out.print("Тип: Галстук, " + getSize().getDescription() + " ("+
//                getSize().getEuroSize() + "), цена: " + getPrice()+"грн, " +
//                "цвет: " + getColor());
//    }
        System.out.print("Тип: Галстук (");

    }
}
