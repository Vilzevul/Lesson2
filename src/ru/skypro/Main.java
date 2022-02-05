package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Задание №1");
        int a = 0;
        while (a<10) {
            a=a+1;
            System.out.print(a + " ");        }
        System.out.println(" ");
        for (int b = 10;b >= 1; b=b-1) {

            System.out.print( b +" ");        }

        System.out.println("Задача №2");

        for (int friday = 4 ;friday <= 31; friday = friday+7) {
            System.out.println("Сегодня пятница " + friday + " -е число. Необходимо подготовить отчет!");
        }

        System.out.println("Задача №3");

        int year,yearStart = 0,yearLast=0;
        year = 2022;
        int i = 0;
        while (i<year - 200) {
            yearStart = i;
            i +=79;}

        i = 0 ;
        while (i<year+100) {
            i +=79;
            yearLast=i;
        }
        i = yearStart+79;
        while (i<yearLast) {
            System.out.println(i + " ");
            i +=79;

        }

    }
}
