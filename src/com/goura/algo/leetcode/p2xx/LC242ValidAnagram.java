package com.goura.algo.leetcode.p2xx;

import java.util.Arrays;

public class LC242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] counter = new int[26];
        for (char c: s.toCharArray()) {
            counter[c - 97]++;
        }
        for (char c: t.toCharArray()) {
            counter[c - 97]--;
        }
        return Arrays.stream(counter)
                .filter(i -> i != 0)
                .count() == 0;
    }

    public static void main(String[] args) {
        LC242ValidAnagram me = new LC242ValidAnagram();
        System.out.println(me.isAnagram("anagram", "nagaram"));
        System.out.println(me.isAnagram("rat", "car"));
    }
}