package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Задание №1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //Задание №2
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName2);

        //Задание №3
        String s = fullName.replace(" ","; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + s);

        //Задание №4
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);




    }
}
