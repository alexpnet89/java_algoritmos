package com.exercicios.simple_array_sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int simpleArraySum(int n, int[] ar) {

        int resultado;
        resultado = 0;

        for(int i = 0; i < n; i++){
            resultado = resultado + ar[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos do array: ");
        int n = in.nextInt();

        int[] ar = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            ar[i] = in.nextInt();
        }

        int result = simpleArraySum(n, ar);

        System.out.println(result);
    }
}