package thirty_days.day0_hello_world;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();

        scan.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}