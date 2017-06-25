package com.exercicios.solve_me_first;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int solveMeFirst(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        System.out.println("Digite o primeiro numero da soma: ");
        a = in.nextInt();

        int b;
        System.out.println("Digite o primeiro segundo da soma: ");
        b = in.nextInt();

        int sum;
        sum = solveMeFirst(a, b);
        System.out.println("A soma ficou: " + sum);
    }
}