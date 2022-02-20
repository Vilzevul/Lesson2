package ru.skypro;

import java.util.Arrays;

public class Main {
    public static int printYear(int year) {
        int year4, year100, year400;
        year4 = year % 4;
        year100 = year % 100;
        year400 = year % 400;

        if ((year4 == 0) && ((year100 != 0) || (year400 == 0)))
            System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");
        return year;
    }

    public static int printMobile(int clientDeviceYear, int clientOS) {

        if ((clientDeviceYear >= 2015) && (clientOS == 0))
            System.out.println("Установите приложение для iOs по ссылке");
        else if ((clientDeviceYear < 2015) && (clientOS == 0))
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if ((clientDeviceYear >= 2015) && (clientOS == 1))
            System.out.println("Установите приложение для Android по ссылке");
        else if ((clientDeviceYear < 2015) && (clientOS == 1))
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else System.out.println("Нет такой операционной системы");
        return clientDeviceYear;

    }

    public static int deliveryTime(int deliveryDistance) {

        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: " + 1 + " день");
        else if (deliveryDistance < 60)
            System.out.println("Потребуется дней: " + 2 + " дня");
        else if (deliveryDistance < 100)
            System.out.println("Потребуется дней: " + 3 + " дня");
        else System.out.println("Срок доставки будет увеличен");
        return deliveryDistance;
    }

    public static void stringDuble(String stroka) {

        for (int i = 1; i < stroka.length(); i++) {
            if (stroka.charAt(i - 1) == stroka.charAt(i)) {
                System.out.println("Дублирование " + stroka.charAt(i - 1));
                return;
            }
        }
        System.out.println("Все в порядке");
    }

    public static void massiv(int[] arr) {
        int a;
        for (int i = 0; i < arr.length / 2; i++) {
            a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        printYear(1000);
        printMobile(2015, 1);
        deliveryTime(45);
        stringDuble("abbcdde");

        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        massiv(arr);


    }
}