package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня недели от 1 до 7: ");
        int day = in.nextInt();
        if (day == 1)
            System.out.print("День недели: Понедельник");
        else if (day == 2)
            System.out.print("День недели: Вторник");
        else if (day == 3)
            System.out.print("День недели: Среда");
        else if (day == 4)
            System.out.print("День недели: Четверг");
        else if (day == 5)
            System.out.print("День недели: Пятница");
        else if (day == 6)
            System.out.print("День недели: Суббота");
       else if (day == 7)
            System.out.print("День недели: Воскресенье");
    }
}
