package com.pb.popov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите целое число: ");
            int n = scanner.nextInt();
            if (n >= 0 && n <= 14) {
                System.out.println("Заданное число попадает в первый промежуток: [0-14]\n");
            } else if (n >= 15 && n <= 35) {
                System.out.println("Заданное число попадает во второй промежуток: [15-35]\n");
            } else if (n >= 36 && n <= 50) {
                System.out.println("Заданное число попадает в третий промежуток: [36-50]\n");
            } else if (n >= 51 && n <= 100) {
                System.out.println("Заданное число попадает в четвёртый промежуток: [51-100]\n");
            } else {
                System.out.println("Заданное число не попадает в один из имеющихся промежутков: [0 -14] [15 - 35] [36 - 50] [51 - 100]");
                break;
            }
        }
    }
}
