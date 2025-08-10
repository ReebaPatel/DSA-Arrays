package Medium.FINDSUMPAIR;

import java.util.HashSet;

// import Easy.FIND_DUPES.hashset;

public class naivehashset {
    static boolean findpair(int[] arr, int target) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (hs.contains(diff)) {
                return true;
            } else {
                hs.add(arr[i]);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int target = 16;
        System.out.println(findpair(arr, target));
    }
}
