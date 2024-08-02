package com.goura.algo.leetcode.others;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    /**
     * Write a java console program to
     * #1. Read a list of numbers from a file and print them out.
     * #2. Parse each number as integer and add to a list.
     * #3. Sort the list.
     * #4. Print the list.
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file_with_number.txt"))) {
            List<Double> numbers = br.lines()
                    .filter(e -> !e.trim().isEmpty())
                    .filter(e -> e.matches("\\d+(\\.\\d+)?"))
                    .map(e -> {
                        try {
                            return Double.parseDouble(e);
                        } catch (NumberFormatException ex) {
                            System.err.printf("Invalid number: %s. Returning -1\n", e);
                            return -1.0;
                        }
                    })
                    .collect(Collectors.toList());
            numbers.sort(Double::compareTo);
            System.out.println(numbers);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
