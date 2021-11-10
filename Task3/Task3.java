package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите расстояние в сантиметрах: ");
        int cm = in.nextInt();
        double m = cm / 100.0;
        System.out.printf("Расстояние метрах: %.2f \n", m);
        in.close();
    }
}
