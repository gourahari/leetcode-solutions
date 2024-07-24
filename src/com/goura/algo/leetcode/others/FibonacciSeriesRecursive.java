package com.goura.algo.leetcode.others;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesRecursive {
    private List<Integer> fibonacci(int count) {
        int prev = 1, current = 1;
        List<Integer> series = new ArrayList<>();
        fib0(series, count);
        return series;
    }

    private int fib0(List<Integer> series, int n) {
        if (n < 2) {
            return n;
        }
        int result = fib0(series, n-1) + fib0(series, n-2);
        System.out.println(n);
        return result;
    }
    public static void main(String[] args) {
        FibonacciSeriesRecursive fib = new FibonacciSeriesRecursive();
        List<Integer> series = fib.fibonacci(6);
//        for (int i: series) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        series = fib.fibonacci(12);
//        for (int i: series) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
    }
}
