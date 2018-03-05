import java.io.*;
import java.util.*;

public class Solution {

//    int rows = matrix.length;
//    int cols = matrix[0].length;  // assuming rows >= 1



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int[][] A = {   {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0 ,0 ,0},
                        {1, 1, 1, 0 ,0 ,0},
                        {0, 0, 0, 0 ,0 ,0},
                        {0, 0, 0, 0 ,0 ,0},
                        {0, 0, 0, 0 ,0 ,0}  };



        int counter = 0;

        int maxX = 3;
        int maxY = 3;

        for





        for(int y=0; y <= maxY + (A.length%3); y++){
            for(int x=0; x <= maxX + (A[0].length % 3); x++) {
                counter += A[y][x] + A[y][x+1]+ A[y][x+2];
            }
        }

        System.out.println(counter);
    }
}