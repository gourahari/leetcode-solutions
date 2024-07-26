package com.goura.algo.leetcode.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    private List<List<String>> group(String[] input) {
        if (input.length < 1) {
            return new ArrayList<>();
        }
        List<List<String>> result = new ArrayList<>();
        char[] arr = new char[26];
        boolean[] visited = new boolean[input.length];
        for (int i = 0; i < input.length; i++) {
            for (char c: input[0].toCharArray()) {
                arr[c - 'a']++;
            }
        }
        return result;
    }

    private boolean check(char[] arr, String s) {
        for (char c: s.toCharArray()) {
            if (arr[c - 'a'] == 0) {
                return false;
            } else {
                arr[c - 'a']--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Test");
    }
}
