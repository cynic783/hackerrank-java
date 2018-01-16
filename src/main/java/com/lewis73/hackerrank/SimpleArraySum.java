package com.lewis73.hackerrank;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SimpleArraySum {

    static int simpleArraySum(int n, int[] arr) {
        if (n < 0) {
            throw new IllegalArgumentException("n is negative");
        }
        if (arr.length < n) {
            throw new IllegalArgumentException("array does not contain " + n + " elements");
        }
        if (arr.length > n) {
            throw new IllegalArgumentException("expected array to have " + n + " elements but found " + arr.length + " elements");
        }

        return IntStream.of(arr).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int result = simpleArraySum(n, arr);
        System.out.println(result);
    }
}
