package com.metanit;

public class Main {

    public static void main(String[] args) {
        move("hello");
        move("bye");
        move("welcome");
    }

    public static void move(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(++ch[i]);
        }
    }
}
