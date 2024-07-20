package com.goura.algo.leetcode.p3xx;

public class LC345ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int start = 0, end = s.length()-1;
        char[] output = new char[s.length()];

        while (start <= end) {
            if (!isVowel(s.charAt(start))) {
                output[start] = s.charAt(start);
                start++;
                continue;
            } else if (!isVowel(s.charAt(end))) {
                output[end] = s.charAt(end);
                end--;
                continue;
            } else {
                output[start] = s.charAt(end);
                output[end] = s.charAt(start);
                start++;
                end--;
                continue;
            }
        }

        return new String(output);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
    }
     public static void main(String[] args) {
         LC345ReverseVowelsOfAString me = new LC345ReverseVowelsOfAString();
         System.out.println(String.format("'%s'", me.reverseVowels("hello")));
         System.out.println(String.format("'%s'", me.reverseVowels("leetcode")));
         System.out.println(String.format("'%s'", me.reverseVowels("aA")));
     }
}
