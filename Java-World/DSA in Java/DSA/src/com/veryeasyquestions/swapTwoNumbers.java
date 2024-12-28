package com.veryeasyquestions;

public class swapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);

//        int temp = a;
//        a = b;
//        b = temp;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
