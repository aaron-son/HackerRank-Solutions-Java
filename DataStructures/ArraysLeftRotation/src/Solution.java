import java.util.Scanner;
import java.util.*;

public class Solution {

    public int[] leftRotation(int arr[], int n , int d){
        int temp[] = new int[n];

        for(int i=0; i < arr.length; ++i){


            temp[(i + (arr.length - d)) % arr.length] = arr[i];
            //temp[((temp.length - d)%temp.length)] = arr[i];

        }

        for(int j=0; j < arr.length; j++){
            arr[j]= temp[j];
        }

        return arr;
    }

    public void printArr(int arr[]){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        Solution rotate = new Solution();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int d = in.nextInt();

        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Arrays.stream(arr).forEach(System.out::println);


        rotate.leftRotation(a, n, d);
        rotate.printArr(a);



    }
}
