package algorithms.warmup.birthday_cake_candles;

import java.util.*;

public class Solution {

    private static int birthdayCakeCandles(int n, int[] ar) {

        int height = ar[0];
        int soma = 0;

        for(int i = 0; i < ar.length; i++){
            if(ar[i] > height){
                height = ar[i];
            }
        }

        for(int i = 0; i < ar.length; i++){
            if(ar[i] == height){
                soma++;
            }
        }

        return soma;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }

        birthdayCakeCandles(n, ar);

        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
