package com.lewis73.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        return solveFunctional(a0, a1, a2, b0, b1, b2);
    }

    static int[] solveFunctional(int a0, int a1, int a2, int b0, int b1, int b2){
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

        Stream<List<Integer>> pairs = Stream.of(Arrays.asList(a0, b0), Arrays.asList(a1, b1), Arrays.asList(a2, b2));
        Stream<List<Integer>> pairsCop = Stream.of(Arrays.asList(a0, b0), Arrays.asList(a1, b1), Arrays.asList(a2, b2));
        int scoreA = pairs.reduce(0, (i, l) -> i + l.get(0) > l.get(1) ? 1 : 0, (i, j) -> i + j);
        int scoreB = pairsCop.reduce(0, (i, l) -> i + l.get(1) > l.get(0) ? 1 : 0, (i, j) -> i + j);
        return new int [] {scoreA, scoreB};
    }


    static int[] solveImperative(int a0, int a1, int a2, int b0, int b1, int b2){
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

        int [] a = new int [] {a0, a1, a2};
        int [] b = new int [] {b0, b1, b2};

        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < b.length; i++) {
            if (a[i] > b[i]) {
                aScore++;
            } else if (a[i] < b[i]) {
                bScore++;
            }
        }

        return new int [] {aScore, bScore};
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
