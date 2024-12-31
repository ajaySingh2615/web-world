package com.arraypartone;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println(linearSearchAlgo(nums, key));

    }

    public static int linearSearchAlgo(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
