import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long countInversions(int[] array) {
        int[] helper = new int[array.length];
        return mergeSort(array, helper, 0,  array.length - 1);
    }

    public static long mergeSort(int[] array, int[] helper, int low, int high) {
        long counter = 0;
        if (low < high) {
            int middle = (low + high)/2;
            counter += mergeSort(array, helper, low, middle); // Sort left half
            counter += mergeSort(array, helper, middle + 1, high); // Sort right half
            counter += merge(array, helper, low, middle, high); // merge them

        }
        return counter;
    }

    public static long merge(int[] array, int[] helper, int low, int middle, int high) {
        long counter = 0;
        /* Copy both halves into a helper array */
        for(int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        /*
            Iterate through helper array.  Compare left and right half,
            copying back the smaller element from the two halves into the
            original array.
         */
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            }
            else{
               counter+= array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        /* Copy the rest of the left side of the array into the target array */
        int remaining = middle - helperLeft;
        for(int i=0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            long result = countInversions(arr);
            System.out.println(result);
        }
        in.close();
    }
}
