package algorithms.warmup.mini_max_sum;

import java.util.*;

public class Solution {

    private static long[] mostraMinMax(long arr[]){

        long menor = arr[0];
        long maior = arr[0];
        long[] resultado = new long[2];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= menor) {
                resultado[0] = arr[i];
                menor = arr[i];
            }

        }


        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= maior){
                resultado[1] = arr[i];
                maior = arr[i];
            }
        }

        return resultado;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long[] arr_soma = new long[5];
        long soma = 0;

        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        for(int i = 0;i < 5;i++){
            for(int k = 0; k < arr.length; k++){
                if(i != k){
                    soma = soma + arr[k];
                    arr_soma[i] = soma;
                }

            }
            soma = 0;
        }

        long[] result = mostraMinMax(arr_soma);

        for(int i = 0;i < result.length; i++){
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }

    }
}