package com.pb.popov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(101);
        //System.out.println(n);
        System.out.println("Угадайте число в диапазоне от 0 до 100!");
        System.out.println("Для принудительно завершения программы, введите - 101");
        int count = 1;
        while (true){
            int x = scanner.nextInt();
            if (x == 101){
                System.out.println("Игра завершена!");
                break;
            }
            if (x >= 0 && x < 102) {
                if (n > x) {
                    System.out.println("Загаданное число больше " + x + ". Попробуйте еще раз!");
                    count++;
                } else if (n < x) {
                    System.out.println("Загаданное число меньше " + x + ". Попробуйте еще раз!");
                    count++;
                } else {
                    System.out.println("Поздравляем, вы угадали загаданное число с " + count + " попыток!");
                    break;
                }
            }else {
                System.out.println("Введённое число не соответствует условию. Повторите попытку.");
            }

        }
    }
}
