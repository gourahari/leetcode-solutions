package com.goura.algo.leetcode.p2xx;

public class LC283MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int i = 0, j = 1, temp = 0;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != 0) {
                i++;
                j++;
            } else if (nums[j] == 0) {
                j++;
            } else {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        LC283MoveZeroes me = new LC283MoveZeroes();
        int[] input = new int[] {0, 1, 0, 3, 12};
        me.moveZeroes(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}
