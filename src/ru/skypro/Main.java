package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	
        int [] array = new int [3];
        array [0] = 1;
        array[1] =2;
        array[2] = 3;

        float [] arr = {1.57f, 7.654f, 9.986f};

        System.out.println(" ");
        int [] arrow = {5,10,15,20,25,30};

        System.out.println("Задача 2");
        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);

        for (int i = 0; i < arr.length - 1; i++) {
        System.out.print(arr[i] + ", ");}
        System.out.println(arr[arr.length-1]);

        for (int c = 0; c < arrow.length-1; c++) {
            System.out.print(arrow[c] + ", ");}
        System.out.println(arrow[arrow.length-1]);


        System.out.println(" 3 ЗАДАНИЕ");

        System.out.println(array[2]+", "+array[1]+", "+array[0]);

        for (int i = arr.length-1; i >0; i--) {
            System.out.print(arr[i] + ", ");}
        System.out.println(arr[0]);

        for (int i = arrow.length-1; i>0; i--) {
            System.out.print(arrow[i] + ", ");
        }
        System.out.println(arrow[0]);

        System.out.println("Задача 4");

        for (int i =0; i < array.length; i++) {
           if (array[i] % 2 != 0)
           array[i] = array[i] + 1;
           System.out.print(array[i] + " ");

        }


    }

}
