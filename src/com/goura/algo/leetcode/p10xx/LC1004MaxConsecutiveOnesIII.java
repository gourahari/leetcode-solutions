package com.goura.algo.leetcode.p10xx;

public class LC1004MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, count = 0, z = 0;

        while(j < nums.length) {
            if (nums[j] == 0) {
                z++;
            }
            if (z <= k) {
                if (count < j-i+1) {
                    count = j-i+1;
                }
            } else {
                if (nums[i] == 0) {
                    z--;
                }
                i++;
            }
            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        LC1004MaxConsecutiveOnesIII me = new LC1004MaxConsecutiveOnesIII();
        System.out.println(me.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(me.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 3));
        System.out.println(me.longestOnes(new int[] {1,0,1,1,0,1,1,0,1,1,1}, 2));
        System.out.println(me.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 2));
    }
}
