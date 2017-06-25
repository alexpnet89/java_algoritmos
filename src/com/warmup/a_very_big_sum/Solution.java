package com.warmup.a_very_big_sum;

import java.util.*;

public class Solution {

    private static long aVeryBigSum(int n, long[] ar) {

        long result;
        result = 0;

        for(int i = 0; i < n; i++ ){
            result = result + ar[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantos elementos vai ter o array: ");
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            System.out.println("Digite algum numero: ");
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
