package ru.skypro;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
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
        this.year = year;
    }

    public String toString() {
        return author + " , " + '"' + nameBook + '"' + " , " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, year);
    }
}


