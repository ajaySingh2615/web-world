package com.arraypartone;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        reverseAnArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverseAnArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
