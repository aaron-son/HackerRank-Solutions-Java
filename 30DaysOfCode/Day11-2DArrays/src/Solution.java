import java.util.*;

public class Solution {

    public static void calculateHourglass(int[][] arr){
        int solution = 0;
        int counter = 0;
        int arrOfSums[] = new int[16];

        for(int i=0; i < 4; i++) {
            for (int j=0; j < 4; j++) {
                arrOfSums[counter] =    arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                                        arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] +
                                        arr[i+2][j+2];
                counter++;
            }
        }
        Arrays.sort(arrOfSums);
        System.out.println(arrOfSums[15]);

    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        calculateHourglass(arr);

    }
}
