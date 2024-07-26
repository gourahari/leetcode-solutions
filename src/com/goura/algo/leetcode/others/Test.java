package com.goura.algo.leetcode.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 4, 7, 2, 10, 45);
        List<Integer> list2 = Arrays.asList(6, -10, 58, 134, -28);
        List<List<Integer>> list3 = new ArrayList<>();
        list3.add(list1);
        list3.add(list2);
        System.out.println(
                list3.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList())
        );
        // write a program to reverse the words in a sentence.
        String sentence = "This is a test sentence.";

    }
}
