package com.pb.popov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1;
        int operand2;
        for (int i = 0; i < 4; i++) {
            System.out.print("Введите значение operand1: ");
            operand1 = scanner.nextInt();
            System.out.print("Введите значение operand2: ");
            operand2 = scanner.nextInt();
            System.out.print("Введите знак арифметической операции: ");
            String sign = scanner.next();

            switch (sign) {
                case "+":
                    System.out.println("operand1 + operand2 = " + (operand1 + operand2));
                    break;
                case "-":
                    System.out.println("operand1 - operand2 = " + (operand1 - operand2));
                    break;
                case "*":
                    System.out.println("operand1 * operand2 = " + (operand1 * operand2));
                    break;
                case "/":
                    if (operand2 == 0) {
                        System.out.println("-----На ноль делить нельзя!!!-----");
                    } else {
                        System.out.println("operand1 / operand2 = " + (operand1 / operand2));
                    }
                    break;
            }
        }
    }
}
