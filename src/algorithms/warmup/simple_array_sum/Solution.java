package algorithms.warmup.simple_array_sum;

import java.util.*;

public class Solution {

    private static int simpleArraySum(int n, int[] ar) {

        int resultado;
        resultado = 0;

        for(int i = 0; i < n; i++){
            resultado = resultado + ar[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ar = new int[n];

        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }

        int result = simpleArraySum(n, ar);

        System.out.println(result);
    }
}