package com.pb.popov.hw4;

import java.util.Arrays;

public class CapitalLetter {
    public static void main(String[] args) {
        String str = "Истина - это то, что выдерживает проверку опытом. Эйнштейн А.";
        System.out.println(str);
        upperCase(str);
    }

    static void upperCase(String string) {
        String[] words = string.split("\\s");

        for (int i = 0; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
