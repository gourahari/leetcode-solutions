package com.goura.algo.leetcode.p17xx;

public class LC1768MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] chars = new char[word1.length() + word2.length()];
        int i = 0, j = 0, x = 0;

        while (i < word1.length() && j < word2.length()) {
            chars[x++] = word1.charAt(i++);
            chars[x++] = word2.charAt(j++);
        }

        if (i < word1.length()) {
            System.arraycopy(
                    word1.toCharArray(), i, chars, x,
                    word1.length() - i
            );
        } else if (j < word2.length()) {
            System.arraycopy(
                    word2.toCharArray(), j, chars, x,
                    word2.length() - j
            );
        }
        return new String(chars);
    }
     public static void main(String[] args) {
         LC1768MergeStringsAlternately obj = new LC1768MergeStringsAlternately();
         String word1 = "abc";
         String word2 = "pqr";
         System.out.println(obj.mergeAlternately(word1, word2));
     }

}
