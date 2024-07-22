package com.goura.algo.leetcode.p0xx;

public class LC11ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int amount = 0, camount = 0;
        while (i < j) {
            camount = (height[i] < height[j]? height[i] : height[j]) * (j-i);
            amount = (amount < camount)? camount : amount;
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        LC11ContainerWithMostWater me = new LC11ContainerWithMostWater();
        System.out.println(me.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(me.maxArea(new int[] {1,1}));
        System.out.println(me.maxArea(new int[] {4,3,2,1,4}));
        System.out.println(me.maxArea(new int[] {1,2,1}));
    }
}
