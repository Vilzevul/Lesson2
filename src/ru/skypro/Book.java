package ru.skypro;

public class Book {
    private String nameBook;
    Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.nameBook = name;
        this.year = year;
        this.author = author;
    }

    public String name() {
        return nameBook;
    }

    public String getName() {
        return nameBook;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1980 || year > 2021) {
            this.year = year;
        }
    }
    public String toString() {
        return author + " " + '"'+nameBook+'"'+ " " + year;
    }
}


