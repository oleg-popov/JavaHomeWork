package com.pb.popov.hw8;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
        System.out.println("Пароль не соответствует требованиям. повторите попытку");
    }
}

