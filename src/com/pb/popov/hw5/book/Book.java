package com.pb.popov.hw5.book;

public class Book {
    private String name;
    private String  avtorBook;
    private String  yearOfPublishing;

    public Book(String name, String avtorBook, String yearOfPublishing) {
        this.name = name;
        this.avtorBook = avtorBook;
        this.yearOfPublishing = yearOfPublishing;
    }


    @Override
    public String toString() {
        return name + "(" + avtorBook + " " + yearOfPublishing + ")";
    }
}
