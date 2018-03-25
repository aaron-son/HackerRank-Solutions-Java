import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Input: 3
1*2*3 = 6
Output: 6
 */

public class Solution {

    static int factorial(int n) {
        // Complete this function
        int result = 1;
        for(int i=1; i <= n; i++) {
            if (n == 1){
                return 1;
            }
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
