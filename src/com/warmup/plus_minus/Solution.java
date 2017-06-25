package com.warmup.plus_minus;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos do array: ");
        int n = in.nextInt();
        int arr[] = new int[n];

        float positivo = 0;
        float negativo = 0;
        float zero = 0;

        for(int arr_i=0; arr_i < n; arr_i++){
            System.out.println("Digite o numero para completar os elementos do array: ");
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] > 0){
                positivo++;
            }
            if(arr[arr_i] < 0){
                negativo++;
            }

            if(arr[arr_i] == 0){
                zero++;
            }
        }

        System.out.println(positivo/arr.length);
        System.out.println(negativo/arr.length);
        System.out.println(zero/arr.length);

    }
}