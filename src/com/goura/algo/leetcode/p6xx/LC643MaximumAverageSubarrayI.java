package com.goura.algo.leetcode.p6xx;

public class LC643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            return 0.0;
        }

        double msum = 0.0, lsum = 0.0;
        for (int i = 0; i < k; i++) {
            lsum += nums[i];
        }
        msum = lsum;

        int l = 1, r = k;
        while (r < nums.length) {
            lsum = lsum + nums[r] - nums[l-1];
            msum = (msum < lsum)? lsum : msum;
            l++;
            r++;
        }

        return msum/k;
    }

    public static void main(String[] args) {
        LC643MaximumAverageSubarrayI me = new LC643MaximumAverageSubarrayI();
        System.out.println(me.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        System.out.println(me.findMaxAverage(new int[] {5}, 1));
        System.out.println(me.findMaxAverage(new int[] {0,4,0,3,2}, 1));
    }
}
