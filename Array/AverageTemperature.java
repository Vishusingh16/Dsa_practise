package Array;

import java.util.*;

class AverageTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDays = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the number of days:");
        for (int i = 1; i <= numDays; i++) {
            System.out.println("Day" + i + "'s Temperature ");
            int next = sc.nextInt();
            sum += next;
        }
        double AverageTemperature = sum / numDays;
        System.out.println("Average temperature is " + AverageTemperature);
    }
}
