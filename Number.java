package com.example;

public class Number {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int testNumber = 6;
        if (isEven(testNumber)) {
            System.out.println(testNumber + " is even.");
        } else {
            System.out.println(testNumber + " is odd.");
        }
    }
}
