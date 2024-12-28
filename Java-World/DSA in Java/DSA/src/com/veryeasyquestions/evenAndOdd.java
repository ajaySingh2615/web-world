package com.veryeasyquestions;

import java.util.Scanner;

public class evenAndOdd {
    public static void main(String[] args) {
        // Write a program to check if a number is odd or even.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " is a even number");
        } else {
            System.out.println(a + " is a odd number");
        }
    }
}
