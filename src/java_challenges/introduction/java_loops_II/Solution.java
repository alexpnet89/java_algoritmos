package java_challenges.introduction.java_loops_II;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int i = 0; i < t; i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int loop = a;

            for(int j = 0; j < n; j++){
                loop = loop + ((int)Math.pow(2,j) * b);
                System.out.printf("%d ",loop);
            }

            System.out.printf("%n","");

        }

        in.close();
    }
}