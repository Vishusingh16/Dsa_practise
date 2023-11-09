package Array;

import java.util.*;

public class AverageTemp2 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int numDays = sc.nextInt();
        int[] temp = new int[numDays];
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter temperature on day " + (i + 1) + ": ");
            temp[i] = sc.nextInt();
            sum += temp[i];
        }
        double average = (double) (sum / numDays);
        int above = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(above + " days above average");
    }
}
