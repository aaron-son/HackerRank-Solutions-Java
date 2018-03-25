//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;


/*
Input:
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

Output:
sam=99912222
Not found
harry=12299933
 */
class Solution{

    public static void main(String []argh){
        HashMap<String, Integer> phoneBook = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            phoneBook.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.get(s) == null){
                System.out.println("Not found");
            }
            else {
                System.out.println(s + "=" + phoneBook.get(s));
            }


        }
        in.close();
    }
}
