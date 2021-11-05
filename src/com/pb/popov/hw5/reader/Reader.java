package com.pb.popov.hw5.reader;

import com.pb.popov.hw5.book.Book;

public class Reader {

    private String fullName; //ФИО
    private int numberOfTicket; //номер читательского билета
    private String faculty; //факультет
    private String date; //дата рождения
    private String phoneNumber; // номер телефона


    public Reader(String fullName, int numberOfTicket, String faculty, String date, String phoneNumber) {
        this.fullName = fullName;
        this.numberOfTicket = numberOfTicket;
        this.faculty = faculty;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int countBook) {
        System.out.println(fullName + " взял " + countBook + " книги");
    }

    public void takeBook(String... names) {
        System.out.println(fullName + " взял книги: ");
        for (String str : names) {
            System.out.println(str);
        }
    }

    public void takeBook(Book... name) {
        System.out.println(fullName + " взял книги: ");
        for (Book book : name) {
            System.out.println(book);
        }
    }

    public void returnBook(int countBook){
        System.out.println(fullName + " вернул " + countBook + " книги");
    }

    public void returnBook(String... names){
        System.out.println(fullName + " вернул книги: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
    public void returnBook(Book... name){
        System.out.println(fullName + " вернул книги: ");
        for (Book book : name) {
            System.out.println(book);
        }
    }


    @Override
    public String toString() {
        return  "Полное имя: " + fullName + '\n' +
                "Номер читательского билета: " + numberOfTicket + '\n' +
                "Факультет: " + faculty + '\n' +
                "Дата рождения: " + date + '\n' +
                "Телефон: " + phoneNumber + '\n' +
                "-----------------------------------";
    }
}
