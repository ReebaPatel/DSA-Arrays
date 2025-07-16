package Easy.CHOCO_DISTR;

import java.util.*;

public class naive2_recursive {

    static int bestDiff;

    public static int minDiffRec(int[] arr, int m) {
        bestDiff = Integer.MAX_VALUE;
        recurse(arr, 0, m, new ArrayList<>());
        return (bestDiff == Integer.MAX_VALUE) ? 0 : bestDiff;
    }

    private static void recurse(int[] arr, int idx, int m, List<Integer> chosen) {
        // If we've selected m elements, evaluate
        if (chosen.size() == m) {
            int min = Collections.min(chosen);
            int max = Collections.max(chosen);
            bestDiff = Math.min(bestDiff, max - min);
            return;
        }
        // If end is reached without enough picks, stop exploring
        if (idx == arr.length)
            return;

        // 1️⃣ Include current packet
        chosen.add(arr[idx]);
        recurse(arr, idx + 1, m, chosen);
        // backtrack
        chosen.remove(chosen.size() - 1);

        // 2️⃣ Exclude current packet
        recurse(arr, idx + 1, m, chosen);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;
        int result = minDiffRec(arr, m);
        System.out.println("Minimum difference is " + result);
        
    }
}
