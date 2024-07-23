package com.goura.algo.leetcode.others;

public class ReverseStringWithPreservingOrder {
    public String reverse(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }
        char[] chars = input.toCharArray();
        int i = 0, j = chars.length-1;
        while (i < j) {
            if (chars[i] < 'A' || (chars[i] > 'Z' && chars[i] < 'a') || chars[i] > 'z') {
                i++;
            } else if (chars[j] < 'A' || (chars[j] > 'Z' && chars[j] < 'a') || chars[j] > 'z') {
                j--;
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseStringWithPreservingOrder me = new ReverseStringWithPreservingOrder();
        System.out.println(me.reverse("I am Java Developer"));
        System.out.println(me.reverse("a,b$c"));
        System.out.println(me.reverse("Ab,c,de!$"));
        System.out.println(me.reverse("a!!!b.c.d,e'f,ghi"));
    }
}
