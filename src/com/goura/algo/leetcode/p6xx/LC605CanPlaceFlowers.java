package com.goura.algo.leetcode.p6xx;

public class LC605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // A flower can be planted at ith position if and only if both flowerbed[i-1] and flowerbed[i+1] are 0.
        int i = 0;
        while (n > 0 && i < flowerbed.length) {
            if (flowerbed[i] == 0 &&
                    (i-1 < 0 || flowerbed[i-1] == 0) &&
                    (i+1 >= flowerbed.length || flowerbed[i+1] == 0)
            ) {
                flowerbed[i] = 1;
                n--;
            }
            i++;
        }

        return n == 0;
    }

    public static void main(String[] args) {
        LC605CanPlaceFlowers obj = new LC605CanPlaceFlowers();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 3;
        System.out.println(obj.canPlaceFlowers(flowerbed, n));
    }
}
