package com.goura.algo.leetcode.p0xx;

public class LC70ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            if (dp[i] == 0) {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        LC70ClimbingStairs obj = new LC70ClimbingStairs();
        System.out.println(obj.climbStairs(2));
        System.out.println(obj.climbStairs(3));
        System.out.println(obj.climbStairs(8));
    }
}
