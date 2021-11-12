package com.metanit;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkEnding("abc", "bc")); // True
        System.out.println(checkEnding("abc", "d")); // False
        System.out.println(checkEnding("samurai", "zi")); // False
        System.out.println(checkEnding("feminine", "nine")); // True
        System.out.println(checkEnding("convention", "tio")); // False
    }
    public static boolean checkEnding(String a, String b) {
        return  a.endsWith(b);
    }
}
