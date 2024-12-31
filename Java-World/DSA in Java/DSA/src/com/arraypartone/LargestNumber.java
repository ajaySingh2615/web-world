package com.arraypartone;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = {40, 200, 3, 4, 5};

        System.out.println(largestNumberAlgo(nums));
        System.out.println(largestNumberAlgo(nums2));

    }

    public static int largestNumberAlgo(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
