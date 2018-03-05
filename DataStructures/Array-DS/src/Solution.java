import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] A = new int[n];

//        int n = 4;
//        int[] A = {1, 4, 3, 2};

        for(int i=0; i < A.length; i++){
            A[i] = in.nextInt();
        }
        for(int j=0; j < A.length; j++){
            System.out.print(A[A.length-1 - j] + " ");
        }

    }
}