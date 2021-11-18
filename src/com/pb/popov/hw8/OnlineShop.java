package com.pb.popov.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо зарегестрироваться!");

        System.out.println("Введите логин (длинна должна быть от 5 до 20 символов)");
        System.out.println("Введите логин для регистрации");
        String login = scanner.nextLine();
        System.out.println("Введите пароль для регистрации");
        String password = scanner.nextLine();
        System.out.println("Введите пароль повторно");
        String confirmPassword = scanner.nextLine();

        Auth auth = new Auth(login, password);
        while (true) {
            try {
                auth.signUp(login, password, confirmPassword);
            } catch (WrongLoginException | WrongPasswordException e) {
                e.getMessage();
                break;
            }
            try {
                auth.signIn(login, password);
                break;
            } catch (WrongLoginException e) {
                e.getMessage();

            }
        }
    }
}

