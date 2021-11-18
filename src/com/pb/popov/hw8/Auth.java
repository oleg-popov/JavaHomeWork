package com.pb.popov.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Auth extends Exception {
    Scanner scanner = new Scanner(System.in);
    private String login;
    private String password;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Auth() {
    }
    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!Pattern.matches("[a-zA-Z0-9]{5,20}", login)) {
            throw new WrongLoginException(getMessage());
        }
        if (!Pattern.matches("\\w{5,20}", password)) {
            throw new WrongPasswordException(getMessage());
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Повторный пароль не совпадает с вводом первого пароля, повторите попытку");
        }
        System.out.println("Регистрация прошла успешно!\n");
        this.login = login;
        this.password = password;
    }

    public void signIn(String login,String password) throws WrongLoginException {
        System.out.println("Пройдите авторизацию");
        System.out.println("Введите логин:");
        String log = scanner.nextLine();
        System.out.println("Введите пароль:");
        String pas = scanner.nextLine();
        if (!log.equals(login)) {
            throw new WrongLoginException("Не правильно указан логин или пароль");
        }
        if (!pas.equals(password)){
            throw new WrongLoginException("Не правильно указан логин или пароль");
        }
            System.out.println("Авторизация прошла успешно!!!");
    }
}




