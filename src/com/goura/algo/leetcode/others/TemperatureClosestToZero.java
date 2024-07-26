package com.goura.algo.leetcode.others;

public class TemperatureClosestToZero {
    private double closestToZero(double data[]) {
        if (data.length == 0) {
            return 0.0;
        }
        double closest = Double.MAX_VALUE;
        for(double d: data) {
            if (Math.abs(d) < Math.abs(closest)) {
                closest = d;
            } else if (Math.abs(d) == Math.abs(closest) && d > closest) {
                closest = d;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        TemperatureClosestToZero me = new TemperatureClosestToZero();
        System.out.println(me.closestToZero(new double[] {7.0, 5.0, 3.0, 2.0, -1.0, -2.0, -3.0, -5.0, -7.0}));
        System.out.println(me.closestToZero(new double[] {7.0, 2.0, -0.4, -1.0, -2.0, 0.4, -5.0, -7.0}));
        System.out.println(me.closestToZero(new double[] {7.0, 5.0, 3.0, 2.0, -1.0, -2.0, -3.0, -5.0, -7.0}));
        System.out.println(me.closestToZero(new double[] {7.0, 3.0, 2.0, -1.0, -2.0, -3.0, -5.0, -7.0, 0.0}));
    }
}
