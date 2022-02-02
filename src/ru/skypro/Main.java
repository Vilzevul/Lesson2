package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Задание №1");
        int clientOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию для Android по ссылке");

        System.out.println("Задание №2");
        System.out.println("Вариант 1");

        int clientDeviceYear;
        clientDeviceYear = 2001;
        clientOS = 8;
        if (clientDeviceYear <= 2015) {
            if (clientOS == 0)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0)
                System.out.println("Установите приложение для iOs по ссылке");
            else System.out.println("Установите приложение для Android по ссылке");
        }


        System.out.println("Вариант 2");
        if ((clientDeviceYear >= 2015) && (clientOS == 0))
            System.out.println("Установите приложение для iOs по ссылке");
        else if ((clientDeviceYear < 2015) && (clientOS == 0))
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if ((clientDeviceYear >= 2015) && (clientOS == 1))
            System.out.println("Установите приложение для Android по ссылке");
        else if ((clientDeviceYear < 2015) && (clientOS == 1))
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else System.out.println("Нет такой операционной системы");

        System.out.println("Задание №3");
        int year;
        year = 800;
        int year4, year100, year400;
        year4 = year % 4;
        year100 = year % 100;
        year400 = year % 400;

        if ((year4 == 0) && ((year100 != 0) || (year400 == 0)))
            System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");


        System.out.println("Задание №4");

        int deliveryDistance = 130;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: " + 1 + " день");
        else if (deliveryDistance < 60)
            System.out.println("Потребуется дней: " + 2 + " дня");
        else if (deliveryDistance < 100)
            System.out.println("Потребуется дней: " + 3 + " дня");
        else System.out.println("Срок доставки будет увеличен");

        System.out.println("Задание №5");

        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
