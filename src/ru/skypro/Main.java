package ru.skypro;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        // Задание1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                num.add(nums.get(i));
            }
        }
        System.out.println("//Задание 1 =  " + num);
//  Задание
        Collections.sort(nums);
        Set<Integer> num2 = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                num2.add(nums.get(i));
            }
        }
        System.out.println("//Задание 2 =  " + num2);


        List<String> str3 = new ArrayList<>(List.of("Код", "должен", "работать",
                "с", "любой", "последовательностью", "и", "объемом", "списка", "слов", "Код", "должен", "работать",
                "с", "любой", "последовательностью", "и", "объемом", "списка", "слов", "Код", "должен", "работать",
                "с", "любой", "последовательностью", "и", "объемом", "списка", "слов"));
        Set<String> result = new HashSet<>();
        result.addAll(str3);

        System.out.println("//Задание 3 =  " + result);


        //Задание 4
        List<String> list = new ArrayList<>(List.of("Код", "должен", "работать",
                "Код", "должен", "работать", "с",
                "Код", "должен", "работать", "с", "любой"));
        HashMap<String, Integer> map = new HashMap<>();
        for (String key : list) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int countKey = 0;
        for (String listKye : map.keySet()) {
            if ((map.get(listKye)) > 1) {
                countKey = countKey + map.get(listKye);
            }
        }
        System.out.println("//Задание 4 =" + countKey);
    }
}