package com.arraypartone;

public class PairsAnArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        pairsInArrayAlgo(nums);
    }

    public static void pairsInArrayAlgo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
}
