package com.arraypartone;

public class SubArrays {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        subArraysAlgo(nums);
    }

    public static void subArraysAlgo(int[] arr) {
        int ts = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("The total sub arrays " + ts);
    }
}
