package com.goura.algo.leetcode.others;

import java.util.List;
import java.util.stream.Stream;

/**
 * - I think, there is a problem in the sample answers.
 * - java DigitCounter 1 35 3,5
 * - 3 should occur 10 times instead of 5 times. The numbers in the series containing 3 are 3, 13, 23, 30, 31, 32, 33, 35
 * - Assumption: I am including both start and end numbers of the series.
 */
public class DigitCounter {
    public static void main(final String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("No sufficient arguments provided!");
        }

        int start, end;
        // Validate that, the first argument must be positive integers. Throw error otherwise.
        try {
            start = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("First argument must be an integer: " + args[0]);
        }

        // Validate that, the second argument must be positive integers. Throw error otherwise.
        try {
            end = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Second argument must be an integer: " + args[1]);
        }

        final int[] counter = new int[10];
        // Validate that, the third argument must be a comma separated stream of integers.
        // And each integer must be greater than zero and less than 10. Throw error otherwise.
        List<Integer> list = Stream.of(args[2].split(","))
                .map(n -> {
                    int i = 0;
                    try {
                        i = Integer.parseInt(n);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException(
                                "Third argument must have digits only with comma separated: " + args[2]
                        );
                    }
                    if (i < 1 || i > 9) {
                        throw new IllegalArgumentException(
                                "Third argument has invalid digits: " + args[2]
                        );
                    }
                    return i;
                })
                // Collect the digits in a list.
                .toList();

        for (int value = start; value <= end; value++) {
            for (int c: list) {
                countDigitOccurenace(value, counter, c);
            }
        }
        for (int i: list) {
            System.out.println(String.format("%d occurs %d time(s).", i, counter[i]));
        }
    }

    private static void countDigitOccurenace(int number, int[] counter, int digit) {
        while (number > 0) {
            if (number % 10 == digit) {
                counter[digit]++;
            }
            number /= 10;
        }
    }
}
