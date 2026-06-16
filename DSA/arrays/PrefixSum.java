package DSA.arrays;

import java.util.Arrays;

class solu {
    static int[] makeprefixsum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];

        // if (n == 0) {
        //     return pref;
        // }

        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }
}

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
        int[] pref = solu.makeprefixsum(arr);
        System.out.println(Arrays.toString(pref));
    }
}
