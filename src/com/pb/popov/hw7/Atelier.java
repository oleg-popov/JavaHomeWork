package com.pb.popov.hw7;
public class Atelier {
    public static void main(String[] args) {
        Clothes tshirt = new Tshirt(Size.XXS, 400, "черный)");
        Clothes pants = new Pants(Size.XS, 550, "серый)");
        Clothes skirt = new Skirt(Size.S, 680, "синий)");
        Clothes tie = new Tie(Size.L, 300, "красный)");
        Clothes tie2 = new Tie(Size.M, 200, "желтый)");
        Clothes skirt2 = new Skirt(Size.XS, 750, "черный)");
        Clothes tshirt2 = new Tshirt(Size.M, 470, "коричневый)");

        Clothes[] clothes = {tshirt, pants, skirt, tie,tie2,skirt2,tshirt2};
        dressMan(clothes);
        System.out.println();
        dressWomen(clothes);
    }
    public static void dressMan(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
                System.out.println(clothe);
            }
        }
    }
    public static void dressWomen(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
                System.out.println(clothe);
            }
        }
    }
}
