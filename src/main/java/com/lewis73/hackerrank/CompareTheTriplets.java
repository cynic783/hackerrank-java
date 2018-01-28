package com.lewis73.hackerrank;

import java.util.*;

public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        if (a0 < 1 || a0 > 100) {
            throw new IllegalArgumentException("values must be in range 1..100");
        }
        if (a1 < 1 || a1 > 100) {
            throw new IllegalArgumentException("values must be in range 1..100");
        }
        if (a2 < 1 || a2 > 100) {
            throw new IllegalArgumentException("values must be in range 1..100");
        }
        if (b0 < 1 || b0 > 100) {
            throw new IllegalArgumentException("values must be in range 1..100");
        }
        if (b1 < 1 || b1 > 100) {
            throw new IllegalArgumentException("values must be in range 1..100");
        }
        if (b2 < 1 || b2 > 100) {
            throw new IllegalArgumentException("values must be in range 1..100");
        }

        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(a0, b0), Arrays.asList(a1, b1), Arrays.asList(a2, b2));
        int scoreA = pairs.stream().reduce(0, (i, l) -> i + (l.get(0) > l.get(1) ? 1 : 0), (i, j) -> i + j);
        int scoreB = pairs.stream().reduce(0, (i, l) -> i + (l.get(1) > l.get(0) ? 1 : 0), (i, j) -> i + j);
        return new int [] {scoreA, scoreB};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }
}
