package warmup.staircase;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int contador = n;

        while(contador > 0){
            for(int j = 0;j < n; j++){

                if(j+1 >= contador){
                    System.out.printf("%s","#");
                }else{
                    System.out.printf("%s"," ");
                }

            }
            System.out.printf("%s%n","");
            contador --;
        }


    }

}