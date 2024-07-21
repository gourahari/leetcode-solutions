package com.goura.algo.leetcode.p3xx;

public class LC392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        LC392IsSubsequence me = new LC392IsSubsequence();
        System.out.println(me.isSubsequence("abc", "ahbgdc"));
        System.out.println(me.isSubsequence("axc", "ahbgdc"));
    }
}
