package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num_1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num_2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num_3 = in.nextInt();
        if (num_1 > num_2 & num_1 > num_3) {
            System.out.println("Наибольшее число: " + num_1);
        }
        else if (num_2 > num_1 & num_2 > num_3) {
            System.out.println("Наибольшее число: " + num_2);
        }
        else if (num_3 > num_1 & num_3 > num_2) {
            System.out.println("Наибольшее число: " + num_3);
        }
    }
}
