package com.lewis73.hackerrank;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.LongStream;

public class AVeryBigSum {

    static long solve(long[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("array must not be empty");
        }
        if (LongStream.of(arr).anyMatch(v -> v < 0 || v > 10_000_000_000L)) {
            throw new IllegalArgumentException("elements must be between 0 and 10^10, inclusive");
        }

        return Arrays.stream(arr).boxed().map(BigInteger::valueOf).reduce(BigInteger.ZERO, BigInteger::add).longValueExact();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextLong();
        }
        long result = solve(arr);
        System.out.println(result);
    }
}
