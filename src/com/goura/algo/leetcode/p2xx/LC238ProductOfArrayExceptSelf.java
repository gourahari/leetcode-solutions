package com.goura.algo.leetcode.p2xx;

public class LC238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int p = 1;
        answer[0] = 1;
        for(int i = 0; i < nums.length; i++) {
            answer[i] = p;
            p *= nums[i];
        }

        p = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            answer[i] *= p;
            p *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        LC238ProductOfArrayExceptSelf me = new LC238ProductOfArrayExceptSelf();
        int[] input = new int[] {1, 2, 3, 4};
        int[] output = me.productExceptSelf(input);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }
}
