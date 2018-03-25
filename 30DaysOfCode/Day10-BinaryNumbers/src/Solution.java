import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    private static void convertToBinary(int n) {
        int maxConsecutive = 0;
        int key = 0;
        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            if(remainder == 1){
                key++;
                if(key >= maxConsecutive) {
                    maxConsecutive = key;
                }
            }else {
                key = 0;
            }

        }
        System.out.println(maxConsecutive);


//        Stack stack = new Stack();
//        while (n > 0) {
//            int remainder = n % 2;
//            n = n / 2;
//            stack.push(new Integer(remainder));
//        }
//        HashMap<Integer, Integer> oneCounter = new HashMap<Integer, Integer>();
//        int i = 0;
//        int max = 0;
//
//        while (!stack.isEmpty()) {
//            if ((Integer) stack.pop() == 1) {
//                oneCounter.put(i, i++);
//            } else {
//                oneCounter.put(i, i--);
//            }
//        }
//        System.out.println(oneCounter.values());
//        int maxEntry;
//        for (oneCounter.size()entry : oneCounter.values())
//        {
//            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
//            {
//                oneCounter.put(oneCounter.size(),maxEntry);
//            }
//        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        convertToBinary(n);

    }
}
