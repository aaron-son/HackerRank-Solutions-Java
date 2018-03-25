import java.io.*;
import java.util.*;

public class Solution {

//    public void printCharArr (){
//
//        for(int i=0; i < T;i++) {
//            char[] charArr = arr[i].toChar
//        }
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int charArr[];

        int T = input.nextInt();

        String arr[] = new String[T];

        for(int i=0; i < T;i++) {
            arr[i] = input.next();
            char[] myCharArray = arr[i].toCharArray();
            for(int j=0; j < myCharArray.length; j++){
                if(j%2==0){
                    System.out.print(myCharArray[j]);
                }
            }
            System.out.print(" ");

            for(int j=0; j < myCharArray.length; j++){
                if(j%2==1){

                    System.out.print(myCharArray[j]);
                }
            }
            System.out.println();
        }
//
//        for(int j=0; j < arr.length; j++){
//            System.out.print(arr[j].toCharArray().length%2);
//            System.out.print(arr[j].toCharArray().length%3);
//        }



    }
}