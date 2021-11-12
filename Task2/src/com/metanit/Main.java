package com.metanit;

public class Main {

    public static void main(String[] args) {
    System.out.println(mathOperations(125, 24, "sum")); // 149
    System.out.println(mathOperations(125, 24, "multiply")); // 3000
    System.out.println(mathOperations(125, 24, "subtract")); // 101
    System.out.println(mathOperations(125, 24, "devide")); //5
    }
    static int mathOperations(int a, int b, String op){
        if (op == "sum") {
            return a + b;
        }
        else if (op == "multiply") {
            return a * b;
        }
        else if (op == "subtract") {
            return a - b;
        }
        else if (op == "devide") {
            return a / b;
        }
        else {
            return 0;
        }
    }
}
