package com.warmup.diagonal_difference;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[][] = new int[n][n];
        int somaL = 0;
        int somaR = 0;

        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
                if(i == j){
                    somaL = somaL + a[i][j];
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                somaR = somaR + a[i][j];
                i++;
            }
        }

        System.out.println(Math.abs(somaL-somaR));

    }
}