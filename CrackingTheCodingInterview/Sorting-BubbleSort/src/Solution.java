import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Input :
3
3 2 1

Output:
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3
 */
public class Solution {

    public static void bubbleSort(int[] array) {
        int sortCounter = 0;
        boolean isSorted = false;
        int lastUnsorted = array.length-1;
        while (!isSorted) {
            isSorted = true;
            for(int i=0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                    sortCounter++;
                }
            }
            lastUnsorted--;
        }


        System.out.println("Array is sorted in " + sortCounter + " swaps.");
    }

    public static void swap(int[] array, int i, int j) {

        int temp = array[i]; // holds current i
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }
}
