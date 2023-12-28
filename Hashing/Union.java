package Hashing;

import java.util.HashSet;
import java.util.Set;

public class Union {

    public static int doUnion(int[] a, int[] b, int n, int m) {
        Set<Integer> unionSet = new HashSet<>();

        for (int i : a) {
            unionSet.add(i);
        }

        for (int i : b) {
            unionSet.add(i);
        }

        return unionSet.size();
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 4, 5, 6, 7, 8 };

        int unionSize = doUnion(a, b, a.length, b.length);

        System.out.println("Number of elements in the union: " + unionSize);
    }
}
