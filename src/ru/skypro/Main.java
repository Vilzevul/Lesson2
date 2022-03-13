package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValue2(Integer value) {
        value = 22;
    }

    public static void changeValue3(Integer[] value) {
        value = new Integer[]{1, 2};

    }

    public static void changeValue4(Integer[] value) {
        value[0] = 99;
        value[1] = 98;

    }

    public static void main(String[] args) {
        //int value = 33;
        //Integer value1 = 33;
        // changeValue(value);
        // System.out.println(value);
        //changeValue2(value1);
        //System.out.println(value1);


//        Integer[] value1 = {3, 4};
//
//        changeValue3(value1);
//        System.out.println(Arrays.toString(value1));
//
//        changeValue4(value1);
//        System.out.println(Arrays.toString(value1));


        Person person = new Person();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        System.out.println(person);
        person.changePerson(person);
        System.out.println(person);

    }
}
