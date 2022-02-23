package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author writer1 = new Author("Федор", "Достоевский");
        Author writer2 = new Author("Александр", "Пушкин");
        Author writer3 = new Author("Стивен", "Кинг");

        Book book1 = new Book("Идиот", writer1, 1985);
        Book book11 = new Book("Преступление и наказание", writer1, 1955);
        Book book2 = new Book("Евгений Онегин", writer2, 2003);
        Book book22 = new Book("Капитанская дочка", writer2, 1905);
        Book book3 = new Book("1408", writer3, 2001);
        Book book33 = new Book("Кристина", writer3, 1998);

        System.out.println(book1);
        System.out.println(book11);
        System.out.println(book2);
        System.out.println(book22);
        System.out.println(book3);
        System.out.println(book33);
        System.out.println("________");

        book3.setYear(2015);
        System.out.println(book3);
        System.out.println("Вариант 2");
        Book[] kniga = new Book[]{book1, book11, book2, book22, book3, book33};
        for (Book knizhka : kniga) {
            System.out.println(knizhka);
        }

    }
}
