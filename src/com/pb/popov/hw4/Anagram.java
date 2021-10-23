package com.pb.popov.hw4;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Аз есмь строка, живу я, мерой остр.";
        String s2 = "За семь морей ростка я вижу рост.";
        System.out.println(s1);
        System.out.println(s2);
        add(s1, s2);
    }

    static void add(String string1, String string2) {
        String str1 = string1.replaceAll("[^а-яА-Я]", "").toLowerCase();
        String str2 = string2.replaceAll("[^а-яА-Я]", "").toLowerCase();

        char[] arr1 = str1.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    char temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        char[] arr2 = str2.toCharArray();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    char temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }
        String value1 = String.valueOf(arr1);
        String value2 = String.valueOf(arr2);

        if (value1.equals(value2)) {
            System.out.println("Строка №1 - является Анаграммой строки №2");
        } else {
            System.out.println("Строка №1 - не является Анаграммой строки №2");
        }
    }
}
