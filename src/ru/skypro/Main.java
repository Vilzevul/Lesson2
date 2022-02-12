package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] arr = new int[30];
        arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //минимальные и максимальные траты за день.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int maxArray = arr[arr.length - 1];
        int minArray = arr[0];
        System.out.println("Минимальная трата за день = " + minArray + " рублей" + "\nМаксимальная трата за день = " + maxArray + " рублей");

        //вариант второй
        minArray = arr[0];
        maxArray = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArray) minArray = arr[i];
        }

        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1] > maxArray) maxArray = arr[i1];
        }
        System.out.println("Минимальная трата за день = " + minArray + " рублей " + "\nМаксимальная трата за день = " + maxArray + " рублей");

        double middleSum = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleSum + " рублей");

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            a = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - 1 - i] = a;
        }

        System.out.println(Arrays.toString(reverseFullName));


    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    } //random


}


