package com.goura.algo.leetcode.p2xx;

public class LC204CountPrimes {
    public int countPrimes(int n) {
        if (n<2) return 0;
        boolean[] flags = new boolean[n];
        int limit = (int)Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            // Check if flags[i] is true, set all the multiples of it also true.
            // start from i^2 and each ith number will be non-prime.
            if (!flags[i]) {
                for (int j = i*i; j < n; j += i) {
                    flags[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!flags[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LC204CountPrimes me = new LC204CountPrimes();
        System.out.println(me.countPrimes(10));
        System.out.println(me.countPrimes(0));
        System.out.println(me.countPrimes(1));
        System.out.println(me.countPrimes(2));
        System.out.println(me.countPrimes(3));
        System.out.println(me.countPrimes(4));
        System.out.println(me.countPrimes(5));
        System.out.println(me.countPrimes(6));
        System.out.println(me.countPrimes(7));
        System.out.println(me.countPrimes(8));
        System.out.println(me.countPrimes(9));
        System.out.println(me.countPrimes(100));
    }
}
