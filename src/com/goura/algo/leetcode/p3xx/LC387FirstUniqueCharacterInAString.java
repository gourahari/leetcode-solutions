package com.goura.algo.leetcode.p3xx;

public class LC387FirstUniqueCharacterInAString {
    public int firstUniqeChar(String s) {
        int[] chars = new int[26];
        int index = -1;
        char[] arr = s.toCharArray();
        for (char c: arr) {
            chars[c - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (chars[arr[i] - 'a'] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        LC387FirstUniqueCharacterInAString obj = new LC387FirstUniqueCharacterInAString();
        System.out.println(obj.firstUniqeChar("leetcode"));
        System.out.println(obj.firstUniqeChar("ajax"));
        System.out.println(obj.firstUniqeChar("loveleetcode"));
        System.out.println(obj.firstUniqeChar("aabb"));
    }
}
