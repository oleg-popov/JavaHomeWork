package com.pb.popov.hw8;

public class WrongLoginException extends Exception{

    public WrongLoginException(String message) {
        super(message);
        System.out.println("Логин не соответствует требованиям. повторите попытку");
    }

    public WrongLoginException() {
    }
}
