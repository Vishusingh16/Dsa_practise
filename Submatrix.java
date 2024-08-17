package companypractice;

import java.util.*;

import Oops.Person.main;

public class Submatrix {
    public static int separate(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);

            }

        }
        Collections.sort(even);
        Collections.sort(odd);
        if (even.size() >= 2 && odd.size() >= 2) {
            int evenList = even.get(even.size() - 2);
            int oddList = odd.get(odd.size() - 2);
            int sum = evenList + oddList;
            return sum;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] += sc.nextInt();

        }
        int result = separate(arr);
        System.out.println(result);
        sc.close();
    }

}
