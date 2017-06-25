package com.exercicios.compare_the_triplets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function

        int pontosA = 0;
        int pontosB = 0;

        int arA[] = new int[3];
        int arB[] = new int[3];
        int resultado[] = new int[2];
        int n = 3;

        arA[0] = a0;
        arA[1] = a1;
        arA[2] = a2;

        arB[0] = b0;
        arB[1] = b1;
        arB[2] = b2;

        for(int i = 0; i < n; i++){
            if(arA[i] > arB[i]){
                pontosA++;
            }else if(arA[i] < arB[i]){
                pontosB++;
            }
        }

        resultado[0] = pontosA;
        resultado[1] = pontosB;

        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota do criterio 1 para o participante 1: ");
        int a0 = in.nextInt();
        System.out.println("Digite a nota do criterio 2 para o participante 1: ");
        int a1 = in.nextInt();
        System.out.println("Digite a nota do criterio 3 para o participante 1: ");
        int a2 = in.nextInt();
        System.out.println("Digite a nota do criterio 1 para o participante 2: ");
        int b0 = in.nextInt();
        System.out.println("Digite a nota do criterio 2 para o participante 2: ");
        int b1 = in.nextInt();
        System.out.println("Digite a nota do criterio 3 para o participante 2: ");
        int b2 = in.nextInt();

        int[] result = solve(a0, a1, a2, b0, b1, b2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }

        System.out.println("");
    }
}
