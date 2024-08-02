package com.goura.algo.leetcode.p0xx;

public class LC44WildcardMatching {
    public boolean isMatch(String s, String p) {
        int i = p.length();
        int j = s.length();
        boolean[][] dp = new boolean[i+1][j+1];
        dp[0][0] = true;
        for (int x = 1; x <= i; x++) {
            dp[x][0] = p.charAt(x-1) == '*'? dp[x-1][0] : false;
        }
        for (int y = 1; y <= j; y++) {
            dp[0][y] = false;
        }
        for (int x = 1; x <= i; x++) {
            boolean asteriskFlag = dp[x-1][0];
            for (int y = 1; y <= j; y++) {
                if (p.charAt(x-1) == '*') {
                    if (asteriskFlag) {
                        dp[x][y] = true;
                    } else {
                        dp[x][y] = dp[x-1][y];
                        asteriskFlag = dp[x][y];
                    }
                } else if (p.charAt(x-1) == s.charAt(y-1) || p.charAt(x-1) == '?') {
                    dp[x][y] = dp[x-1][y-1];
                } else {
                    dp[x][y] = false;
                }
            }
        }
        return dp[p.length()][s.length()];
    }

    public static void main(String[] args) {
        LC44WildcardMatching me = new LC44WildcardMatching();
        System.out.println(me.isMatch("aa", "a")); // false
        System.out.println(me.isMatch("aa", "*")); // true
        System.out.println(me.isMatch("cb", "?a")); // false
        System.out.println(me.isMatch("aab", "c*a*b")); // false
        System.out.println(me.isMatch("adceb", "*a*b")); // true
        System.out.println(me.isMatch("acdcb", "a*c?b")); // false
    }
}
