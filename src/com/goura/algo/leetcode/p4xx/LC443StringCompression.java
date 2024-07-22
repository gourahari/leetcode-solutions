package com.goura.algo.leetcode.p4xx;

import java.util.Stack;

public class LC443StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        } else if (chars.length == 1) {
            return 1;
        }
        Stack<Integer> st = new Stack<>();
        char lchar = chars[0];
        int count = 1, index = 0;
        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || lchar != chars[i]) {
                chars[index++] = lchar;
                if (count > 1) {
                    int num = count;
                    while (num != 0) {
                        st.push(num % 10);
                        num /= 10;
                    }
                    while (st.size() > 0) {
                        chars[index++] = (char) (st.pop() + 48);
                    }
                }
                count = 1;
                if (i < chars.length) {
                    lchar = chars[i];
                }
            } else {
                count++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        LC443StringCompression me = new LC443StringCompression();
        char[] input = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(me.compress(input));
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
        input = new char[]{'a'};
        System.out.println(me.compress(input));
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
        input = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(me.compress(input));
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}
