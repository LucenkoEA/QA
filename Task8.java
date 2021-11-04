package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] nums = new int[size];                 // Ввод размера массива
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();              // Ввод значений в массив
        }
        double result = 0;
        for (int i : nums) {
            result += i;
        }
        System.out.print("Значение среднего арифметического равно: " + result / nums.length);
    }
}
