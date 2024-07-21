package com.goura.algo.leetcode.p14xx;

public class LC1456MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        if (k > s.length()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        if (count == k) {
            return count;
        }
        int ans = count;
        int i = 1, j = k;
        while (count < k && j < s.length()) {
            if (!isVowel(s.charAt(i-1)) && isVowel(s.charAt(j))) {
                count++;
            } else if (isVowel(s.charAt(i-1)) && !isVowel(s.charAt(j))) {
                count--;
            }
            if (ans < count) {
                ans = count;
            }
            i++;
            j++;
        }
        return ans;
    }
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        LC1456MaximumNumberOfVowelsInASubstringOfGivenLength me = new LC1456MaximumNumberOfVowelsInASubstringOfGivenLength();
        System.out.println(me.maxVowels("abciiidef", 3));
        System.out.println(me.maxVowels("aeiou", 2));
        System.out.println(me.maxVowels("leetcode", 3));
        System.out.println(me.maxVowels("rhythms", 4));
        System.out.println(me.maxVowels("tryhard", 4));
    }
}
