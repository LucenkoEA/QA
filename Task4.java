package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        int sec = in.nextInt();
        int h = sec / 3600;
        int m = (sec % 3600) / 60;
        int s = (sec % 3600) % 60;
        System.out.printf("Полных часов прошло с начала суток: %d \n", h);
        System.out.printf("Полных минут прошло с начала очередного часа: %d \n", m);
        System.out.printf("Полных секунд прошло с начала очередной минуты: %d \n", s);
        in.close();
    }
}
