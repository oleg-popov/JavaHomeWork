package com.pb.popov.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 любых чисел:");
        int []arr = new int[10];
        int n;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            n = scanner.nextInt();
            arr[i] = n;
            sum += n;
        }
        System.out.println("Массив чисел которые вы ввели: " + Arrays.toString(arr));
        System.out.println("Сумма чисел массива = " + sum);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
