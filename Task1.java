package com.metanit;

public class Main {

    public static void main(String[] args) {
	System.out.println(sumOfTwoNumbers(3, 2)); //5
    System.out.println(sumOfTwoNumbers(-3, -6)); //-9
    System.out.println(sumOfTwoNumbers(7, 3)); //10
    }
    static int sumOfTwoNumbers(int a, int b){
        return a + b;
    }
}
