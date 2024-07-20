package com.goura.algo.leetcode.p1xx;

public class LC151ReverseWordsInAString {
    public String reverseWords(String s) {
        char[] input = s.toCharArray();
        char[] output = new char[input.length];
        boolean initialized = false;

        int j = input.length - 1;
        int x = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == 32) {
                if (i - 1 < 0 || input[i - 1] != 32) {
                    j = i - 1;
                }
                continue;
            }
            if (i - 1 < 0 || input[i - 1] == 32) {
                if (initialized) {
                    output[x++] = 32;
                }
                System.arraycopy(input, i, output, x, j-i+1);
                initialized = true;
                x += (j - i + 1);
                j = i - 1;
            }
        }
        return new String(output, 0, x);
    }

    public static void main(String[] args) {
        LC151ReverseWordsInAString me = new LC151ReverseWordsInAString();
        System.out.println(String.format("'%s'", me.reverseWords("the sky is blue")));
        System.out.println(String.format("'%s'", me.reverseWords("  hello world  ")));
        System.out.println(String.format("'%s'", me.reverseWords("a good   example")));
    }
}
