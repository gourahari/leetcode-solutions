package com.goura.algo.leetcode.p14xx;

import java.util.ArrayList;
import java.util.List;

public class LC1431KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        // Find the maximum number;
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] >= max - extraCandies);
        }
        return result;
    }

    public static void main(String[] args) {
        LC1431KidsWithTheGreatestNumberOfCandies obj = new LC1431KidsWithTheGreatestNumberOfCandies();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(obj.kidsWithCandies(candies, extraCandies));
    }
}
