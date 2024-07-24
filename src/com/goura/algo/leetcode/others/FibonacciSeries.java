package com.goura.algo.leetcode.others;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public List<Integer> fibonacci(int count) {
        int prev = 1, current = 1;
        List<Integer> series = new ArrayList<>();
        series.add(prev);
        series.add(current);
        while (count > 2) {
            int temp = prev;
            prev = current;
            current = current + temp;
            series.add(current);
            count--;
        }
        return series;
    }

    public static void main(String[] args) {
        FibonacciSeries fib = new FibonacciSeries();
        List<Integer> series = fib.fibonacci(6);
        for (int i: series) {
            System.out.print(i + " ");
        }
        System.out.println();

        series = fib.fibonacci(12);
        for (int i: series) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
