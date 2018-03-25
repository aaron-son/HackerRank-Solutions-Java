import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int taxCalculation(double meal_cost, int tip_percent, double tax_percent){


        double tip = meal_cost * tip_percent/100;
        double tax = meal_cost * tax_percent/100;
        double totalCost = Math.round(meal_cost + tip + tax);

        return totalCost;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();

        System.out.println("The total meal cost is " + (int)Solution.taxCalculation(meal_cost, tip_percent, tax_percent) + " dollars.");
    }
}