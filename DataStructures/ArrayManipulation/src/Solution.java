import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();



        int[] arr = new int[n];
        for(int a=0; a < arr.length; a++){
            arr[a]= 0;
        }

        for(int a0 = 0; a0 < m; a0++){

            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();

            for(int i=a-1; i<b; i++) {

                arr[i] += k;
            }
        }
        in.close();

        System.out.println(getMaxValue(arr));
    }
}

