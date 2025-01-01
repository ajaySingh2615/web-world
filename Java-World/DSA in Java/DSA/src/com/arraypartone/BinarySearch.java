package com.arraypartone;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println(binarySearchAlgo(nums, key));
    }

    public static int binarySearchAlgo(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == key) {
                return mid;
            }

            if (nums[mid] < key) {
                start = mid + 1;
            }

            if (nums[mid] > key) {
                end = mid - 1;
            }
        }

        return -1;
    }
}