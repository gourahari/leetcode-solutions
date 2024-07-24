package com.goura.algo.leetcode.others;

public class PrintPascalTriangle {
    public void printPascalTriangle(int x, int y) {
        for (int i = 1; i <= x; i++) {
            int n = 1;
            System.out.print(" ".repeat(x-i));
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n = n * (i-j)/j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintPascalTriangle obj = new PrintPascalTriangle();
        obj.printPascalTriangle(8, 2);
    }
}
