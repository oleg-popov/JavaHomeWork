package com.pb.popov.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileNumbers {

    public static void main(String[] args) {
        createNumbersFile();
        System.out.println();
        createOddNumbersFile();
    }

    static public void createNumbersFile() {

        Random random = new Random();
        Path path = Paths.get("numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    int n = random.nextInt(99) + 1;
                    String s = Integer.toString(n);
                    writer.write(s + " ");
                    System.out.print(s + " ");
                }
                writer.newLine();
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public void createOddNumbersFile() {
        String line;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("numbers.txt"))) {
            Path path = Paths.get("odd-numbers.txt");
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                while ((line = reader.readLine()) != null) {
                    String[] s1 = line.split(" ");
                    for (String s : s1) {
                        if (Integer.parseInt(s) % 2 == 0) {
                            s = String.valueOf(0);
                        }
                        writer.write(s + " ");
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





