package com.company;

public class Main {

    public static void main(String[] args) {
        Phone Phone1 = new Phone (111, 236, 300);
        Phone1.receiveCall("Евгений", 89189764535L);
        System.out.println("Номер телефона: " + Phone1.number);
        System.out.println("Модель телефона: " + Phone1.model);
        System.out.println("Вес телефона: " + Phone1.weight);

        Phone Phone2 = new Phone (222, 166, 350);
        Phone1.receiveCall("Денис", 89891256489L);
        System.out.println("Номер телефона: " + Phone2.number);
        System.out.println("Модель телефона: " + Phone2.model);
        System.out.println("Вес телефона: " + Phone2.weight);

        Phone Phone3 = new Phone(333, 211, 250);
        Phone1.receiveCall("Владислав", 89286547125L);
        System.out.println("Номер телефона: " + Phone3.number);
        System.out.println("Модель телефона: " + Phone3.model);
        System.out.println("Вес телефона: " + Phone3.weight);
    }
}

