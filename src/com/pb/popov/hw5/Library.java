package com.pb.popov.hw5;

import com.pb.popov.hw5.book.Book;
import com.pb.popov.hw5.reader.Reader;

public class Library {
    public static void main(String[] args) {
        Reader reader = new Reader("Богданов А.Н.", 52, "Юридический", "1982-11-29", "0504445566");
        System.out.println(reader);

        reader.returnBook(3);
        System.out.println("----------------------------------");

        reader.returnBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println("-----------------------------------");

        reader.returnBook(new Book("Приключения", "Иванов И. И.", "2000 г."),
                         new Book("Словарь", "Сидоров А. В", "1980 г."),
                        new Book("Энциклопедия ", "Гусев К. В.", "2010 г."));
        System.out.println("-----------------------------------");

        Reader reader2 = new Reader("Петров В.В.", 27, "Экономический", "1990-05-22", "0631231212");
        System.out.println(reader2);

        reader2.takeBook(3);
        System.out.println("----------------------------------");

        reader2.takeBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println("-----------------------------------");

        Book[] books = new Book[3];
        books[0] = new Book("Приключения", "Иванов И. И.", "2000 г.");
        books[1] = new Book("Словарь", "Сидоров А. В", "1980 г.");
        books[2] = new Book("Энциклопедия ", "Гусев К. В.", "2010 г.");
        reader2.takeBook(books);
        System.out.println("-----------------------------------");


    }
}
