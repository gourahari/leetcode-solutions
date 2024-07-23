package com.goura.algo.leetcode.others;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeFactors {
    public List<Integer> findFactors(int num) {
        if (num < 2) {
            return new ArrayList<>();
        }
        List<Integer> factors = new ArrayList<>();
         int limit = (int)Math.sqrt(num);
        for (int i = 2; i < limit; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        if (num > 2) {
            factors.add(num);
        }
        return factors;
    }

    public static void main(String[] args) {
        FindPrimeFactors me = new FindPrimeFactors();
        List<Integer> factors = me.findFactors(76);
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i) + " ");
        }
        System.out.println();
    }
}
