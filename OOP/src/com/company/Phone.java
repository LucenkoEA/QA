package com.company;

public class Phone {
    public int number;
    public int model;
    public int weight;

    public void receiveCall (String name) {
        System.out.print("Звонит " + name + " ");
    }
    public void getNumber (long num) {
        System.out.println(num);
    }
    public Phone (int n, int m, int w) {
        number = n;
        model = m;
        weight = w;
    }
    public void receiveCall (String name, long num) {
        System.out.println("Звонит " + name + " " + num);
    }
}


